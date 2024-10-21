package com.entity.model;

import com.entity.XiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 项目申报
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiangmuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 项目编号
     */
    private String xiangmuUuidNumber;


    /**
     * 项目名称
     */
    private String xiangmuName;


    /**
     * 项目类型
     */
    private Integer xiangmuTypes;


    /**
     * 项目经费
     */
    private Double xiangmuJingfei;


    /**
     * 项目文件
     */
    private String xiangmuFile;


    /**
     * 教师
     */
    private Integer jiaoshiId;


    /**
     * 项目创新点
     */
    private String xiangmuChuangxin;


    /**
     * 项目实施方案
     */
    private String xiangmuText;


    /**
     * 项目详情
     */
    private String xiangmuContent;


    /**
     * 申报状态
     */
    private Integer xiangmuYesnoTypes;


    /**
     * 申报结果
     */
    private String xiangmuYesnoText;


    /**
     * 逻辑删除
     */
    private Integer xiangmuDelete;


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

    }
