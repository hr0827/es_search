package com.elastic.task;

import com.elastic.common.conn.EsClient;

import com.elastic.entity.GomehigoIndex;
import com.elastic.service.inter.SuperMarketDataBaseService;
import com.elastic.util.TransUtils;
import org.apache.log4j.Logger;
import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.client.transport.TransportClient;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class SuperMarketIndexAsyc implements Callable<Integer> {

    private int skip; // 开始 坐标

    private int limit; // 步距

    private TransportClient client;

    private SuperMarketDataBaseService dataBaseService;

    private static final Logger logger = Logger.getLogger(SuperMarketIndexAsyc.class);

    public void setParameters(int skip, int limit, TransportClient client, SuperMarketDataBaseService dataBaseService) {
        this.skip = skip;
        this.limit = limit;
        this.client = client;
        this.dataBaseService = dataBaseService;
    }

    @Override
    public Integer call() throws Exception {

        List<GomehigoIndex> beans = dataBaseService.getBeans(skip, limit);
        logger.info("SuperMarket索引创建开始  第" + skip + "条数据同步个数" + limit);
        if (beans != null && beans.size() > 0) {
            try {
                ArrayList<String> ids = new ArrayList<>();
                BulkRequestBuilder requestBuilder = client.prepareBulk();
                for (int i = 0; i < beans.size(); i++) {
                    GomehigoIndex bean = beans.get(i);
                    //删除组装后的索引数据beans 套装 设置索引数据时以suit_id 设置为主商品skuid
                    ids.add(bean.getId());
                }
                ids.forEach(id ->{
                    requestBuilder.add(client.prepareDelete("gome_market","goods",id));
                });

                if (beans!=null){
                    beans.forEach(gomehigoIndex -> {
                        try {
                            requestBuilder.add(client.prepareIndex("gome_market","goods",gomehigoIndex.getId()).setSource(TransUtils.objectToMap(gomehigoIndex)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });

                }

                requestBuilder.execute().get();
            } catch (Exception e) {
                //client.rollback();
                e.printStackTrace();
                logger.info("SuperMarket索引创建失败,回滚操作完成 第" + skip + "条数据同步个数" + limit);
                logger.error(e.getMessage());
            } finally {
//                client.commit();
//                client.optimize();
                logger.info("SuperMarket索引提交完成  第" + skip + "条数据同步个数" + limit);
            }
            return beans.size();
        } else {
            return 0;
        }
    }

}
