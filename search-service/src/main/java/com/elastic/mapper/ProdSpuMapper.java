package com.elastic.mapper;

import com.elastic.entity.po.ProdSpu;

import java.util.List;


public interface ProdSpuMapper {
    int deleteByPrimaryKey(String spuId);

    int insert(ProdSpu record);

    int insertSelective(ProdSpu record);

    ProdSpu selectByPrimaryKey(String spuId);

    int updateByPrimaryKeySelective(ProdSpu record);

    int updateByPrimaryKey(ProdSpu record);

	List<ProdSpu> queryByBeanForPage(ProdSpu spu);

	int getMaxCount();
}