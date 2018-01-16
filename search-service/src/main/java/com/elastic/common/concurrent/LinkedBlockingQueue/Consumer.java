package com.elastic.common.concurrent.LinkedBlockingQueue;

/**
 * Created by xiaotian on 2018/1/5.
 */
public class Consumer implements  Runnable {
    private  String instance;
    private Basket basket;

    public Consumer(String instance,Basket basket){
        this.instance = instance;
        this.basket = basket;
    }

    @Override
    public void run() {

        while (true){
            System.out.println("消费者开始消费苹果:"+instance);
            try {
                basket.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费者消费苹果结束:"+instance);
        }

    }
}
