package com.example.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDetailsTest {
    EmployeeDetails employee=new EmployeeDetails();
    EmpBusinessLogic empBusinessLogic=new EmpBusinessLogic();
    @Test
    public void testCalculateAppriasal(){
        System.out.println("test case testCalculateAppriasal");
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);
        double appraisal=empBusinessLogic.calculateAppraisal(employee);
        System.out.println("appraisal ::"+appraisal);
        assertEquals(500, appraisal, 0.0);
    }
    @Test
    public void testCalculateYearlySalary(){
        System.out.println("test case testCalculateYearlySalary");
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);
        double yrsalary=empBusinessLogic.calculateYearlySalary(employee);
        assertEquals(96000, yrsalary, 0.0);

    }

}