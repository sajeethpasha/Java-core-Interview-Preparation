package com.winterbe.java8.samples.stream;

import com.winterbe.misc.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams16 {

    public static void main(String[] args) {
        test4();
    }

    public static void test5()
    {
        // Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);

        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        System.out.println("The Structure before flattening is : " +
                listOfListofInts);

        // Using flatMap for transformating and flattening.
        List<Integer> listofInts  = listOfListofInts.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("The Structure after flattening is : " +
                listofInts);
    }

    public static void test4() {

        // Creating a List of Strings
        List<String> list = Arrays.asList("5.6", "7.4", "4",
                "1", "2.3");

        // Using Stream flatMap(Function mapper)
        //list.stream().flatMap(num -> Stream.of(num)).forEach(System.out::println);

        // Creating a List of Strings
        List<String> list2 = Arrays.asList("Geeks", "GFG",
                "GeeksforGeeks", "gfg");

        // Using Stream flatMap(Function mapper)
        list2.stream().flatMap(str ->
                        Stream.of(str.charAt(2))).
                forEach(System.out::println);
    }

    public static void test3() {
        List<Integer> list = Arrays.asList(3,3, 4, 6, 12, 20,6);
        list.stream().takeWhile(d->d>3).forEach(d-> System.out.println(d));
    }
    public static void test2() {

        List<Integer> list = Arrays.asList(3,3, 4, 6, 12, 20,6);
        list.stream().distinct().forEach(d-> System.out.println(d));
//        3
//        4
//        6
//        12
//        20

    }
    public static void test1() {
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
        System.out.println( list.stream().anyMatch(d->d==3) );

        System.out.println( list.stream().noneMatch(d->d==60));

    }

}
