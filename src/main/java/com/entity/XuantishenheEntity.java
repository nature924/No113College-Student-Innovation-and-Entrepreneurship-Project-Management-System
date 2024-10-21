package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 选题审核
 *
 * @author 
 * @email
 */
@TableName("xuantishenhe")
public class XuantishenheEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XuantishenheEntity() {

	}

	public XuantishenheEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 项目
     */
    @ColumnInfo(comment="项目",type="int(11)")
    @TableField(value = "xiangmu_id")

    private Integer xiangmuId;


    /**
     * 学生
     */
    @ColumnInfo(comment="学生",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 选题申请
     */
    @ColumnInfo(comment="选题申请",type="int(11)")
    @TableField(value = "xuantishenhe_yesno_types")

    private Integer xuantishenheYesnoTypes;


    /**
     * 申请结果
     */
    @ColumnInfo(comment="申请结果",type="longtext")
    @TableField(value = "xuantishenhe_yesno_text")

    private String xuantishenheYesnoText;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "xuantishenhe_delete")

    private Integer xuantishenheDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Xuantishenhe{" +
            ", id=" + id +
            ", xiangmuId=" + xiangmuId +
            ", yonghuId=" + yonghuId +
            ", xuantishenheYesnoTypes=" + xuantishenheYesnoTypes +
            ", xuantishenheYesnoText=" + xuantishenheYesnoText +
            ", xuantishenheDelete=" + xuantishenheDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
