package com.elastic.service.vo;

import java.util.List;

public class SearchData {

	private String descpName;
	private boolean isShow;
	private List<Item> itemArray;
	private String field;
	private int count;
	private int sort;

	public String getDescpName() {
		return descpName;
	}

	public void setDescpName(String descpName) {
		this.descpName = descpName;
	}

	public boolean getIsShow() {
		return isShow;
	}

	public void setIsShow(boolean isShow) {
		this.isShow = isShow;
	}

	public List<Item> getItemArray() {
		return itemArray;
	}

	public void setItemArray(List<Item> itemArray) {
		this.itemArray = itemArray;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

}
