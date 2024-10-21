package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.XuantishenheEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 选题审核
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("xuantishenhe")
public class XuantishenheView extends XuantishenheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 选题申请的值
	*/
	@ColumnInfo(comment="选题申请的字典表值",type="varchar(200)")
	private String xuantishenheYesnoValue;

	//级联表 项目申报
		/**
		* 项目编号
		*/

		@ColumnInfo(comment="项目编号",type="varchar(200)")
		private String xiangmuUuidNumber;
		/**
		* 项目名称
		*/

		@ColumnInfo(comment="项目名称",type="varchar(200)")
		private String xiangmuName;
		/**
		* 项目类型
		*/
		@ColumnInfo(comment="项目类型",type="int(11)")
		private Integer xiangmuTypes;
			/**
			* 项目类型的值
			*/
			@ColumnInfo(comment="项目类型的字典表值",type="varchar(200)")
			private String xiangmuValue;
		/**
		* 项目经费
		*/
		@ColumnInfo(comment="项目经费",type="decimal(10,2)")
		private Double xiangmuJingfei;
		/**
		* 项目文件
		*/

		@ColumnInfo(comment="项目文件",type="varchar(200)")
		private String xiangmuFile;
					 
		/**
		* 项目申报 的 教师
		*/
		@ColumnInfo(comment="教师",type="int(11)")
		private Integer xiangmuJiaoshiId;
		/**
		* 项目创新点
		*/

		@ColumnInfo(comment="项目创新点",type="varchar(200)")
		private String xiangmuChuangxin;
		/**
		* 项目实施方案
		*/

		@ColumnInfo(comment="项目实施方案",type="longtext")
		private String xiangmuText;
		/**
		* 项目详情
		*/

		@ColumnInfo(comment="项目详情",type="longtext")
		private String xiangmuContent;
		/**
		* 申报状态
		*/
		@ColumnInfo(comment="申报状态",type="int(11)")
		private Integer xiangmuYesnoTypes;
			/**
			* 申报状态的值
			*/
			@ColumnInfo(comment="申报状态的字典表值",type="varchar(200)")
			private String xiangmuYesnoValue;
		/**
		* 申报结果
		*/

		@ColumnInfo(comment="申报结果",type="longtext")
		private String xiangmuYesnoText;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer xiangmuDelete;
	//级联表 学生
		/**
		* 学号
		*/

		@ColumnInfo(comment="学号",type="varchar(200)")
		private String yonghuUuidNumber;
		/**
		* 学生名称
		*/

		@ColumnInfo(comment="学生名称",type="varchar(200)")
		private String yonghuName;
		/**
		* 学生手机号
		*/

		@ColumnInfo(comment="学生手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 学生头像
		*/

		@ColumnInfo(comment="学生头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 学生邮箱
		*/

		@ColumnInfo(comment="学生邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer yonghuDelete;
		/**
		* 入职时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
		@DateTimeFormat
		@ColumnInfo(comment="入职时间",type="date")
		private Date yonghuTime;



	public XuantishenheView() {

	}

	public XuantishenheView(XuantishenheEntity xuantishenheEntity) {
		try {
			BeanUtils.copyProperties(this, xuantishenheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 选题申请的值
	*/
	public String getXuantishenheYesnoValue() {
		return xuantishenheYesnoValue;
	}
	/**
	* 设置： 选题申请的值
	*/
	public void setXuantishenheYesnoValue(String xuantishenheYesnoValue) {
		this.xuantishenheYesnoValue = xuantishenheYesnoValue;
	}


	//级联表的get和set 项目申报

		/**
		* 获取： 项目编号
		*/
		public String getXiangmuUuidNumber() {
			return xiangmuUuidNumber;
		}
		/**
		* 设置： 项目编号
		*/
		public void setXiangmuUuidNumber(String xiangmuUuidNumber) {
			this.xiangmuUuidNumber = xiangmuUuidNumber;
		}

		/**
		* 获取： 项目名称
		*/
		public String getXiangmuName() {
			return xiangmuName;
		}
		/**
		* 设置： 项目名称
		*/
		public void setXiangmuName(String xiangmuName) {
			this.xiangmuName = xiangmuName;
		}
		/**
		* 获取： 项目类型
		*/
		public Integer getXiangmuTypes() {
			return xiangmuTypes;
		}
		/**
		* 设置： 项目类型
		*/
		public void setXiangmuTypes(Integer xiangmuTypes) {
			this.xiangmuTypes = xiangmuTypes;
		}


			/**
			* 获取： 项目类型的值
			*/
			public String getXiangmuValue() {
				return xiangmuValue;
			}
			/**
			* 设置： 项目类型的值
			*/
			public void setXiangmuValue(String xiangmuValue) {
				this.xiangmuValue = xiangmuValue;
			}

		/**
		* 获取： 项目经费
		*/
		public Double getXiangmuJingfei() {
			return xiangmuJingfei;
		}
		/**
		* 设置： 项目经费
		*/
		public void setXiangmuJingfei(Double xiangmuJingfei) {
			this.xiangmuJingfei = xiangmuJingfei;
		}

		/**
		* 获取： 项目文件
		*/
		public String getXiangmuFile() {
			return xiangmuFile;
		}
		/**
		* 设置： 项目文件
		*/
		public void setXiangmuFile(String xiangmuFile) {
			this.xiangmuFile = xiangmuFile;
		}
		/**
		* 获取：项目申报 的 教师
		*/
		public Integer getXiangmuJiaoshiId() {
			return xiangmuJiaoshiId;
		}
		/**
		* 设置：项目申报 的 教师
		*/
		public void setXiangmuJiaoshiId(Integer xiangmuJiaoshiId) {
			this.xiangmuJiaoshiId = xiangmuJiaoshiId;
		}

		/**
		* 获取： 项目创新点
		*/
		public String getXiangmuChuangxin() {
			return xiangmuChuangxin;
		}
		/**
		* 设置： 项目创新点
		*/
		public void setXiangmuChuangxin(String xiangmuChuangxin) {
			this.xiangmuChuangxin = xiangmuChuangxin;
		}

		/**
		* 获取： 项目实施方案
		*/
		public String getXiangmuText() {
			return xiangmuText;
		}
		/**
		* 设置： 项目实施方案
		*/
		public void setXiangmuText(String xiangmuText) {
			this.xiangmuText = xiangmuText;
		}

		/**
		* 获取： 项目详情
		*/
		public String getXiangmuContent() {
			return xiangmuContent;
		}
		/**
		* 设置： 项目详情
		*/
		public void setXiangmuContent(String xiangmuContent) {
			this.xiangmuContent = xiangmuContent;
		}
		/**
		* 获取： 申报状态
		*/
		public Integer getXiangmuYesnoTypes() {
			return xiangmuYesnoTypes;
		}
		/**
		* 设置： 申报状态
		*/
		public void setXiangmuYesnoTypes(Integer xiangmuYesnoTypes) {
			this.xiangmuYesnoTypes = xiangmuYesnoTypes;
		}


			/**
			* 获取： 申报状态的值
			*/
			public String getXiangmuYesnoValue() {
				return xiangmuYesnoValue;
			}
			/**
			* 设置： 申报状态的值
			*/
			public void setXiangmuYesnoValue(String xiangmuYesnoValue) {
				this.xiangmuYesnoValue = xiangmuYesnoValue;
			}

		/**
		* 获取： 申报结果
		*/
		public String getXiangmuYesnoText() {
			return xiangmuYesnoText;
		}
		/**
		* 设置： 申报结果
		*/
		public void setXiangmuYesnoText(String xiangmuYesnoText) {
			this.xiangmuYesnoText = xiangmuYesnoText;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getXiangmuDelete() {
			return xiangmuDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setXiangmuDelete(Integer xiangmuDelete) {
			this.xiangmuDelete = xiangmuDelete;
		}
	//级联表的get和set 学生

		/**
		* 获取： 学号
		*/
		public String getYonghuUuidNumber() {
			return yonghuUuidNumber;
		}
		/**
		* 设置： 学号
		*/
		public void setYonghuUuidNumber(String yonghuUuidNumber) {
			this.yonghuUuidNumber = yonghuUuidNumber;
		}

		/**
		* 获取： 学生名称
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 学生名称
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 学生手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 学生手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 学生头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 学生头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 学生邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 学生邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getYonghuDelete() {
			return yonghuDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setYonghuDelete(Integer yonghuDelete) {
			this.yonghuDelete = yonghuDelete;
		}

		/**
		* 获取： 入职时间
		*/
		public Date getYonghuTime() {
			return yonghuTime;
		}
		/**
		* 设置： 入职时间
		*/
		public void setYonghuTime(Date yonghuTime) {
			this.yonghuTime = yonghuTime;
		}


	@Override
	public String toString() {
		return "XuantishenheView{" +
			", xuantishenheYesnoValue=" + xuantishenheYesnoValue +
			", xiangmuUuidNumber=" + xiangmuUuidNumber +
			", xiangmuName=" + xiangmuName +
			", xiangmuJingfei=" + xiangmuJingfei +
			", xiangmuFile=" + xiangmuFile +
			", xiangmuChuangxin=" + xiangmuChuangxin +
			", xiangmuText=" + xiangmuText +
			", xiangmuContent=" + xiangmuContent +
			", xiangmuYesnoText=" + xiangmuYesnoText +
			", xiangmuDelete=" + xiangmuDelete +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", yonghuDelete=" + yonghuDelete +
			", yonghuTime=" + DateUtil.convertString(yonghuTime,"yyyy-MM-dd") +
			"} " + super.toString();
	}
}
