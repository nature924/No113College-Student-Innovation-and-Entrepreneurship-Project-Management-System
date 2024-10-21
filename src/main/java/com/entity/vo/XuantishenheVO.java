package com.entity.vo;

import com.entity.XuantishenheEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 选题审核
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xuantishenhe")
public class XuantishenheVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 项目
     */

    @TableField(value = "xiangmu_id")
    private Integer xiangmuId;


    /**
     * 学生
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 选题申请
     */

    @TableField(value = "xuantishenhe_yesno_types")
    private Integer xuantishenheYesnoTypes;


    /**
     * 申请结果
     */

    @TableField(value = "xuantishenhe_yesno_text")
    private String xuantishenheYesnoText;


    /**
     * 逻辑删除
     */

    @TableField(value = "xuantishenhe_delete")
    private Integer xuantishenheDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：项目
	 */
    public Integer getXiangmuId() {
        return xiangmuId;
    }


    /**
	 * 获取：项目
	 */

    public void setXiangmuId(Integer xiangmuId) {
        this.xiangmuId = xiangmuId;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：选题申请
	 */
    public Integer getXuantishenheYesnoTypes() {
        return xuantishenheYesnoTypes;
    }


    /**
	 * 获取：选题申请
	 */

    public void setXuantishenheYesnoTypes(Integer xuantishenheYesnoTypes) {
        this.xuantishenheYesnoTypes = xuantishenheYesnoTypes;
    }
    /**
	 * 设置：申请结果
	 */
    public String getXuantishenheYesnoText() {
        return xuantishenheYesnoText;
    }


    /**
	 * 获取：申请结果
	 */

    public void setXuantishenheYesnoText(String xuantishenheYesnoText) {
        this.xuantishenheYesnoText = xuantishenheYesnoText;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getXuantishenheDelete() {
        return xuantishenheDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setXuantishenheDelete(Integer xuantishenheDelete) {
        this.xuantishenheDelete = xuantishenheDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
