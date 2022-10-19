package com.winterbe.java8.samples.stream;

import com.winterbe.misc.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams17Grouping {

    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(Employee.builder().id(1).name("a").price(1.2) .build());
        employeeList.add(Employee.builder().id(2).name("b").price(1.3) .build());
        employeeList.add(Employee.builder().id(3).name("b").price(1.2) .build());
        employeeList.add(Employee.builder().id(4).name("a").price(1.3) .build());
        employeeList.add(Employee.builder().id(5).name("a").price(1.4) .build());
        employeeList.add(Employee.builder().id(7).name("c").price(1.5) .build());

        Map<String,List<Employee>> mp= employeeList.stream().collect(Collectors.groupingBy(Employee::getName));
        mp.forEach((a,b)-> System.out.println(a+" "+b));

    }

}
