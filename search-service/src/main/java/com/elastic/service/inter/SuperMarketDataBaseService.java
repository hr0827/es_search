package com.elastic.service.inter;



import com.elastic.entity.GomehigoIndex;

import java.util.List;

public interface SuperMarketDataBaseService {

	public List<GomehigoIndex> getBeans(int skip, int limit);

	public int getMaxNum();


}
