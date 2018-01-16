package com.elastic.service.pojo;

public class SearchBean {

    private String query;

    private Filter filter;

    private String sortField;

    private Integer sortType;

    private Integer page;

    private Integer size;
    private Integer start;

    private String[] facetFields;

    private Boolean isFacet;

    private Boolean searchSku;

    private String source;
    private boolean searchCat;
    private String cid;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public boolean getSearchCat() {
        return searchCat;
    }

    public void setSearchCat(boolean searchCat) {
        this.searchCat = searchCat;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public Integer getSortType() {
        return sortType;
    }

    public void setSortType(Integer sortType) {
        this.sortType = sortType;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String[] getFacetFields() {
        return facetFields;
    }

    public void setFacetFields(String... facetFields) {
        this.facetFields = facetFields;
    }

    public Boolean getIsFacet() {
        return isFacet;
    }

    public void setIsFacet(Boolean isFacet) {
        this.isFacet = isFacet;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Boolean getSearchSku() {
        return searchSku;
    }

    public void setSearchSku(Boolean searchSku) {
        this.searchSku = searchSku;
    }
}
