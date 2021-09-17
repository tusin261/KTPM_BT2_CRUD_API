package com.se.bt2_nguyenthanhtu_18045511.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    @NotBlank(message = "Please add first name!")
    @Length(min = 1,max = 10,message = "Less than 10 and greater than 1")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "email")
    @Email
    private String email;
}
