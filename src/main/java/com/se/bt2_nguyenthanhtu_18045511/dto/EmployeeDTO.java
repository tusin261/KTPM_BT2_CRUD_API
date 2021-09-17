package com.se.bt2_nguyenthanhtu_18045511.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.se.bt2_nguyenthanhtu_18045511.entity.Employee;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class EmployeeDTO {

    private String firstName;
    private String lastName;

    public EmployeeDTO(Employee e){
        this.firstName = e.getFirst_name();
        this.lastName = e.getLast_name();
    }
}
