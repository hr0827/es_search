package com.elastic.mapper;


import java.util.List;

import com.elastic.entity.po.CmsCategoryRelation;
import com.elastic.entity.po.CmsCategoryRelationExample;
import org.apache.ibatis.annotations.Param;

public interface CmsCategoryRelationMapper {
    int countByExample(CmsCategoryRelationExample example);

    int deleteByExample(CmsCategoryRelationExample example);

    int deleteByPrimaryKey(Integer relationId);

    int insert(CmsCategoryRelation record);

    int insertSelective(CmsCategoryRelation record);

    List<CmsCategoryRelation> selectByExample(CmsCategoryRelationExample example);

    CmsCategoryRelation selectByPrimaryKey(Integer relationId);

    int updateByExampleSelective(@Param("record") CmsCategoryRelation record, @Param("example") CmsCategoryRelationExample example);

    int updateByExample(@Param("record") CmsCategoryRelation record, @Param("example") CmsCategoryRelationExample example);

    int updateByPrimaryKeySelective(CmsCategoryRelation record);

    int updateByPrimaryKey(CmsCategoryRelation record);
}