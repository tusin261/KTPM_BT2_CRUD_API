package com.se.bt2_nguyenthanhtu_18045511.controller;

import com.se.bt2_nguyenthanhtu_18045511.entity.Employee;
import com.se.bt2_nguyenthanhtu_18045511.handler_validation.ValidationHandler;
import com.se.bt2_nguyenthanhtu_18045511.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable long id){
        return employeeService.findById(id);
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> addNewEmployee(@Valid @RequestBody Employee employee){
        employee.setId(Long.valueOf(0));
        //employeeService.saveEmployee(employee);
        return new ResponseEntity<Employee>(
                employeeService.saveEmployee(employee),
                HttpStatus.CREATED
        );
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){

        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable long id){
        employeeService.deleteById(Long.valueOf(id));
        return "Deleted employee "+ id;
    }




}
