
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 项目进度
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/xiangmujindu")
public class XiangmujinduController {
    private static final Logger logger = LoggerFactory.getLogger(XiangmujinduController.class);

    private static final String TABLE_NAME = "xiangmujindu";

    @Autowired
    private XiangmujinduService xiangmujinduService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private JiaoshiService jiaoshiService;//指导教师
    @Autowired
    private NewsService newsService;//公告信息
    @Autowired
    private XiangmuService xiangmuService;//项目申报
    @Autowired
    private XuantishenheService xuantishenheService;//选题审核
    @Autowired
    private YonghuService yonghuService;//学生
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("学生".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("指导教师".equals(role))
            params.put("jiaoshiId",request.getSession().getAttribute("userId"));
        params.put("xiangmujinduDeleteStart",1);params.put("xiangmujinduDeleteEnd",1);
        CommonUtil.checkMap(params);
        PageUtils page = xiangmujinduService.queryPage(params);

        //字典表数据转换
        List<XiangmujinduView> list =(List<XiangmujinduView>)page.getList();
        for(XiangmujinduView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XiangmujinduEntity xiangmujindu = xiangmujinduService.selectById(id);
        if(xiangmujindu !=null){
            //entity转view
            XiangmujinduView view = new XiangmujinduView();
            BeanUtils.copyProperties( xiangmujindu , view );//把实体数据重构到view中
            //级联表 选题审核
            //级联表
            XuantishenheEntity xuantishenhe = xuantishenheService.selectById(xiangmujindu.getXuantishenheId());
            if(xuantishenhe != null){
            BeanUtils.copyProperties( xuantishenhe , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setXuantishenheId(xuantishenhe.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody XiangmujinduEntity xiangmujindu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,xiangmujindu:{}",this.getClass().getName(),xiangmujindu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

            xiangmujindu.setXiangmujinduYesnoTypes(1);
            xiangmujindu.setXiangmujinduDelete(1);
            xiangmujindu.setInsertTime(new Date());
            xiangmujindu.setCreateTime(new Date());
            xiangmujinduService.insert(xiangmujindu);
            return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody XiangmujinduEntity xiangmujindu, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,xiangmujindu:{}",this.getClass().getName(),xiangmujindu.toString());
        XiangmujinduEntity oldXiangmujinduEntity = xiangmujinduService.selectById(xiangmujindu.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(xiangmujindu.getXiangmujinduFile()) || "null".equals(xiangmujindu.getXiangmujinduFile())){
                xiangmujindu.setXiangmujinduFile(null);
        }

            xiangmujinduService.updateById(xiangmujindu);//根据id更新
            return R.ok();
    }


    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestBody XiangmujinduEntity xiangmujinduEntity, HttpServletRequest request){
        logger.debug("shenhe方法:,,Controller:{},,xiangmujinduEntity:{}",this.getClass().getName(),xiangmujinduEntity.toString());

        XiangmujinduEntity oldXiangmujindu = xiangmujinduService.selectById(xiangmujinduEntity.getId());//查询原先数据

        if(xiangmujinduEntity.getXiangmujinduYesnoTypes() == 2){//通过
            XuantishenheEntity xuantishenheEntity = xuantishenheService.selectById(oldXiangmujindu.getXuantishenheId());
            if(xuantishenheEntity.getXuantishenheYesnoTypes() == 2){
                xuantishenheEntity.setXuantishenheYesnoTypes(4);
            }else if(xuantishenheEntity.getXuantishenheYesnoTypes() == 4){
                xuantishenheEntity.setXuantishenheYesnoTypes(5);
            }else if(xuantishenheEntity.getXuantishenheYesnoTypes() == 5){
                xuantishenheEntity.setXuantishenheYesnoTypes(6);
            }
            xuantishenheService.updateById(xuantishenheEntity);
        }
        xiangmujinduService.updateById(xiangmujinduEntity);//审核

        return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<XiangmujinduEntity> oldXiangmujinduList =xiangmujinduService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        ArrayList<XiangmujinduEntity> list = new ArrayList<>();
        for(Integer id:ids){
            XiangmujinduEntity xiangmujinduEntity = new XiangmujinduEntity();
            xiangmujinduEntity.setId(id);
            xiangmujinduEntity.setXiangmujinduDelete(2);
            list.add(xiangmujinduEntity);
        }
        if(list != null && list.size() >0){
            xiangmujinduService.updateBatchById(list);
        }

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //.eq("time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
        try {
            List<XiangmujinduEntity> xiangmujinduList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            XiangmujinduEntity xiangmujinduEntity = new XiangmujinduEntity();
//                            xiangmujinduEntity.setXuantishenheId(Integer.valueOf(data.get(0)));   //选题审核 要改的
//                            xiangmujinduEntity.setXiangmujinduFile(data.get(0));                    //项目文件 要改的
//                            xiangmujinduEntity.setXiangmujinduContent("");//详情和图片
//                            xiangmujinduEntity.setXiangmujinduYesnoTypes(Integer.valueOf(data.get(0)));   //进度审核 要改的
//                            xiangmujinduEntity.setXiangmujinduYesnoText(data.get(0));                    //审核结果 要改的
//                            xiangmujinduEntity.setXiangmujinduDelete(1);//逻辑删除字段
//                            xiangmujinduEntity.setInsertTime(date);//时间
//                            xiangmujinduEntity.setCreateTime(date);//时间
                            xiangmujinduList.add(xiangmujinduEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        xiangmujinduService.insertBatch(xiangmujinduList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




}

