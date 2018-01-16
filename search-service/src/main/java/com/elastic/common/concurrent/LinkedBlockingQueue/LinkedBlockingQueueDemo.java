package com.elastic.common.concurrent.LinkedBlockingQueue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xiaotian on 2018/1/5.
 * 链表阻塞队列
 */
public class LinkedBlockingQueueDemo {
    public static void main(String[] args) {
        Basket basket = new Basket();

        ExecutorService executorService = Executors.newCachedThreadPool();
        Producer producer1 = new Producer("生产者1",basket);
        Producer producer2 = new Producer("生产者2",basket);
        Consumer consumer1 = new Consumer("消费者1",basket);
        executorService.submit(producer1);
        executorService.submit(producer2);
        executorService.submit(consumer1);


    }
}
