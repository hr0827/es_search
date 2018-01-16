package com.elastic.mapper;

import com.elastic.entity.po.ProdSpuAttribute;

import java.util.List;


public interface ProdSpuAttributeMapper {
    int deleteByPrimaryKey(Integer spuAttId);

    int insert(ProdSpuAttribute record);

    int insertSelective(ProdSpuAttribute record);

    ProdSpuAttribute selectByPrimaryKey(Integer spuAttId);

    int updateByPrimaryKeySelective(ProdSpuAttribute record);

    int updateByPrimaryKey(ProdSpuAttribute record);

	List<ProdSpuAttribute> selectBySpuId(String spuId);
}