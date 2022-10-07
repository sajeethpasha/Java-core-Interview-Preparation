package com.winterbe;

import com.winterbe.misc.Person;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class testing {

    public static void main(String[] args) {
        List<Person> lstPerson=new ArrayList<Person>();
        lstPerson.add(new Person("a",21));
        lstPerson.add(new Person("b",22));
        lstPerson.add(new Person("c",23));
        lstPerson.add(new Person("d",21));
        lstPerson.add(new Person("e",22));
        lstPerson.add(new Person("f",25));

         //Map<Integer,List<Person>> s= lstPerson.stream().collect(Collectors.groupingBy(Person::getAge));
        lstPerson.stream().collect(Collectors.toMap(p->p.getName(),p->p.getAge())).forEach((a,b)-> System.out.println(a+" ="+b));

         //s.forEach();


    }
    public static void test2(String[] args) {

        Supplier<String> s=()->new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS").format(new Date());

        System.out.println( s.get());
        System.out.println( s.get());
    }

    public static void test1() {
        List<? extends Number> foo3 = new ArrayList<Number>();  // Number "extends" Number (in this context)
        List<? extends Number> foo4 = new ArrayList<Integer>(); // Integer extends Number
        List<? extends Number> foo5 = new ArrayList<Double>();  // Double extends Number

        List<? super Integer> f1 = new ArrayList<Integer>();  // Integer is a "superclass" of Integer (in this context)
        List<? super Integer> f2 = new ArrayList<Number>();   // Number is a superclass of Integer
        List<? super Integer> f3 = new ArrayList<Object>();   // Object is a superclass of Integer
    }


}
