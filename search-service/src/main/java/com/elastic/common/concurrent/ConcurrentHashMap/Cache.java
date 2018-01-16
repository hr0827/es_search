package com.elastic.common.concurrent.ConcurrentHashMap;

import java.util.concurrent.*;

/**
 * Created by xiaotian on 2018/1/8.
 */
public class Cache<A,V> implements  Computable<A,V>{

    private ConcurrentMap<A,Future<V>> cache = new ConcurrentHashMap();

    Computable<A,V> c;
    public Cache(Computable<A,V> c){
        this.c=c;
    }

    @Override
    public V compute(final A args) throws Exception {

        Future<V> vFuture = cache.get(args);
        if (vFuture == null) {
            Callable callable = new Callable() {
                @Override
                public Object call() throws Exception {
                    return c.compute(args);
                }
            };
            FutureTask ft = new FutureTask(callable);
            vFuture = ft;
            cache.put(args, vFuture);
            ft.run();
        }

        return vFuture.get();

    }


}
