package com.elastic.common.concurrent.ExecutorService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

/**
 * Created by xiaotian on 2018/1/6.
 * http://blog.csdn.net/educast/article/details/77102360
 *
 */
public class ExecutorServiceDemo {
    public static void main(String[] args) throws Exception {

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("this is a test");
            }
        });

        Future<?> future = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("this is submit");
            }
        });
        System.out.println("future.get():"+future.get());


        Future<String> stringFuture = executorService.submit(new Callable<String>() {

            @Override
            public String call() throws Exception {
                return "success";
            }
        });

        System.out.println("stringFuture:"+stringFuture.get());

        System.out.println("-------------------------------------------");
        Set<Callable<String>> callables = new HashSet<>();
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task 1";
            }
        });
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task 2";
            }
        });

        String res = executorService.invokeAny(callables);

        System.out.println("res:"+res);

        System.out.println("---------------------------------------------------");

        List<Future<String>> futures = executorService.invokeAll(callables);
        for (Future<String> future1: futures) {
            System.out.println("future1.get():"+future1.get());
        }


        executorService.shutdown();

    }
}
