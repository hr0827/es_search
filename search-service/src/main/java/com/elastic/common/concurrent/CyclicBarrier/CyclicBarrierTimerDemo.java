package com.elastic.common.concurrent.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by xiaotian on 2018/1/5.
 */
public class CyclicBarrierTimerDemo {


    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, new Runnable() {
            @Override
            public void run() {
                System.out.println("其他线程执行");
            }
        });
        int N=4;
        for (int i = 0; i <N ; i++) {
            if (i<N-1){
               new Thread(new Writer(cyclicBarrier)).start();
            }else {
                Thread.sleep(5000);
                new Thread(new Writer(cyclicBarrier)).start();
            }
        }
    }

    static  class  Writer implements Runnable{

        private CyclicBarrier cyclicBarrier;
        public Writer(CyclicBarrier cyclicBarrier){
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            System.out.println("线程"+Thread.currentThread().getName()+"正在执行写入操作......");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                System.out.println("线程"+Thread.currentThread().getName()+"写入完毕正等待其他线程......");
                cyclicBarrier.await(2000, TimeUnit.MILLISECONDS);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
            System.out.println("所有线程执行完毕,正准备执行其他任务...");
        }
    }
}
