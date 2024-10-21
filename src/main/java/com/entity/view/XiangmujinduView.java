package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.XiangmujinduEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 项目进度
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("xiangmujindu")
public class XiangmujinduView extends XiangmujinduEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 进度审核的值
	*/
	@ColumnInfo(comment="进度审核的字典表值",type="varchar(200)")
	private String xiangmujinduYesnoValue;

	//级联表 选题审核
										 
		/**
		* 选题审核 的 学生
		*/
		@ColumnInfo(comment="学生",type="int(11)")
		private Integer xuantishenheYonghuId;
		/**
		* 选题申请
		*/
		@ColumnInfo(comment="选题申请",type="int(11)")
		private Integer xuantishenheYesnoTypes;
			/**
			* 选题申请的值
			*/
			@ColumnInfo(comment="选题申请的字典表值",type="varchar(200)")
			private String xuantishenheYesnoValue;
		/**
		* 申请结果
		*/

		@ColumnInfo(comment="申请结果",type="longtext")
		private String xuantishenheYesnoText;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer xuantishenheDelete;


	/**
	 * 项目申报 的 教师
	 */
	@ColumnInfo(comment="教师",type="int(11)")
	private Integer xiangmuJiaoshiId;

	public Integer getXiangmuJiaoshiId() {
		return xiangmuJiaoshiId;
	}

	public void setXiangmuJiaoshiId(Integer xiangmuJiaoshiId) {
		this.xiangmuJiaoshiId = xiangmuJiaoshiId;
	}

	public XiangmujinduView() {

	}

	public XiangmujinduView(XiangmujinduEntity xiangmujinduEntity) {
		try {
			BeanUtils.copyProperties(this, xiangmujinduEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 进度审核的值
	*/
	public String getXiangmujinduYesnoValue() {
		return xiangmujinduYesnoValue;
	}
	/**
	* 设置： 进度审核的值
	*/
	public void setXiangmujinduYesnoValue(String xiangmujinduYesnoValue) {
		this.xiangmujinduYesnoValue = xiangmujinduYesnoValue;
	}


	//级联表的get和set 选题审核
		/**
		* 获取：选题审核 的 学生
		*/
		public Integer getXuantishenheYonghuId() {
			return xuantishenheYonghuId;
		}
		/**
		* 设置：选题审核 的 学生
		*/
		public void setXuantishenheYonghuId(Integer xuantishenheYonghuId) {
			this.xuantishenheYonghuId = xuantishenheYonghuId;
		}
		/**
		* 获取： 选题申请
		*/
		public Integer getXuantishenheYesnoTypes() {
			return xuantishenheYesnoTypes;
		}
		/**
		* 设置： 选题申请
		*/
		public void setXuantishenheYesnoTypes(Integer xuantishenheYesnoTypes) {
			this.xuantishenheYesnoTypes = xuantishenheYesnoTypes;
		}


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

		/**
		* 获取： 申请结果
		*/
		public String getXuantishenheYesnoText() {
			return xuantishenheYesnoText;
		}
		/**
		* 设置： 申请结果
		*/
		public void setXuantishenheYesnoText(String xuantishenheYesnoText) {
			this.xuantishenheYesnoText = xuantishenheYesnoText;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getXuantishenheDelete() {
			return xuantishenheDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setXuantishenheDelete(Integer xuantishenheDelete) {
			this.xuantishenheDelete = xuantishenheDelete;
		}


	@Override
	public String toString() {
		return "XiangmujinduView{" +
			", xiangmujinduYesnoValue=" + xiangmujinduYesnoValue +
			", xuantishenheYesnoText=" + xuantishenheYesnoText +
			", xuantishenheDelete=" + xuantishenheDelete +
			"} " + super.toString();
	}
}
