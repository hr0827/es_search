package com.elastic.mapper;

import com.elastic.entity.po.ProdAttributeValue;

import java.util.List;


public interface ProdAttributeValueMapper {
    int deleteByPrimaryKey(Integer attValueId);

    int insert(ProdAttributeValue record);

    int insertSelective(ProdAttributeValue record);

    ProdAttributeValue selectByPrimaryKey(Integer attValueId);

    int updateByPrimaryKeySelective(ProdAttributeValue record);

    int updateByPrimaryKey(ProdAttributeValue record);

	List<ProdAttributeValue> selectAttrValueByAttrId(Integer attId);
}