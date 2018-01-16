package com.elastic.common.concurrent.BlockingDeque;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by xiaotian on 2018/1/5.
 */
public class BlockingDequeDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingDeque deque  = new LinkedBlockingDeque();
        deque.addFirst("first");
        deque.addLast("last");

        System.out.println(deque.takeFirst());
        System.out.println(deque.takeLast());


    }
}
