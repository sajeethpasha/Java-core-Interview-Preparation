package com.winterbe.misc;

import lombok.*;

@Data
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

}
