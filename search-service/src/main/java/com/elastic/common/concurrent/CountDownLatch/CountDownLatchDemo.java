package com.elastic.common.concurrent.CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by xiaotian on 2018/1/5.
 * CountDownLatch等待所有其他线程执行完毕再执行其他线程
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(2);
        System.out.println(latch.getCount());
        for (int i = 0; i <latch.getCount() ; i++) {
          new Thread(new Runnable() {
              @Override
              public void run() {
                  System.out.println("子线程"+Thread.currentThread().getName()+"正在执行");
                  try {
                      Thread.sleep(3000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  System.out.println("子线程"+Thread.currentThread().getName()+"正在执行完毕");
                  latch.countDown();
              }
          }).start();
        }

        System.out.println("等待2个子线程执行完毕");
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2个子线程执行完毕");
        System.out.println("主线程开始执行");
    }
}
