package com.example.demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Tickect {
    private int m=30;
    private  Lock lock=new ReentrantLock();
    public void buy(){
        lock.lock();

        try {
            if (m >0) {
                System.out.println(Thread.currentThread().getName()+"第："+m+"张票被卖出");
            }
        } finally {
         lock.unlock();
        }
    }
}


public class CurrentLock {
    public static void main(String[] args) {

    }
}
