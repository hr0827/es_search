package com.elastic.common.concurrent.ThreadPoolExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xiaotian on 2018/1/6.
 * 线程池执行者
 * 当一个任务委托给线程池时，如果池中线程数量低于 corePoolSize，一个新的线程将被创建，即使池中可能尚有空闲线程。
 如果内部任务队列已满，而且有至少 corePoolSize 正在运行，但是运行线程的数量低于 maximumPoolSize，一个新的线程将被创建去执行该任务。
 */
public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        int corePoolSize=3;
        int maximumPoolSize=6;
        long keepAliveTime=5000;
        ExecutorService executorThreadPool  = new ThreadPoolExecutor(corePoolSize,maximumPoolSize,keepAliveTime, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());

        executorThreadPool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("ThreadPoolExecutor.run");
            }
        });
    }
}
