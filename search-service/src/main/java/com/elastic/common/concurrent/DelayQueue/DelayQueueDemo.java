package com.elastic.common.concurrent.DelayQueue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by xiaotian on 2018/1/5.
 * 延迟阻塞队列
 */
public class DelayQueueDemo {
    public static void main(String[] args) {

        DelayQueue<Delayed> delayQueue = new DelayQueue<Delayed>();
        producer(delayQueue);
        consumer(delayQueue);


    }

    private static void consumer(DelayQueue<Delayed> delayQueue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    Delayed delayedElement = null;
                    try {
                        delayedElement= delayQueue.take();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("take:"+delayedElement);
                }
            }
        }).start();
    }

    private static void producer(DelayQueue<Delayed> delayQueue) {
        new Thread(new Runnable() {
            @Override
            public void run() {

              while (true){
                  try {
                      TimeUnit.MILLISECONDS.sleep(100);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  Delayed delayed = new DelayedElement(1000,"tets");
                  delayQueue.offer(delayed);
              }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("element="+delayQueue.size());
                    System.out.println("delayQueue="+delayQueue);
                }
            }
        }).start();
    }
}
