package com.elastic.common.concurrent.ForkJoinPool;

/**
 * Created by xiaotian on 2018/1/10.
 */
public class RecursiveActionDemo {
    public static void main(String[] args) {
        MyRecursiveAction action = new MyRecursiveAction(20);
        action.invoke();
    }
}
