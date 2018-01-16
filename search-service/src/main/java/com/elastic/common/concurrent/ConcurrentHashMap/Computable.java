package com.elastic.common.concurrent.ConcurrentHashMap;

/**
 * Created by xiaotian on 2018/1/8.
 */
public interface Computable<A,V> {
    public V compute(A args) throws Exception;
}
