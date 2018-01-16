package com.elastic.mapper;

import com.elastic.entity.po.ProdSkuAttribute;

import java.util.List;


public interface ProdSkuAttributeMapper {
    int deleteByPrimaryKey(Integer skuAttId);

    int insert(ProdSkuAttribute record);

    int insertSelective(ProdSkuAttribute record);

    ProdSkuAttribute selectByPrimaryKey(Integer skuAttId);

    int updateByPrimaryKeySelective(ProdSkuAttribute record);

    int updateByPrimaryKey(ProdSkuAttribute record);

	List<ProdSkuAttribute> selectBySkuId(String skuId);
}