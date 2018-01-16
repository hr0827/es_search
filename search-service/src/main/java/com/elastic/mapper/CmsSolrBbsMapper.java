package com.elastic.mapper;



import com.elastic.entity.po.CmsSolrBbs;
import com.elastic.entity.po.CmsSolrBbsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsSolrBbsMapper {
    int countByExample(CmsSolrBbsExample example);

    int deleteByExample(CmsSolrBbsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsSolrBbs record);

    int insertSelective(CmsSolrBbs record);

    List<CmsSolrBbs> selectByExampleWithBLOBs(CmsSolrBbsExample example);

    List<CmsSolrBbs> selectByExample(CmsSolrBbsExample example);

    CmsSolrBbs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsSolrBbs record, @Param("example") CmsSolrBbsExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsSolrBbs record, @Param("example") CmsSolrBbsExample example);

    int updateByExample(@Param("record") CmsSolrBbs record, @Param("example") CmsSolrBbsExample example);

    int updateByPrimaryKeySelective(CmsSolrBbs record);

    int updateByPrimaryKeyWithBLOBs(CmsSolrBbs record);

    int updateByPrimaryKey(CmsSolrBbs record);
}