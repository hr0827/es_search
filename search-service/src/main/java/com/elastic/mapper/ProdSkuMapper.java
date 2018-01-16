package com.elastic.mapper;

import com.elastic.entity.po.ProdSku;
import com.elastic.entity.po.ProdSkuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProdSkuMapper {
    int countByExample(ProdSkuExample example);

    int deleteByExample(ProdSkuExample example);

    int deleteByPrimaryKey(String skuId);

    int insert(ProdSku record);

    int insertSelective(ProdSku record);

    List<ProdSku> selectByExample(ProdSkuExample example);

    ProdSku selectByPrimaryKey(String skuId);

    int updateByExampleSelective(@Param("record") ProdSku record, @Param("example") ProdSkuExample example);

    int updateByExample(@Param("record") ProdSku record, @Param("example") ProdSkuExample example);

    int updateByPrimaryKeySelective(ProdSku record);

    int updateByPrimaryKey(ProdSku record);

    ProdSku selectOneDefaultSkuBySpu(String spuId);

    ProdSku selectOneShelfSkuBySpu(String spuId);

    List<ProdSku> selectShelfSkusBySpu(String spuId);

    List<ProdSku> selectSkusBySpu(String spuId);
}