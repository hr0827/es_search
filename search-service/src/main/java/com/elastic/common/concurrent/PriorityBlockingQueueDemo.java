package com.elastic.common.concurrent;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by xiaotian on 2018/1/5.
 * 优先级阻塞队列
 */
public class PriorityBlockingQueueDemo {
    private  static  PriorityBlockingQueue<User> queue = new PriorityBlockingQueue();
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            queue.offer(new User("xiaot"+i,i));
        }

        for (User user: queue) {
            System.out.println(user.getName());
        }
    }


    static class  User implements Comparable<User>{

        private String name;
        private int age;
        public User(String name,int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(User user) {
            return this.age-user.getAge();
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}

