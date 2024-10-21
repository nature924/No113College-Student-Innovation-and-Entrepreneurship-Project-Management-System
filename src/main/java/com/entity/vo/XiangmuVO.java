package com.entity.vo;

import com.entity.XiangmuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 项目申报
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiangmu")
public class XiangmuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 项目编号
     */

    @TableField(value = "xiangmu_uuid_number")
    private String xiangmuUuidNumber;


    /**
     * 项目名称
     */

    @TableField(value = "xiangmu_name")
    private String xiangmuName;


    /**
     * 项目类型
     */

    @TableField(value = "xiangmu_types")
    private Integer xiangmuTypes;


    /**
     * 项目经费
     */

    @TableField(value = "xiangmu_jingfei")
    private Double xiangmuJingfei;


    /**
     * 项目文件
     */

    @TableField(value = "xiangmu_file")
    private String xiangmuFile;


    /**
     * 教师
     */

    @TableField(value = "jiaoshi_id")
    private Integer jiaoshiId;


    /**
     * 项目创新点
     */

    @TableField(value = "xiangmu_chuangxin")
    private String xiangmuChuangxin;


    /**
     * 项目实施方案
     */

    @TableField(value = "xiangmu_text")
    private String xiangmuText;


    /**
     * 项目详情
     */

    @TableField(value = "xiangmu_content")
    private String xiangmuContent;


    /**
     * 申报状态
     */

    @TableField(value = "xiangmu_yesno_types")
    private Integer xiangmuYesnoTypes;


    /**
     * 申报结果
     */

    @TableField(value = "xiangmu_yesno_text")
    private String xiangmuYesnoText;


    /**
     * 逻辑删除
     */

    @TableField(value = "xiangmu_delete")
    private Integer xiangmuDelete;


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
	 * 设置：项目编号
	 */
    public String getXiangmuUuidNumber() {
        return xiangmuUuidNumber;
    }


    /**
	 * 获取：项目编号
	 */

    public void setXiangmuUuidNumber(String xiangmuUuidNumber) {
        this.xiangmuUuidNumber = xiangmuUuidNumber;
    }
    /**
	 * 设置：项目名称
	 */
    public String getXiangmuName() {
        return xiangmuName;
    }


    /**
	 * 获取：项目名称
	 */

    public void setXiangmuName(String xiangmuName) {
        this.xiangmuName = xiangmuName;
    }
    /**
	 * 设置：项目类型
	 */
    public Integer getXiangmuTypes() {
        return xiangmuTypes;
    }


    /**
	 * 获取：项目类型
	 */

    public void setXiangmuTypes(Integer xiangmuTypes) {
        this.xiangmuTypes = xiangmuTypes;
    }
    /**
	 * 设置：项目经费
	 */
    public Double getXiangmuJingfei() {
        return xiangmuJingfei;
    }


    /**
	 * 获取：项目经费
	 */

    public void setXiangmuJingfei(Double xiangmuJingfei) {
        this.xiangmuJingfei = xiangmuJingfei;
    }
    /**
	 * 设置：项目文件
	 */
    public String getXiangmuFile() {
        return xiangmuFile;
    }


    /**
	 * 获取：项目文件
	 */

    public void setXiangmuFile(String xiangmuFile) {
        this.xiangmuFile = xiangmuFile;
    }
    /**
	 * 设置：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：项目创新点
	 */
    public String getXiangmuChuangxin() {
        return xiangmuChuangxin;
    }


    /**
	 * 获取：项目创新点
	 */

    public void setXiangmuChuangxin(String xiangmuChuangxin) {
        this.xiangmuChuangxin = xiangmuChuangxin;
    }
    /**
	 * 设置：项目实施方案
	 */
    public String getXiangmuText() {
        return xiangmuText;
    }


    /**
	 * 获取：项目实施方案
	 */

    public void setXiangmuText(String xiangmuText) {
        this.xiangmuText = xiangmuText;
    }
    /**
	 * 设置：项目详情
	 */
    public String getXiangmuContent() {
        return xiangmuContent;
    }


    /**
	 * 获取：项目详情
	 */

    public void setXiangmuContent(String xiangmuContent) {
        this.xiangmuContent = xiangmuContent;
    }
    /**
	 * 设置：申报状态
	 */
    public Integer getXiangmuYesnoTypes() {
        return xiangmuYesnoTypes;
    }


    /**
	 * 获取：申报状态
	 */

    public void setXiangmuYesnoTypes(Integer xiangmuYesnoTypes) {
        this.xiangmuYesnoTypes = xiangmuYesnoTypes;
    }
    /**
	 * 设置：申报结果
	 */
    public String getXiangmuYesnoText() {
        return xiangmuYesnoText;
    }


    /**
	 * 获取：申报结果
	 */

    public void setXiangmuYesnoText(String xiangmuYesnoText) {
        this.xiangmuYesnoText = xiangmuYesnoText;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getXiangmuDelete() {
        return xiangmuDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setXiangmuDelete(Integer xiangmuDelete) {
        this.xiangmuDelete = xiangmuDelete;
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
