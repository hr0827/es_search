package com.elastic.service.pojo;

public class ResultRetrun<T> {
	
	private Result result;
	
	private T data;

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
