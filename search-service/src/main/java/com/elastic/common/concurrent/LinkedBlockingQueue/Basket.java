package com.elastic.common.concurrent.LinkedBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by xiaotian on 2018/1/5.
 * 篮子
 */
public class Basket {
    private BlockingQueue<String> queue = new LinkedBlockingDeque();
    public void  produce(){
        queue.offer("An Apple");
    }
    public String consume() throws InterruptedException {
       return  queue.take();
    }
}
