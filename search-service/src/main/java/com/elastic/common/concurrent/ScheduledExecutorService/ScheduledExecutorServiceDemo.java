package com.elastic.common.concurrent.ScheduledExecutorService;

import java.util.StringJoiner;
import java.util.concurrent.*;

/**
 * Created by xiaotian on 2018/1/6.
 */
public class ScheduledExecutorServiceDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
        ScheduledFuture<?> schedule = executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("schedule.Runnable");
            }
        }, 5, TimeUnit.MILLISECONDS);

        ScheduledFuture<String> scheduledFuture = executorService.schedule(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "schedule.Callable";
            }
        }, 5, TimeUnit.MILLISECONDS);
        System.out.println("scheduledFuture.get():"+scheduledFuture.get());
        System.out.println("--------------------------------------");

        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("init 5s  every 1s execute");
            }
        },5,1,TimeUnit.MILLISECONDS);








        executorService.shutdown();
    }
}
