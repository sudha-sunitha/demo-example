package com.example.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class EmployeeDetails {
    private String name;
    private double monthlySalary;
    private int age;

    public EmployeeDetails() {



    }

    public EmployeeDetails(String name, double salary, int age) {
        this.name = name;
        this.monthlySalary = salary;
        this.age = age;

    }

    /**
     * @return the name
     */

    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the monthlySalary
     */

    public double getMonthlySalary() {
        return monthlySalary;
    }

    /**
     * @param monthlySalary the monthlySalary to set
     */

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }


}
