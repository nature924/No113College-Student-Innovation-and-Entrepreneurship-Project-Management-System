
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
 * 选题审核
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/xuantishenhe")
public class XuantishenheController {
    private static final Logger logger = LoggerFactory.getLogger(XuantishenheController.class);

    private static final String TABLE_NAME = "xuantishenhe";

    @Autowired
    private XuantishenheService xuantishenheService;


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
    private XiangmujinduService xiangmujinduService;//项目进度
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
        params.put("xuantishenheDeleteStart",1);params.put("xuantishenheDeleteEnd",1);
        CommonUtil.checkMap(params);
        PageUtils page = xuantishenheService.queryPage(params);

        //字典表数据转换
        List<XuantishenheView> list =(List<XuantishenheView>)page.getList();
        for(XuantishenheView c:list){
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
        XuantishenheEntity xuantishenhe = xuantishenheService.selectById(id);
        if(xuantishenhe !=null){
            //entity转view
            XuantishenheView view = new XuantishenheView();
            BeanUtils.copyProperties( xuantishenhe , view );//把实体数据重构到view中
            //级联表 项目申报
            //级联表
            XiangmuEntity xiangmu = xiangmuService.selectById(xuantishenhe.getXiangmuId());
            if(xiangmu != null){
            BeanUtils.copyProperties( xiangmu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setXiangmuId(xiangmu.getId());
            }
            //级联表 学生
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(xuantishenhe.getYonghuId());
            if(yonghu != null){
            BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setYonghuId(yonghu.getId());
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
    public R save(@RequestBody XuantishenheEntity xuantishenhe, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,xuantishenhe:{}",this.getClass().getName(),xuantishenhe.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("学生".equals(role))
            xuantishenhe.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<XuantishenheEntity> queryWrapper = new EntityWrapper<XuantishenheEntity>()
            .eq("xiangmu_id", xuantishenhe.getXiangmuId())
            .eq("yonghu_id", xuantishenhe.getYonghuId())
            .in("xuantishenhe_yesno_types", new Integer[]{1,2})
            .eq("xuantishenhe_delete", 1)
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XuantishenheEntity xuantishenheEntity = xuantishenheService.selectOne(queryWrapper);
        if(xuantishenheEntity==null){
            xuantishenhe.setXuantishenheYesnoTypes(1);
            xuantishenhe.setXuantishenheDelete(1);
            xuantishenhe.setInsertTime(new Date());
            xuantishenhe.setCreateTime(new Date());
            xuantishenheService.insert(xuantishenhe);
            return R.ok();
        }else {
            if(xuantishenheEntity.getXuantishenheYesnoTypes()==1)
                return R.error(511,"有相同的待审核的数据");
            else if(xuantishenheEntity.getXuantishenheYesnoTypes()==2)
                return R.error(511,"有相同的审核通过的数据");
            else
                return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody XuantishenheEntity xuantishenhe, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,xuantishenhe:{}",this.getClass().getName(),xuantishenhe.toString());
        XuantishenheEntity oldXuantishenheEntity = xuantishenheService.selectById(xuantishenhe.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("学生".equals(role))
//            xuantishenhe.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

            xuantishenheService.updateById(xuantishenhe);//根据id更新
            return R.ok();
    }


    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestBody XuantishenheEntity xuantishenheEntity, HttpServletRequest request){
        logger.debug("shenhe方法:,,Controller:{},,xuantishenheEntity:{}",this.getClass().getName(),xuantishenheEntity.toString());

        XuantishenheEntity oldXuantishenhe = xuantishenheService.selectById(xuantishenheEntity.getId());//查询原先数据

        if(xuantishenheEntity.getXuantishenheYesnoTypes() == 2){//通过
            XiangmuEntity xiangmuEntity = new XiangmuEntity();
            xiangmuEntity.setId(oldXuantishenhe.getXiangmuId());
            xiangmuEntity.setXiangmuYesnoTypes(4);
            xiangmuService.updateById(xiangmuEntity);
        }
        xuantishenheService.updateById(xuantishenheEntity);//审核

        return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<XuantishenheEntity> oldXuantishenheList =xuantishenheService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        ArrayList<XuantishenheEntity> list = new ArrayList<>();
        for(Integer id:ids){
            XuantishenheEntity xuantishenheEntity = new XuantishenheEntity();
            xuantishenheEntity.setId(id);
            xuantishenheEntity.setXuantishenheDelete(2);
            list.add(xuantishenheEntity);
        }
        if(list != null && list.size() >0){
            xuantishenheService.updateBatchById(list);
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
            List<XuantishenheEntity> xuantishenheList = new ArrayList<>();//上传的东西
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
                            XuantishenheEntity xuantishenheEntity = new XuantishenheEntity();
//                            xuantishenheEntity.setXiangmuId(Integer.valueOf(data.get(0)));   //项目 要改的
//                            xuantishenheEntity.setYonghuId(Integer.valueOf(data.get(0)));   //学生 要改的
//                            xuantishenheEntity.setXuantishenheYesnoTypes(Integer.valueOf(data.get(0)));   //选题申请 要改的
//                            xuantishenheEntity.setXuantishenheYesnoText(data.get(0));                    //申请结果 要改的
//                            xuantishenheEntity.setXuantishenheDelete(1);//逻辑删除字段
//                            xuantishenheEntity.setInsertTime(date);//时间
//                            xuantishenheEntity.setCreateTime(date);//时间
                            xuantishenheList.add(xuantishenheEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        xuantishenheService.insertBatch(xuantishenheList);
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

