package com.elastic.common.concurrent.BlockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by xiaotian on 2018/1/5.
 */
public class Consumer implements  Runnable {

    private BlockingQueue queue;

    public Consumer(BlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public void run() {

        for (int i = 0; i <100 ; i++) {
            try {
                System.out.println("从队列消费....");
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }



    }
}
