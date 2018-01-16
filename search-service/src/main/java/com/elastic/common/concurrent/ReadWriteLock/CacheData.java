package com.elastic.common.concurrent.ReadWriteLock;

import com.mchange.v2.util.DoubleWeakHashMap;
import org.apache.commons.jexl.context.HashMapContext;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by xiaotian on 2018/1/9.
 */
public class CacheData {
    private static CacheData cacheData = new CacheData();
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private Map<String,Object> cache = new HashMap<String,Object>();
    private CacheData(){}

    public  static  CacheData getInstance(){
        return cacheData;
    }

    public Object read(String key){
        readWriteLock.readLock().lock();
        Object value = null;
        try {
             value = cache.get(key);
            if (value==null){
                readWriteLock.readLock().unlock();
                readWriteLock.writeLock().lock();
                try {
                    if (value==null){
                        String data="查询数据库";
                        cache.put(key,data);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    readWriteLock.readLock().lock();
                    readWriteLock.writeLock().unlock();
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            readWriteLock.readLock().unlock();
        }
        return value;
    }


}
