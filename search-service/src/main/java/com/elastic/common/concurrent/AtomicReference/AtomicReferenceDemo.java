package com.elastic.common.concurrent.AtomicReference;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by xiaotian on 2018/1/6.
 */
public class AtomicReferenceDemo {
    public static void main(String[] args) {
         String initStr="this is a cat";
        AtomicReference<String> atomicReference = new AtomicReference(initStr);
        System.out.println("atomicReference.get():"+atomicReference.get());

        String newStr = "this is a dog";

        boolean changeed = atomicReference.compareAndSet(initStr, newStr);
        System.out.println("changed:"+changeed);

        changeed= atomicReference.compareAndSet(initStr, newStr);
        System.out.println("changed:"+changeed);
    }
}
