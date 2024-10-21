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
 * 项目进度
 *
 * @author 
 * @email
 */
@TableName("xiangmujindu")
public class XiangmujinduEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiangmujinduEntity() {

	}

	public XiangmujinduEntity(T t) {
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
     * 选题审核
     */
    @ColumnInfo(comment="选题审核",type="int(11)")
    @TableField(value = "xuantishenhe_id")

    private Integer xuantishenheId;


    /**
     * 项目文件
     */
    @ColumnInfo(comment="项目文件",type="varchar(200)")
    @TableField(value = "xiangmujindu_file")

    private String xiangmujinduFile;


    /**
     * 项目详情
     */
    @ColumnInfo(comment="项目详情",type="longtext")
    @TableField(value = "xiangmujindu_content")

    private String xiangmujinduContent;


    /**
     * 进度审核
     */
    @ColumnInfo(comment="进度审核",type="int(11)")
    @TableField(value = "xiangmujindu_yesno_types")

    private Integer xiangmujinduYesnoTypes;


    /**
     * 审核结果
     */
    @ColumnInfo(comment="审核结果",type="longtext")
    @TableField(value = "xiangmujindu_yesno_text")

    private String xiangmujinduYesnoText;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "xiangmujindu_delete")

    private Integer xiangmujinduDelete;


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

    @Override
    public String toString() {
        return "Xiangmujindu{" +
            ", id=" + id +
            ", xuantishenheId=" + xuantishenheId +
            ", xiangmujinduFile=" + xiangmujinduFile +
            ", xiangmujinduContent=" + xiangmujinduContent +
            ", xiangmujinduYesnoTypes=" + xiangmujinduYesnoTypes +
            ", xiangmujinduYesnoText=" + xiangmujinduYesnoText +
            ", xiangmujinduDelete=" + xiangmujinduDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
