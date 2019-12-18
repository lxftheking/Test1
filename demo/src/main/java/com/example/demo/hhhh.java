package com.example.demo;


class Tick{
    private int num=30;

    public synchronized void buy(){
        if(num>0){
            System.out.println(num--);
        }
    }

}
public class hhhh {
    public static void main(String[] args) {
        Tick tick = new Tick();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<30;i++){
                    tick.buy();
                }
            }
        }, "B").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<30;i++){
                    tick.buy();
                }
            }
        }, "A").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<30;i++){
                    tick.buy();
                }
            }
        }, "C").start();
    }
}
