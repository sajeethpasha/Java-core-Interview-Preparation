package com.winterbe.multifthreads;

import com.winterbe.misc.MultiTh1;

public class Sample1 {

    public static void main(String[] args) throws InterruptedException {
        MultiTh1 mt=new MultiTh1();

        Thread t1=new Thread(mt);
        Thread t2=new Thread(mt);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(mt.getK());
    }
}
