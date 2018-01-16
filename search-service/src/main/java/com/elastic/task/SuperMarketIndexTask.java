package com.elastic.task;


import com.elastic.common.conn.EsClient;
import com.elastic.service.inter.EsService;
import com.elastic.service.inter.SuperMarketDataBaseService;
import com.elastic.util.DateUtil;
import com.elastic.util.PropertyUtils;
import com.elastic.util.SpringApplicationUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

@Component
public class SuperMarketIndexTask {

    private static final Logger logger = Logger.getLogger(SuperMarketIndexTask.class);

    @Resource(name = "threadPoolTaskExecutor")
    private ThreadPoolTaskExecutor poolTaskExecutor;

    @Resource(name = "esServiceImpl")
    private EsService esService;

    @Resource(name = "superMarketDataBaseServiceImpl")
    private SuperMarketDataBaseService dataBaseService;

    /*@Resource(name = "cacheClient")
    private CacheClient cacheClient;*/

    private EsClient esClient;




    public void fullIndex() {
        try {
            esClient = SpringApplicationUtils.getBean(EsClient.class);
            logger.warn("超市索引同步开始时间:"+ DateUtil.datetimeToStr(new Date(), "yyyy-MM-dd HH:mm:ss.SSS"));
            int skip = 0;
            int limit = Integer.parseInt(PropertyUtils.INDEX_FULL_LIMIT);
            long maxNum = dataBaseService.getMaxNum();
            // 组建任务线程队列
            ArrayList<Future<Integer>> futureTasks = new ArrayList<Future<Integer>>();
            // 向任务队列中添加任务到线程或者索引数终止
            while (!esService.isEnd(skip, maxNum)) {
                futureTasks.add(getFuture(dataBaseService, skip, limit));
                skip = skip + limit;
            }
            while (futureTasks.size() > 0) {
                ArrayList<Future<Integer>> tmpFutureTasks = new ArrayList<Future<Integer>>();
                for (Future<Integer> future : futureTasks) {
                    if (!future.isDone()) {
                        tmpFutureTasks.add(future);
                        continue;
                    }
                     if (!esService.isEnd(skip, maxNum)) {
                        tmpFutureTasks.add(getFuture(dataBaseService, skip, limit));
                        skip = skip + limit;
                    }
                }
                if (tmpFutureTasks.size() == 0)
                    break;
                futureTasks = tmpFutureTasks;
                Thread.sleep(500);
            }
            logger.warn("超市索引同步结束时间:"+ DateUtil.datetimeToStr(new Date(), "yyyy-MM-dd HH:mm:ss.SSS"));
        } catch (Exception e) {
            logger.error("supermarket fullIndex throw an exception ERROR:", e);
        }
    }

    private Future<Integer> getFuture(SuperMarketDataBaseService dataBaseService, int skip, int limit) {
        SuperMarketIndexAsyc indexTask = new SuperMarketIndexAsyc();
        indexTask.setParameters(skip, limit, esClient.getConnection(), dataBaseService);
        FutureTask<Integer> future = new FutureTask<Integer>(indexTask);
        poolTaskExecutor.execute(future);
        return future;
    }
}
