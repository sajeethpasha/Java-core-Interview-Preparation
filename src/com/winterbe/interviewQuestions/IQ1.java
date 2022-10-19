package com.winterbe.interviewQuestions;

import com.winterbe.misc.Employee;

import java.util.*;

public class IQ1 {

    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        //employeeList.add(Employee.builder().id(2).name("sajeeth3").price(2.4).build());
        employeeList.add(Employee.builder().id(1).name("sajeeth").price(2.1).build());
        employeeList.add(Employee.builder().id(2).name("sajeeth2").price(2.5).build());
        employeeList.add(Employee.builder().id(4).name("sajeeth4").price(2.2).build());
        employeeList.add(Employee.builder().id(3).name("sajeeth2").price(2.4).build());
        // employeeList.add(Employee.builder().id(3).name("sajeeth3").price(2.1).build());

        Set<String> distinctCompanies = new HashSet<>();
        employeeList.stream().map(d->d.getName())
                .filter(d->  !distinctCompanies.add(d)).forEach(d-> System.out.println(d));


    }
}
