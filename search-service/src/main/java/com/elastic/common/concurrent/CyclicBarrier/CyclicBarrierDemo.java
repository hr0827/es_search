package com.elastic.common.concurrent.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by xiaotian on 2018/1/5.
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        int N = 4;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N, new Runnable() {
            @Override
            public void run() {
                System.out.println("当前线程"+Thread.currentThread().getName()+"正在执行其他任务");
            }
        });
        for (int i = 0; i <N ; i++) {
            new Thread(new Writer(cyclicBarrier)).start();
        }

    }
    static class Writer implements Runnable{
        private CyclicBarrier cyclicBarrier;

        public Writer(CyclicBarrier cyclicBarrier){
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {

            System.out.println("线程"+Thread.currentThread().getName()+"正在写入数据....");
            try {
                Thread.sleep(1000);
                System.out.println("线程"+Thread.currentThread().getName()+"写入完毕，等待其他线程写入");
                cyclicBarrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("所有线程处理完毕，等待其他任务执行....");

        }
    }
}
