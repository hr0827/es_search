package com.elastic.service.inter;

public interface EsService {

	long getMaxNum();

	boolean isEnd(int skip, long maxNum);

}
