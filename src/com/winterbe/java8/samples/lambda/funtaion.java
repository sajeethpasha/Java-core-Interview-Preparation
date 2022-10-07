package com.winterbe.java8.samples.lambda;

import java.util.function.Function;

public class funtaion {
    public static void main(String args[])
    {
        // Function which takes in a number and
        // returns half of it
        Function<Integer, Double> half = a -> a / 2.0;

        // Now treble the output of half function
        half = half.andThen(a -> 3 * a);

        half = half.andThen(a -> 2* a);

        // Applying the function to get the result
        // and printing on console
        System.out.println(half.apply(10));
    }
    // Main driver method
    public static void test1()
    {
        // Function which takes in a number
        // and returns half of it
        Function<Integer, Double> half = a -> a * 2.55;
        Function<Integer, Integer> mult = a -> a * 2;

        // Applying the function to get the result
        System.out.println(mult.apply(10));
    }
}
