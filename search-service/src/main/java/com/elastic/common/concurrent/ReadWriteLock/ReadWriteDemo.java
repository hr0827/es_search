package com.elastic.common.concurrent.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by xiaotian on 2018/1/9.
 */
public class ReadWriteDemo {

    private ReadWriteLock readWriteLock   = new ReentrantReadWriteLock();



    public void get(){
        readWriteLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"正在读取数据....");
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            readWriteLock.readLock().unlock();
        }

    }

    public void  put(){
        readWriteLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"正在写入数据....");
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public static void main(String[] args) {

        ReadWriteDemo readWriteDemo  = new ReadWriteDemo();

        for (int i = 0; i <3 ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                 readWriteDemo.get();
                }
            }).start();
        }

        for (int i = 0; i <3 ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                 readWriteDemo.put();
                }
            }).start();
        }

    }

}
