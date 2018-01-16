package com.elastic.service.vo;

import java.util.List;

public class Item {

	private String id;
	private String text;
	private long count;

	List<Item> childs;

	public List<Item> getChilds() {
		return childs;
	}

	public void setChilds(List<Item> childs) {
		this.childs = childs;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

}
