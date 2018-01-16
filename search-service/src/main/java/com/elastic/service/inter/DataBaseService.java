package com.elastic.service.inter;



import com.elastic.entity.GomehigoIndex;

import java.util.List;

public interface DataBaseService {

	public List<GomehigoIndex> getBeans(int skip, int limit);

	public int getMaxNum();
	
	public String getAttrNameByAttrId(int attrId);

}
