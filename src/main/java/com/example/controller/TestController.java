package com.example.controller;

import com.example.practice.EmployeeDetails;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class TestController {
    @Autowired
    EmployeeDetails employee;


    /*@CrossOrigin(origins = "*")
    @GetMapping(value="/getEmployee")
    @Operation(summary = "getEmployee Details")
    public String getEmployee() {
        return ("welcome");
    }*/
    @CrossOrigin(origins = "*")
    @GetMapping(value = "/getEmployee")
    @Operation(summary = "getEmployee Details")
    public ResponseEntity<List<EmployeeDetails>> getEmployee() {
        List<EmployeeDetails> empList = new ArrayList<EmployeeDetails>();

        empList.add(new EmployeeDetails("Rajeev",25,8000));
        empList.add(new EmployeeDetails("Kamal",20,18000));

        return new ResponseEntity<List<EmployeeDetails>>(empList, HttpStatus.OK);
    }


}
