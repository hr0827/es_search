package com.elastic.dao.impl;

import java.io.IOException;


import com.elastic.dao.BaseIndexDao;
import org.springframework.stereotype.Repository;

@Repository
public class BaseSearchDaoImpl implements BaseIndexDao {

//	@Override
//	public UpdateResponse addIndexByBean(SolrClient conn, Object bean) throws IOException, SolrServerException {
//		UpdateResponse response = conn.addBean(bean);
//		return response;
//	}
//
//	@Override
//	public UpdateResponse addIndexByDoc(SolrClient conn, SolrInputDocument document) throws SolrServerException, IOException {
//		UpdateResponse response = conn.add(document);
//		return response;
//	}
//
//	@Override
//	public UpdateResponse deleteIndexById(SolrClient conn, String id) throws SolrServerException, IOException {
//		UpdateResponse response = conn.deleteById(id);
//		return response;
//	}
//
//	@Override
//	public QueryResponse queryByParam(SolrClient conn, ModifiableSolrParams params) throws SolrServerException, IOException {
//		QueryResponse response = conn.query(params);
//		return response;
//	}
//
//	@Override
//	public QueryResponse queryBySolrQuery(SolrClient conn, SolrQuery solrQuery) throws SolrServerException, IOException {
//		QueryResponse response=conn.query(solrQuery);
//		return response;
//	}
//
//	@Override
//	public QueryResponse queryBySolrQuery(SolrClient client, ModifiableSolrParams params) throws SolrServerException, IOException {
//		QueryResponse response=client.query(params);
//		return response;
//	}
//
	
}
