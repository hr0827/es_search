package com.elastic.mapper;


import com.elastic.entity.po.ProdCategory;

public interface ProdCategoryMapper {
    int deleteByPrimaryKey(Integer cateId);

    int insert(ProdCategory record);

    int insertSelective(ProdCategory record);

    ProdCategory selectByPrimaryKey(Integer cateId);

    int updateByPrimaryKeySelective(ProdCategory record);

    int updateByPrimaryKey(ProdCategory record);
}