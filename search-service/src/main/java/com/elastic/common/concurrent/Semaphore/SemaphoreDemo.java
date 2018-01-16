package com.elastic.common.concurrent.Semaphore;

import java.util.concurrent.Semaphore;

/**
 * Created by xiaotian on 2018/1/5.
 */
public class SemaphoreDemo {
    public static void main(String[] args) {

        int N = 8;
        //定义机器
        Semaphore semaphore = new Semaphore(5);
        //工人
        for (int i = 0; i <N ; i++) {
           new Thread(new Worker(i,semaphore)).start();
        }

    }
    static class Worker implements  Runnable{

        private  int num;
        private Semaphore semaphore;
        public Worker(int num,Semaphore semaphore){
            this.num = num;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("工人"+this.num+"占用一个机器生产...");
                Thread.sleep(2000);
                System.out.println("工人"+this.num+"释放机器");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
