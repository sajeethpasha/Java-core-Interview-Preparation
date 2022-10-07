package com.winterbe.java8.samples.lambda;

import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 * Created by grijesh
 */
public class Lambda6 {

    //Pre-Defined Functional Interfaces
    public static void main(String... args) {

       // BikeFunInf bk=(i) ->"input is:"+String.valueOf(i);

        BikeFunInf bk=new BikeClass()::checkData;
        System.out.println(bk.checkData(4));



        BikeFunInf bk2=BikeClass::checkData2;
        System.out.println(bk2.checkData(4));

        //System::

    }
}
