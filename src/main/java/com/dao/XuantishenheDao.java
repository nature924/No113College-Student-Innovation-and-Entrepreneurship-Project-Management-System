package com.dao;

import com.entity.XuantishenheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XuantishenheView;

/**
 * 选题审核 Dao 接口
 *
 * @author 
 */
public interface XuantishenheDao extends BaseMapper<XuantishenheEntity> {

   List<XuantishenheView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
