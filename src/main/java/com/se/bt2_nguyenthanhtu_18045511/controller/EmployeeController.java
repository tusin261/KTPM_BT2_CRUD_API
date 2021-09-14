package com.se.bt2_nguyenthanhtu_18045511.controller;

import com.se.bt2_nguyenthanhtu_18045511.entity.Employee;
import com.se.bt2_nguyenthanhtu_18045511.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getListEmployee(){
        System.out.println(employeeService.findAll());
        return employeeService.findAll();
    }
}
