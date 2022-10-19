package com.winterbe.misc;

import lombok.*;

//@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

    int id;
    String name;
    double price;


    public Employee getAdd(int i)
    {
        Employee emp= new Employee();
        emp.id=i;
        return  emp;
    }

    public void salaryIncrement(double v) {
       // this.v= Double.valueOf(v*this.v);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
