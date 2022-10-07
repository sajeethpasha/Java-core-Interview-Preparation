package com.winterbe.java8.samples.stream;

import com.winterbe.misc.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams15 {


//https://stackify.com/streams-guide-java-8/ reference link
    public Streams15() {

    }


    public static void main(String[] args) {

        List<Employee> employeeList=new ArrayList<>();
        //employeeList.add(Employee.builder().id(2).name("sajeeth3").price(2.4).build());
        employeeList.add(Employee.builder().id(1).name("sajeeth").price(2.1).build());
        employeeList.add(Employee.builder().id(2).name("sajeeth2").price(2.5).build());
        employeeList.add(Employee.builder().id(4).name("sajeeth4").price(2.2).build());
        employeeList.add(Employee.builder().id(3).name("sajeeth3").price(2.4).build());
       // employeeList.add(Employee.builder().id(3).name("sajeeth3").price(2.1).build());

      test9( employeeList);
    }
    public static void test9(List<Employee> employeeList){
        employeeList.stream().map(d-> { d.setName("hello"); return d;} ).collect(Collectors.toList()).forEach(d-> System.out.println(d));

    }
    public static void test8(List<Employee> employeeList){
        //employeeList.stream().collect(Collectors.toMap((d)->d.getId(),d->d.getName() ) ). forEach((d,a)-> System.out.println(d+""+a));

        System.out.println(employeeList.stream().mapToDouble(Employee::getId).sum());
    }

    public static void test7(List<Employee> employeeList){
      //  employeeList.stream().mapToDouble(d->d.getPrice()).forEach(d-> System.out.println(d));

      //  employeeList.stream().mapToDouble(Employee::getPrice).average().stream().forEach(d-> System.out.println(d));
        System.out.println( employeeList.stream().mapToDouble(Employee::getPrice).reduce(0.0,(a,b)->{
           return  a+b;
        }) );
    }
    public static void test6(List<Employee> employeeList){
        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);

        boolean allEven = intList.stream().allMatch(i -> i % 2 == 0);
        boolean oneEven = intList.stream().anyMatch(i -> i % 2 == 0);
        boolean noneMultipleOfThree = intList.stream().noneMatch(i -> i % 3 == 0);

        System.out.println(allEven);
        System.out.println(oneEven);
        System.out.println(noneMultipleOfThree);
    }
    public static void test5(List<Employee> employeeList){
        {
             employeeList.stream().distinct().collect(Collectors.toList()).forEach(d-> System.out.println(d));
        }
    }
    public static void test4(List<Employee> employeeList){



        //List<Employee> employees =employeeList.stream().sorted((a,b)->a.getPrice()-b.getPrice()).collect(Collectors.toList());
        System.out.println( employeeList.stream().sorted((a,b)->a.getId()-b.getId()).collect(Collectors.toList()));


//                empList.stream()
//                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
//                .collect(Collectors.toList());
    }

    public static void test3(){
        Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 10.0),
                new Employee(2, "Bill Gates", 20.0),
                new Employee(3, "Mark Zuckerberg", 30.0)
        };

        List<Employee> empList = Arrays.asList(arrayOfEmps);

        empList.stream()
                .peek(e -> e.salaryIncrement(10.0))
                .peek(System.out::println)

                .collect(Collectors.toList());

        System.out.println("*********");
        System.out.println( empList);
    }
    public static void test2(){
        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> namesFlatStream = namesNested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(namesFlatStream);
    }
    public static void test1() {
        Integer[] empIds = { 1, 2, 3 };

        List<Employee> employees = Stream.of(empIds)
                .map(new Employee()::getAdd)
                .collect(Collectors.toList());

        List<Employee> employees2 = Stream.of(empIds)
                .map((t)->{
                    Employee emp= new Employee();
                    emp.setId(t);
                    return  emp;
                })
                .collect(Collectors.toList());

        List<Integer> integerList= employees2.stream().map(d->{
            return  d.getId();
        }).collect(Collectors.toList());
        System.out.println(integerList);

        employees2.stream().toArray(Employee[]::new);

        //System.out.println(employees2.toString());
    }
}
