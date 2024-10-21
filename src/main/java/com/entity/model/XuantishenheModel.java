package com.entity.model;

import com.entity.XuantishenheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 选题审核
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XuantishenheModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 项目
     */
    private Integer xiangmuId;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 选题申请
     */
    private Integer xuantishenheYesnoTypes;


    /**
     * 申请结果
     */
    private String xuantishenheYesnoText;


    /**
     * 逻辑删除
     */
    private Integer xuantishenheDelete;


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
	 * 获取：项目
	 */
    public Integer getXiangmuId() {
        return xiangmuId;
    }


    /**
	 * 设置：项目
	 */
    public void setXiangmuId(Integer xiangmuId) {
        this.xiangmuId = xiangmuId;
    }
    /**
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：选题申请
	 */
    public Integer getXuantishenheYesnoTypes() {
        return xuantishenheYesnoTypes;
    }


    /**
	 * 设置：选题申请
	 */
    public void setXuantishenheYesnoTypes(Integer xuantishenheYesnoTypes) {
        this.xuantishenheYesnoTypes = xuantishenheYesnoTypes;
    }
    /**
	 * 获取：申请结果
	 */
    public String getXuantishenheYesnoText() {
        return xuantishenheYesnoText;
    }


    /**
	 * 设置：申请结果
	 */
    public void setXuantishenheYesnoText(String xuantishenheYesnoText) {
        this.xuantishenheYesnoText = xuantishenheYesnoText;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getXuantishenheDelete() {
        return xuantishenheDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setXuantishenheDelete(Integer xuantishenheDelete) {
        this.xuantishenheDelete = xuantishenheDelete;
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
