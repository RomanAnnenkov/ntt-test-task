package com.example.nttTestTask.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

/**
 * Base class employee
 */
@Entity
@Data
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "surname")
    private String surname;

    @Column(name = "name")
    private String name;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "birth_date")
    private Date birthDate;
}
