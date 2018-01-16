package com.elastic.service.inter;

/**
 * Created by xiaotian on 2017/12/2.
 */
public interface SearchService {
    public void  search();
    public void  searchByCondition() throws Exception;
    public void  multiSearch();
    public void aggsearch();
    public void metricsAgg();

}
