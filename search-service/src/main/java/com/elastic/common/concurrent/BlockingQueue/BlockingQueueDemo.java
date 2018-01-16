package com.elastic.common.concurrent.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by xiaotian on 2018/1/5.
 * 阻塞队列
 */
public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue(100);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
       new Thread(producer).start();
       new Thread(consumer).start();
    }
}
