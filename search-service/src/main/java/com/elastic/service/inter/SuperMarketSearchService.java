package com.elastic.service.inter;


import com.elastic.service.pojo.SearchBean;

public interface SuperMarketSearchService {

	public String searchByBean(SearchBean bean);

	public String suggestByBean(SearchBean bean);

}
