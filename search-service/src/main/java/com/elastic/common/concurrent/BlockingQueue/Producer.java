package com.elastic.common.concurrent.BlockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by xiaotian on 2018/1/5.
 */
public class Producer  implements  Runnable {

    private BlockingQueue queue = null;

    public Producer(BlockingQueue queue){
       this.queue = queue;
   }
    @Override
    public void run() {

        for (int i = 0; i <100 ; i++) {
            queue.add(i);
            try {
                System.out.println("添加数据到队列....");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
