package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.XiangmuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 项目申报
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("xiangmu")
public class XiangmuView extends XiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 项目类型的值
	*/
	@ColumnInfo(comment="项目类型的字典表值",type="varchar(200)")
	private String xiangmuValue;
	/**
	* 申报状态的值
	*/
	@ColumnInfo(comment="申报状态的字典表值",type="varchar(200)")
	private String xiangmuYesnoValue;

	//级联表 指导教师
		/**
		* 教师名称
		*/

		@ColumnInfo(comment="教师名称",type="varchar(200)")
		private String jiaoshiName;
		/**
		* 教师手机号
		*/

		@ColumnInfo(comment="教师手机号",type="varchar(200)")
		private String jiaoshiPhone;
		/**
		* 教师头像
		*/

		@ColumnInfo(comment="教师头像",type="varchar(200)")
		private String jiaoshiPhoto;
		/**
		* 教师邮箱
		*/

		@ColumnInfo(comment="教师邮箱",type="varchar(200)")
		private String jiaoshiEmail;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer jiaoshiDelete;
		/**
		* 入职时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
		@DateTimeFormat
		@ColumnInfo(comment="入职时间",type="date")
		private Date jiaoshiTime;



	public XiangmuView() {

	}

	public XiangmuView(XiangmuEntity xiangmuEntity) {
		try {
			BeanUtils.copyProperties(this, xiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
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
	//当前表的
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


	//级联表的get和set 指导教师

		/**
		* 获取： 教师名称
		*/
		public String getJiaoshiName() {
			return jiaoshiName;
		}
		/**
		* 设置： 教师名称
		*/
		public void setJiaoshiName(String jiaoshiName) {
			this.jiaoshiName = jiaoshiName;
		}

		/**
		* 获取： 教师手机号
		*/
		public String getJiaoshiPhone() {
			return jiaoshiPhone;
		}
		/**
		* 设置： 教师手机号
		*/
		public void setJiaoshiPhone(String jiaoshiPhone) {
			this.jiaoshiPhone = jiaoshiPhone;
		}

		/**
		* 获取： 教师头像
		*/
		public String getJiaoshiPhoto() {
			return jiaoshiPhoto;
		}
		/**
		* 设置： 教师头像
		*/
		public void setJiaoshiPhoto(String jiaoshiPhoto) {
			this.jiaoshiPhoto = jiaoshiPhoto;
		}

		/**
		* 获取： 教师邮箱
		*/
		public String getJiaoshiEmail() {
			return jiaoshiEmail;
		}
		/**
		* 设置： 教师邮箱
		*/
		public void setJiaoshiEmail(String jiaoshiEmail) {
			this.jiaoshiEmail = jiaoshiEmail;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getJiaoshiDelete() {
			return jiaoshiDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setJiaoshiDelete(Integer jiaoshiDelete) {
			this.jiaoshiDelete = jiaoshiDelete;
		}

		/**
		* 获取： 入职时间
		*/
		public Date getJiaoshiTime() {
			return jiaoshiTime;
		}
		/**
		* 设置： 入职时间
		*/
		public void setJiaoshiTime(Date jiaoshiTime) {
			this.jiaoshiTime = jiaoshiTime;
		}


	@Override
	public String toString() {
		return "XiangmuView{" +
			", xiangmuValue=" + xiangmuValue +
			", xiangmuYesnoValue=" + xiangmuYesnoValue +
			", jiaoshiName=" + jiaoshiName +
			", jiaoshiPhone=" + jiaoshiPhone +
			", jiaoshiPhoto=" + jiaoshiPhoto +
			", jiaoshiEmail=" + jiaoshiEmail +
			", jiaoshiDelete=" + jiaoshiDelete +
			", jiaoshiTime=" + DateUtil.convertString(jiaoshiTime,"yyyy-MM-dd") +
			"} " + super.toString();
	}
}
