package com.microservice.service;

import com.microservice.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    @Override
    public Employee getEmployee() {
        return  Employee.builder().id(1).name("Amila").address("Hanwella").build();
    }
}
