package com.entity.vo;

import com.entity.XiangmujinduEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 项目进度
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiangmujindu")
public class XiangmujinduVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 选题审核
     */

    @TableField(value = "xuantishenhe_id")
    private Integer xuantishenheId;


    /**
     * 项目文件
     */

    @TableField(value = "xiangmujindu_file")
    private String xiangmujinduFile;


    /**
     * 项目详情
     */

    @TableField(value = "xiangmujindu_content")
    private String xiangmujinduContent;


    /**
     * 进度审核
     */

    @TableField(value = "xiangmujindu_yesno_types")
    private Integer xiangmujinduYesnoTypes;


    /**
     * 审核结果
     */

    @TableField(value = "xiangmujindu_yesno_text")
    private String xiangmujinduYesnoText;


    /**
     * 逻辑删除
     */

    @TableField(value = "xiangmujindu_delete")
    private Integer xiangmujinduDelete;


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
	 * 设置：选题审核
	 */
    public Integer getXuantishenheId() {
        return xuantishenheId;
    }


    /**
	 * 获取：选题审核
	 */

    public void setXuantishenheId(Integer xuantishenheId) {
        this.xuantishenheId = xuantishenheId;
    }
    /**
	 * 设置：项目文件
	 */
    public String getXiangmujinduFile() {
        return xiangmujinduFile;
    }


    /**
	 * 获取：项目文件
	 */

    public void setXiangmujinduFile(String xiangmujinduFile) {
        this.xiangmujinduFile = xiangmujinduFile;
    }
    /**
	 * 设置：项目详情
	 */
    public String getXiangmujinduContent() {
        return xiangmujinduContent;
    }


    /**
	 * 获取：项目详情
	 */

    public void setXiangmujinduContent(String xiangmujinduContent) {
        this.xiangmujinduContent = xiangmujinduContent;
    }
    /**
	 * 设置：进度审核
	 */
    public Integer getXiangmujinduYesnoTypes() {
        return xiangmujinduYesnoTypes;
    }


    /**
	 * 获取：进度审核
	 */

    public void setXiangmujinduYesnoTypes(Integer xiangmujinduYesnoTypes) {
        this.xiangmujinduYesnoTypes = xiangmujinduYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getXiangmujinduYesnoText() {
        return xiangmujinduYesnoText;
    }


    /**
	 * 获取：审核结果
	 */

    public void setXiangmujinduYesnoText(String xiangmujinduYesnoText) {
        this.xiangmujinduYesnoText = xiangmujinduYesnoText;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getXiangmujinduDelete() {
        return xiangmujinduDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setXiangmujinduDelete(Integer xiangmujinduDelete) {
        this.xiangmujinduDelete = xiangmujinduDelete;
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
