package com.elastic.mapper;


import java.util.List;

import com.elastic.entity.po.ProdSpuCateRelation;
import com.elastic.entity.po.ProdSpuCateRelationExample;
import com.elastic.entity.po.ProdSpuCateRelationKey;
import org.apache.ibatis.annotations.Param;

public interface ProdSpuCateRelationMapper {
    int countByExample(ProdSpuCateRelationExample example);

    int deleteByExample(ProdSpuCateRelationExample example);

    int deleteByPrimaryKey(ProdSpuCateRelationKey key);

    int insert(ProdSpuCateRelation record);

    int insertSelective(ProdSpuCateRelation record);

    List<ProdSpuCateRelation> selectByExample(ProdSpuCateRelationExample example);

    ProdSpuCateRelation selectByPrimaryKey(ProdSpuCateRelationKey key);

    int updateByExampleSelective(@Param("record") ProdSpuCateRelation record, @Param("example") ProdSpuCateRelationExample example);

    int updateByExample(@Param("record") ProdSpuCateRelation record, @Param("example") ProdSpuCateRelationExample example);

    int updateByPrimaryKeySelective(ProdSpuCateRelation record);

    int updateByPrimaryKey(ProdSpuCateRelation record);
}