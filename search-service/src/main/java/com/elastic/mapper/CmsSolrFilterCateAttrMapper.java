package com.elastic.mapper;


import java.util.List;

import com.elastic.entity.po.CmsSolrFilterCateAttr;
import com.elastic.entity.po.CmsSolrFilterCateAttrExample;
import org.apache.ibatis.annotations.Param;

public interface CmsSolrFilterCateAttrMapper {
    int countByExample(CmsSolrFilterCateAttrExample example);

    int deleteByExample(CmsSolrFilterCateAttrExample example);

    int deleteByPrimaryKey(Integer filterCateAttrId);

    int insert(CmsSolrFilterCateAttr record);

    int insertSelective(CmsSolrFilterCateAttr record);

    List<CmsSolrFilterCateAttr> selectByExample(CmsSolrFilterCateAttrExample example);

    CmsSolrFilterCateAttr selectByPrimaryKey(Integer filterCateAttrId);

    int updateByExampleSelective(@Param("record") CmsSolrFilterCateAttr record, @Param("example") CmsSolrFilterCateAttrExample example);

    int updateByExample(@Param("record") CmsSolrFilterCateAttr record, @Param("example") CmsSolrFilterCateAttrExample example);

    int updateByPrimaryKeySelective(CmsSolrFilterCateAttr record);

    int updateByPrimaryKey(CmsSolrFilterCateAttr record);
}