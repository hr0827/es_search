//package com.elastic.common.impl;
//
//
//import com.market.index.common.interf.Connection;
//import com.market.index.util.PropertyUtils;
//import org.apache.solr.client.solrj.SolrClient;
//import org.apache.solr.client.solrj.impl.CloudSolrClient;
//import org.apache.solr.client.solrj.impl.HttpSolrClient;
//import org.springframework.stereotype.Component;
//
///**
// * 海外购超市
// */
//@Component
//public class SolrSuperMarketConnection implements Connection {
//
//    // solr 服务器地址
//    public static final String SOLR_SERVER_URL = PropertyUtils.SOLR_SERVER_ADDR + PropertyUtils.MARKET_COLLECTIONS;
//
//    public static final String ZK_SERVER = PropertyUtils.ZK_CLOUD_SERVER;
//    private SolrClient solr = null;
//
//    public SolrSuperMarketConnection() {
//        if (PropertyUtils.CLOUD_MODEL.equals("1")) {
//            CloudSolrClient cloudClient = new
//                    CloudSolrClient.Builder().withZkHost(ZK_SERVER).build();
//            cloudClient.setDefaultCollection(PropertyUtils.MARKET_COLLECTIONS);
//            solr = cloudClient;
//        } else {
//            solr = new HttpSolrClient.Builder(SOLR_SERVER_URL).build();
//        }
//    }
//
//    @Override
//    public SolrClient getSolrConnection() {
//        if (solr == null) {
//            synchronized (SolrSuperMarketConnection.class) {
//                if (solr == null) {
//                    new SolrSuperMarketConnection();
//                }
//            }
//        }
//        return solr;
//    }
//
//}
