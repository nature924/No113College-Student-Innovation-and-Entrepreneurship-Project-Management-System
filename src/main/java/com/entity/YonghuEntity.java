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
 * 学生
 *
 * @author 
 * @email
 */
@TableName("yonghu")
public class YonghuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YonghuEntity() {

	}

	public YonghuEntity(T t) {
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
     * 学号
     */
    @ColumnInfo(comment="学号",type="varchar(200)")
    @TableField(value = "yonghu_uuid_number")

    private String yonghuUuidNumber;


    /**
     * 账户
     */
    @ColumnInfo(comment="账户",type="varchar(200)")
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @ColumnInfo(comment="密码",type="varchar(200)")
    @TableField(value = "password")

    private String password;


    /**
     * 学生名称
     */
    @ColumnInfo(comment="学生名称",type="varchar(200)")
    @TableField(value = "yonghu_name")

    private String yonghuName;


    /**
     * 学生手机号
     */
    @ColumnInfo(comment="学生手机号",type="varchar(200)")
    @TableField(value = "yonghu_phone")

    private String yonghuPhone;


    /**
     * 学生头像
     */
    @ColumnInfo(comment="学生头像",type="varchar(200)")
    @TableField(value = "yonghu_photo")

    private String yonghuPhoto;


    /**
     * 性别
     */
    @ColumnInfo(comment="性别",type="int(11)")
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 学生邮箱
     */
    @ColumnInfo(comment="学生邮箱",type="varchar(200)")
    @TableField(value = "yonghu_email")

    private String yonghuEmail;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "yonghu_delete")

    private Integer yonghuDelete;


    /**
     * 入职时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="入职时间",type="date")
    @TableField(value = "yonghu_time")

    private Date yonghuTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
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
	 * 获取：学号
	 */
    public String getYonghuUuidNumber() {
        return yonghuUuidNumber;
    }
    /**
	 * 设置：学号
	 */

    public void setYonghuUuidNumber(String yonghuUuidNumber) {
        this.yonghuUuidNumber = yonghuUuidNumber;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 设置：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 设置：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：学生名称
	 */
    public String getYonghuName() {
        return yonghuName;
    }
    /**
	 * 设置：学生名称
	 */

    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 获取：学生手机号
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }
    /**
	 * 设置：学生手机号
	 */

    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 获取：学生头像
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }
    /**
	 * 设置：学生头像
	 */

    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 设置：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：学生邮箱
	 */
    public String getYonghuEmail() {
        return yonghuEmail;
    }
    /**
	 * 设置：学生邮箱
	 */

    public void setYonghuEmail(String yonghuEmail) {
        this.yonghuEmail = yonghuEmail;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getYonghuDelete() {
        return yonghuDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setYonghuDelete(Integer yonghuDelete) {
        this.yonghuDelete = yonghuDelete;
    }
    /**
	 * 获取：入职时间
	 */
    public Date getYonghuTime() {
        return yonghuTime;
    }
    /**
	 * 设置：入职时间
	 */

    public void setYonghuTime(Date yonghuTime) {
        this.yonghuTime = yonghuTime;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：添加时间
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
        return "Yonghu{" +
            ", id=" + id +
            ", yonghuUuidNumber=" + yonghuUuidNumber +
            ", username=" + username +
            ", password=" + password +
            ", yonghuName=" + yonghuName +
            ", yonghuPhone=" + yonghuPhone +
            ", yonghuPhoto=" + yonghuPhoto +
            ", sexTypes=" + sexTypes +
            ", yonghuEmail=" + yonghuEmail +
            ", yonghuDelete=" + yonghuDelete +
            ", yonghuTime=" + DateUtil.convertString(yonghuTime,"yyyy-MM-dd") +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
