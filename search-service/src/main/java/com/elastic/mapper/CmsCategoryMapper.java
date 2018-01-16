package com.elastic.mapper;


import java.util.List;

import com.elastic.entity.po.CmsCategory;
import com.elastic.entity.po.CmsCategoryExample;
import org.apache.ibatis.annotations.Param;

public interface CmsCategoryMapper {
    int countByExample(CmsCategoryExample example);

    int deleteByExample(CmsCategoryExample example);

    int deleteByPrimaryKey(Integer cmsCateId);

    int insert(CmsCategory record);

    int insertSelective(CmsCategory record);

    List<CmsCategory> selectByExample(CmsCategoryExample example);

    CmsCategory selectByPrimaryKey(Integer cmsCateId);

    int updateByExampleSelective(@Param("record") CmsCategory record, @Param("example") CmsCategoryExample example);

    int updateByExample(@Param("record") CmsCategory record, @Param("example") CmsCategoryExample example);

    int updateByPrimaryKeySelective(CmsCategory record);

    int updateByPrimaryKey(CmsCategory record);
}