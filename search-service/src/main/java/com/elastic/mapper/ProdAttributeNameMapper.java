package com.elastic.mapper;


import com.elastic.entity.po.ProdAttributeName;

public interface ProdAttributeNameMapper {
    int deleteByPrimaryKey(Integer attId);

    int insert(ProdAttributeName record);

    int insertSelective(ProdAttributeName record);

    ProdAttributeName selectByPrimaryKey(Integer attId);

    int updateByPrimaryKeySelective(ProdAttributeName record);

    int updateByPrimaryKey(ProdAttributeName record);
}