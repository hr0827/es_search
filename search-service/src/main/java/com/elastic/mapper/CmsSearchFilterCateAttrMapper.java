package com.elastic.mapper;


import java.util.List;

import com.elastic.entity.po.CmsSearchFilterCateAttr;
import com.elastic.entity.po.CmsSearchFilterCateAttrExample;
import org.apache.ibatis.annotations.Param;

public interface CmsSearchFilterCateAttrMapper {
    int countByExample(CmsSearchFilterCateAttrExample example);

    int deleteByExample(CmsSearchFilterCateAttrExample example);

    int deleteByPrimaryKey(Integer filterCateAttrId);

    int insert(CmsSearchFilterCateAttr record);

    int insertSelective(CmsSearchFilterCateAttr record);

    List<CmsSearchFilterCateAttr> selectByExample(CmsSearchFilterCateAttrExample example);

    CmsSearchFilterCateAttr selectByPrimaryKey(Integer filterCateAttrId);

    int updateByExampleSelective(@Param("record") CmsSearchFilterCateAttr record, @Param("example") CmsSearchFilterCateAttrExample example);

    int updateByExample(@Param("record") CmsSearchFilterCateAttr record, @Param("example") CmsSearchFilterCateAttrExample example);

    int updateByPrimaryKeySelective(CmsSearchFilterCateAttr record);

    int updateByPrimaryKey(CmsSearchFilterCateAttr record);
}