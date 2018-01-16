package com.elastic.mapper;


import com.elastic.entity.po.CmsModuleCountry;

public interface CmsModuleCountryMapper {
    int deleteByPrimaryKey(Integer countryId);

    int insert(CmsModuleCountry record);

    int insertSelective(CmsModuleCountry record);

    CmsModuleCountry selectByPrimaryKey(Integer countryId);

    int updateByPrimaryKeySelective(CmsModuleCountry record);

    int updateByPrimaryKey(CmsModuleCountry record);
}