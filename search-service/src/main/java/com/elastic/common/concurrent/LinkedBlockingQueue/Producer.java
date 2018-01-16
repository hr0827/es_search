package com.elastic.common.concurrent.LinkedBlockingQueue;

/**
 * Created by xiaotian on 2018/1/5.
 */
public class Producer implements Runnable {
    private  String instance;
    private Basket basket;

    public Producer(String instance,Basket basket){
        this.instance = instance;
        this.basket = basket;
    }

    @Override
    public void run() {

        while (true){
            System.out.println("生产者准备生产苹果:"+instance);
            basket.produce();
            System.out.println("生产者生产苹果结束:"+instance);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
