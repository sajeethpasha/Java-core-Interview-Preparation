package com.winterbe.misc;

public class MultiTh1 extends  Thread {

    volatile int k;

    @Override
    public void run() {
        //inc();
        for (int i = 0; i < 200000; i++) {
 synchronized (this)
 {
     k++;
 }



        }
    }

    public synchronized void inc()
    {
        for (int i = 0; i < 200000; i++) {

                k++;


        }
    }
    public int getK() {
        return k;
    }
}
