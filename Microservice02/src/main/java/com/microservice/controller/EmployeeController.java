package com.microservice.controller;

import com.microservice.model.Employee;
import com.microservice.service.EmployeeService;
import com.microservice.service.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeServiceImpl employeeService;

    @GetMapping("/get")
    public Employee getEmployee(){
    return employeeService.getEmployee();

    }



}
