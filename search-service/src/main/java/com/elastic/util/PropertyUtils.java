package com.elastic.util;

import com.gomehigo.diamond.DiamondOP;

public class PropertyUtils {

    public static String INDEX_FULL_LIMIT;
    public static String BBS_COLLECTIONS;
    public static String COLLECTIONS;
    public static String CLOUD_MODEL;
    public static String ZK_CLOUD_SERVER;
    public static String REAR_SOLR_ADDR;
    public static String SOLR_SERVER_ADDR;
    public static String API_SERVER_ADDR;
    public static String API_INDEX_SUIT_SERVER;
    public static String API_INDEX_BBS_SERVER;

    public static String MARKET_COLLECTIONS;
    public static String MARKET_COLLECTIONS_SPU;

    static {
        INDEX_FULL_LIMIT = DiamondOP.getProperty("GOME_MARKET_SERVICE", "SEARCH_INDEX", "index.full.limit", "100");
        //BBS_COLLECTIONS = DiamondOP.getProperty("GOME_MARKET_SERVICE", "SEARCH_INDEX", "solr.collections.bbs", "");
        //COLLECTIONS = DiamondOP.getProperty("GOME_MARKET_SERVICE", "SEARCH_INDEX", "solr.collections", "");
        CLOUD_MODEL = DiamondOP.getProperty("GOME_MARKET_SERVICE", "SEARCH_INDEX", "solr.cloud.model", "");
        ZK_CLOUD_SERVER = DiamondOP.getProperty("GOME_MARKET_SERVICE", "SEARCH_INDEX", "zk_cloud_server", "");
        REAR_SOLR_ADDR = DiamondOP.getProperty("GOME_MARKET_SERVICE", "SEARCH_INDEX", "solr.server.real.addr", "");
        SOLR_SERVER_ADDR = DiamondOP.getProperty("GOME_MARKET_SERVICE", "SEARCH_INDEX", "solr.server.url", "");
        API_SERVER_ADDR = DiamondOP.getProperty("GOME_MARKET_SERVICE", "SEARCH_INDEX", "api.server", "");
        //API_INDEX_SUIT_SERVER = DiamondOP.getProperty("GOME_MARKET_SERVICE", "SEARCH_INDEX", "api.index.suit.server", "");
        //API_INDEX_BBS_SERVER = DiamondOP.getProperty("GOME_MARKET_SERVICE", "SEARCH_INDEX", "api.index.bbs.server", "");
        //超市
        MARKET_COLLECTIONS = DiamondOP.getProperty("GOME_MARKET_SERVICE", "SEARCH_INDEX", "solr.collections.supermarket", "");
        MARKET_COLLECTIONS_SPU = DiamondOP.getProperty("GOME_MARKET_SERVICE", "SEARCH_INDEX", "solr.collections.spu.supermarket", "");

    }

}
