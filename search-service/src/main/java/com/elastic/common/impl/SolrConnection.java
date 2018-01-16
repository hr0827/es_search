//package com.elastic.common.impl;
//
//import com.market.index.common.interf.Connection;
//import com.market.index.util.PropertyUtils;
//import org.apache.solr.client.solrj.SolrClient;
//import org.apache.solr.client.solrj.impl.CloudSolrClient;
//import org.apache.solr.client.solrj.impl.HttpSolrClient;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SolrConnection implements Connection {
//
//    // solr 服务器地址
//    private static final String SOLR_SERVER_URL = PropertyUtils.SOLR_SERVER_ADDR + PropertyUtils.COLLECTIONS;
//    private static final String ZK_SERVER = PropertyUtils.ZK_CLOUD_SERVER;
//    private static volatile SolrClient solr;
//
//    private void getServer() {
//        if (PropertyUtils.CLOUD_MODEL.equals("1")) {
//            CloudSolrClient cloudClient = new
//                    CloudSolrClient.Builder().withZkHost(ZK_SERVER).build();
//            cloudClient.setDefaultCollection(PropertyUtils.COLLECTIONS);
//            solr = cloudClient;
//        } else {
//            solr = new HttpSolrClient.Builder(SOLR_SERVER_URL).build();
//        }
//    }
//
//    @Override
//    public SolrClient getSolrConnection() {
//        if (solr == null) {
//            synchronized (this) {
//                if (solr == null) {
//                    this.getServer();
//                }
//            }
//        }
//        return solr;
//    }
//
//}
