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
 * 项目申报
 *
 * @author 
 * @email
 */
@TableName("xiangmu")
public class XiangmuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiangmuEntity() {

	}

	public XiangmuEntity(T t) {
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
     * 项目编号
     */
    @ColumnInfo(comment="项目编号",type="varchar(200)")
    @TableField(value = "xiangmu_uuid_number")

    private String xiangmuUuidNumber;


    /**
     * 项目名称
     */
    @ColumnInfo(comment="项目名称",type="varchar(200)")
    @TableField(value = "xiangmu_name")

    private String xiangmuName;


    /**
     * 项目类型
     */
    @ColumnInfo(comment="项目类型",type="int(11)")
    @TableField(value = "xiangmu_types")

    private Integer xiangmuTypes;


    /**
     * 项目经费
     */
    @ColumnInfo(comment="项目经费",type="decimal(10,2)")
    @TableField(value = "xiangmu_jingfei")

    private Double xiangmuJingfei;


    /**
     * 项目文件
     */
    @ColumnInfo(comment="项目文件",type="varchar(200)")
    @TableField(value = "xiangmu_file")

    private String xiangmuFile;


    /**
     * 教师
     */
    @ColumnInfo(comment="教师",type="int(11)")
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 项目创新点
     */
    @ColumnInfo(comment="项目创新点",type="varchar(200)")
    @TableField(value = "xiangmu_chuangxin")

    private String xiangmuChuangxin;


    /**
     * 项目实施方案
     */
    @ColumnInfo(comment="项目实施方案",type="longtext")
    @TableField(value = "xiangmu_text")

    private String xiangmuText;


    /**
     * 项目详情
     */
    @ColumnInfo(comment="项目详情",type="longtext")
    @TableField(value = "xiangmu_content")

    private String xiangmuContent;


    /**
     * 申报状态
     */
    @ColumnInfo(comment="申报状态",type="int(11)")
    @TableField(value = "xiangmu_yesno_types")

    private Integer xiangmuYesnoTypes;


    /**
     * 申报结果
     */
    @ColumnInfo(comment="申报结果",type="longtext")
    @TableField(value = "xiangmu_yesno_text")

    private String xiangmuYesnoText;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "xiangmu_delete")

    private Integer xiangmuDelete;


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
	 * 获取：项目编号
	 */
    public String getXiangmuUuidNumber() {
        return xiangmuUuidNumber;
    }
    /**
	 * 设置：项目编号
	 */

    public void setXiangmuUuidNumber(String xiangmuUuidNumber) {
        this.xiangmuUuidNumber = xiangmuUuidNumber;
    }
    /**
	 * 获取：项目名称
	 */
    public String getXiangmuName() {
        return xiangmuName;
    }
    /**
	 * 设置：项目名称
	 */

    public void setXiangmuName(String xiangmuName) {
        this.xiangmuName = xiangmuName;
    }
    /**
	 * 获取：项目类型
	 */
    public Integer getXiangmuTypes() {
        return xiangmuTypes;
    }
    /**
	 * 设置：项目类型
	 */

    public void setXiangmuTypes(Integer xiangmuTypes) {
        this.xiangmuTypes = xiangmuTypes;
    }
    /**
	 * 获取：项目经费
	 */
    public Double getXiangmuJingfei() {
        return xiangmuJingfei;
    }
    /**
	 * 设置：项目经费
	 */

    public void setXiangmuJingfei(Double xiangmuJingfei) {
        this.xiangmuJingfei = xiangmuJingfei;
    }
    /**
	 * 获取：项目文件
	 */
    public String getXiangmuFile() {
        return xiangmuFile;
    }
    /**
	 * 设置：项目文件
	 */

    public void setXiangmuFile(String xiangmuFile) {
        this.xiangmuFile = xiangmuFile;
    }
    /**
	 * 获取：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }
    /**
	 * 设置：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：项目创新点
	 */
    public String getXiangmuChuangxin() {
        return xiangmuChuangxin;
    }
    /**
	 * 设置：项目创新点
	 */

    public void setXiangmuChuangxin(String xiangmuChuangxin) {
        this.xiangmuChuangxin = xiangmuChuangxin;
    }
    /**
	 * 获取：项目实施方案
	 */
    public String getXiangmuText() {
        return xiangmuText;
    }
    /**
	 * 设置：项目实施方案
	 */

    public void setXiangmuText(String xiangmuText) {
        this.xiangmuText = xiangmuText;
    }
    /**
	 * 获取：项目详情
	 */
    public String getXiangmuContent() {
        return xiangmuContent;
    }
    /**
	 * 设置：项目详情
	 */

    public void setXiangmuContent(String xiangmuContent) {
        this.xiangmuContent = xiangmuContent;
    }
    /**
	 * 获取：申报状态
	 */
    public Integer getXiangmuYesnoTypes() {
        return xiangmuYesnoTypes;
    }
    /**
	 * 设置：申报状态
	 */

    public void setXiangmuYesnoTypes(Integer xiangmuYesnoTypes) {
        this.xiangmuYesnoTypes = xiangmuYesnoTypes;
    }
    /**
	 * 获取：申报结果
	 */
    public String getXiangmuYesnoText() {
        return xiangmuYesnoText;
    }
    /**
	 * 设置：申报结果
	 */

    public void setXiangmuYesnoText(String xiangmuYesnoText) {
        this.xiangmuYesnoText = xiangmuYesnoText;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getXiangmuDelete() {
        return xiangmuDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setXiangmuDelete(Integer xiangmuDelete) {
        this.xiangmuDelete = xiangmuDelete;
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
        return "Xiangmu{" +
            ", id=" + id +
            ", xiangmuUuidNumber=" + xiangmuUuidNumber +
            ", xiangmuName=" + xiangmuName +
            ", xiangmuTypes=" + xiangmuTypes +
            ", xiangmuJingfei=" + xiangmuJingfei +
            ", xiangmuFile=" + xiangmuFile +
            ", jiaoshiId=" + jiaoshiId +
            ", xiangmuChuangxin=" + xiangmuChuangxin +
            ", xiangmuText=" + xiangmuText +
            ", xiangmuContent=" + xiangmuContent +
            ", xiangmuYesnoTypes=" + xiangmuYesnoTypes +
            ", xiangmuYesnoText=" + xiangmuYesnoText +
            ", xiangmuDelete=" + xiangmuDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
