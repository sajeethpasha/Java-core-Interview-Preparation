package com.winterbe.misc.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericExtendsAndSuper {

    public static void main(String[] args) {
        List<? extends GenD > de= new ArrayList<GenD>(); //D,E only

        List<? super GenD > ds= new ArrayList<GenC>(); //D,C,B,A



        List<? extends Number> foo3 = new ArrayList<Float>();
        List<? super Number > f4 = new ArrayList<Number>();
    }
}
