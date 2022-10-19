package com.winterbe.java8.samples.misc;

import com.winterbe.misc.Employee;
import com.winterbe.misc.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExample {
    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>();
        //employeeList.add(Employee.builder().id(2).name("sajeeth3").price(2.4).build());
        employeeList.add(Employee.builder().id(1).name("sajeeth").price(2.1).build());
        employeeList.add(Employee.builder().id(2).name("sajeeth2").price(2.5).build());
        employeeList.add(Employee.builder().id(4).name("sajeeth4").price(2.2).build());
        employeeList.add(Employee.builder().id(3).name("sajeeth3").price(2.4).build());

       // Collections.sort(employeeList,(o1, o2) -> (int) (o1.getPrice() -(o2.getPrice())));
        Collections.sort(employeeList, Comparator.comparing(Employee:: getPrice));
        employeeList.forEach(d->{
            System.out.println(d);
        });
    }
}
