package com.elastic.service.vo;

import java.util.List;

public class SearchReturn {

	private List<SearchData> searchData;
	
	private List<ProductInfo> proList;
	
	private long numFound;
	
	private int page;
	
	private long maxPage;
	
	private SearchParams searchParams;
	
	public List<SearchData> getSearchData() {
		return searchData;
	}

	public void setSearchData(List<SearchData> searchData) {
		this.searchData = searchData;
	}

	public List<ProductInfo> getProList() {
		return proList;
	}

	public void setProList(List<ProductInfo> proList) {
		this.proList = proList;
	}

	public long getNumFound() {
		return numFound;
	}

	public void setNumFound(long numFound) {
		this.numFound = numFound;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public long getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(long maxPage) {
		this.maxPage = maxPage;
	}

	public SearchParams getSearchParams() {
		return searchParams;
	}

	public void setSearchParams(SearchParams searchParams) {
		this.searchParams = searchParams;
	}
	
}
