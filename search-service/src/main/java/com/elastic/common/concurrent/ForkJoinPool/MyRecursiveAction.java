package com.elastic.common.concurrent.ForkJoinPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by xiaotian on 2018/1/10.
 */
public class MyRecursiveAction extends RecursiveAction {

    private AtomicLong workLoad = new AtomicLong();
    public MyRecursiveAction(long workLoad){
        this.workLoad.set(workLoad);
    }

    @Override
    protected void compute() {

        if (2<= workLoad.get()){
            //创建子任务
            List<MyRecursiveAction> taskList = new ArrayList<>();
            taskList.addAll(createSubtasks());
            taskList.forEach(myRecursiveAction -> {
                myRecursiveAction.fork();
            });
            workLoad.incrementAndGet();
        }else {
            System.out.println(Thread.currentThread().getName()+"  Doing workLoad myself:"+this.workLoad);
        }


    }

    private  List<MyRecursiveAction>   createSubtasks() {

        List<MyRecursiveAction> taskList = new ArrayList<>();
        int cpuCount = Runtime.getRuntime().availableProcessors();
        for (int i = 0; i <cpuCount ; i++) {
            taskList.add(new MyRecursiveAction(this.workLoad.get()/2));
        }

        return taskList;
    }

    /**
     * Created by xiaotian on 2018/1/10.
     */
    public static class RecursiveActionDemo {
        public static void main(String[] args) {

        }
    }
}
