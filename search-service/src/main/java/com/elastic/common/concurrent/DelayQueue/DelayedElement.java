package com.elastic.common.concurrent.DelayQueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by xiaotian on 2018/1/5.
 * 延迟队列
 */
public class DelayedElement implements Delayed {

    private long delay;
    private long expire;
    private long now;
    private String msg;

    public  DelayedElement(long delay,String data){
        this.delay = delay;
        this.expire = System.currentTimeMillis()+delay;
        this.now = System.currentTimeMillis();
        this.msg = data;
    }



    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(expire-System.currentTimeMillis(),TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return (int)(this.getDelay(TimeUnit.MILLISECONDS)-o.getDelay(TimeUnit.MILLISECONDS));
    }

    @Override
    public String toString() {
        return "delay="+this.delay+","+"expire="+this.expire+","+"data="+msg;
    }
}
