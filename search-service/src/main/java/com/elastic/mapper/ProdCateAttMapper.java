package com.elastic.mapper;

import com.elastic.entity.po.ProdCateAtt;

import java.util.List;


public interface ProdCateAttMapper {
    int deleteByPrimaryKey(Integer cateAttId);

    int insert(ProdCateAtt record);

    int insertSelective(ProdCateAtt record);

    ProdCateAtt selectByPrimaryKey(Integer cateAttId);

    int updateByPrimaryKeySelective(ProdCateAtt record);

    int updateByPrimaryKey(ProdCateAtt record);

	List<ProdCateAtt> selectByCateId(Integer integer);
}