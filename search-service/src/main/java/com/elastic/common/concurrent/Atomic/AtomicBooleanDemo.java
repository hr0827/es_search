package com.elastic.common.concurrent.Atomic;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by xiaotian on 2018/1/5.
 */
public class AtomicBooleanDemo {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        System.out.println("get:"+atomicBoolean.get());
        System.out.println("getAndSet:"+atomicBoolean.getAndSet(false));
        boolean oldValue = false;
        boolean newValue = true;
        AtomicBoolean atomicBoolean1 = new AtomicBoolean(false);
        System.out.println("compareAndSet:"+atomicBoolean1.compareAndSet(oldValue, newValue));
        System.out.println("--------------------------------------------");
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        atomicBoolean2.set(true);
        System.out.println("atomicBoolean2.get():"+atomicBoolean2.get());

        System.out.println("---------------------------------------------------------");

        AtomicInteger atomicInteger = new AtomicInteger(1);
        System.out.println("atomicInteger.get():"+atomicInteger.get());

        AtomicInteger atomicInteger1 = new AtomicInteger(1);
        int a=1;
        int b=2;
        System.out.println("compareAndSet:"+atomicInteger1.compareAndSet(1, b));

        AtomicInteger atomicInteger2 = new AtomicInteger(1);

        System.out.println("atomicInteger2.addAndGet:"+atomicInteger2.addAndGet(1));
        System.out.println("atomicInteger2.getAndAdd:"+atomicInteger2.getAndAdd(1));
        System.out.println("atomicInteger2.get():"+atomicInteger2.get());

        System.out.println("atomicInteger2.decrementAndGet():"+atomicInteger2.decrementAndGet());

       // System.out.println("atomicInteger2.getAndDecrement():"+atomicInteger2.getAndDecrement());

        System.out.println("atomicInteger2.incrementAndGet():"+atomicInteger2.incrementAndGet());

        System.out.println("atomicInteger2.getAndIncrement():"+atomicInteger2.getAndIncrement());
        System.out.println("atomicInteger2.get():"+atomicInteger2.get());
    }
}
