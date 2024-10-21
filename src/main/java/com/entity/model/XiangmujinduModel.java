package com.entity.model;

import com.entity.XiangmujinduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 项目进度
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiangmujinduModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 选题审核
     */
    private Integer xuantishenheId;


    /**
     * 项目文件
     */
    private String xiangmujinduFile;


    /**
     * 项目详情
     */
    private String xiangmujinduContent;


    /**
     * 进度审核
     */
    private Integer xiangmujinduYesnoTypes;


    /**
     * 审核结果
     */
    private String xiangmujinduYesnoText;


    /**
     * 逻辑删除
     */
    private Integer xiangmujinduDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：选题审核
	 */
    public Integer getXuantishenheId() {
        return xuantishenheId;
    }


    /**
	 * 设置：选题审核
	 */
    public void setXuantishenheId(Integer xuantishenheId) {
        this.xuantishenheId = xuantishenheId;
    }
    /**
	 * 获取：项目文件
	 */
    public String getXiangmujinduFile() {
        return xiangmujinduFile;
    }


    /**
	 * 设置：项目文件
	 */
    public void setXiangmujinduFile(String xiangmujinduFile) {
        this.xiangmujinduFile = xiangmujinduFile;
    }
    /**
	 * 获取：项目详情
	 */
    public String getXiangmujinduContent() {
        return xiangmujinduContent;
    }


    /**
	 * 设置：项目详情
	 */
    public void setXiangmujinduContent(String xiangmujinduContent) {
        this.xiangmujinduContent = xiangmujinduContent;
    }
    /**
	 * 获取：进度审核
	 */
    public Integer getXiangmujinduYesnoTypes() {
        return xiangmujinduYesnoTypes;
    }


    /**
	 * 设置：进度审核
	 */
    public void setXiangmujinduYesnoTypes(Integer xiangmujinduYesnoTypes) {
        this.xiangmujinduYesnoTypes = xiangmujinduYesnoTypes;
    }
    /**
	 * 获取：审核结果
	 */
    public String getXiangmujinduYesnoText() {
        return xiangmujinduYesnoText;
    }


    /**
	 * 设置：审核结果
	 */
    public void setXiangmujinduYesnoText(String xiangmujinduYesnoText) {
        this.xiangmujinduYesnoText = xiangmujinduYesnoText;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getXiangmujinduDelete() {
        return xiangmujinduDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setXiangmujinduDelete(Integer xiangmujinduDelete) {
        this.xiangmujinduDelete = xiangmujinduDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
