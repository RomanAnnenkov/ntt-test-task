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

    /**
     * Unique ID of employee.
     */
    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Employee surname.
     */
    @Column(name = "surname")
    private String surname;

    /**
     * Employee name.
     */
    @Column(name = "name")
    private String name;

    /**
     * Employee middle name.
     */
    @Column(name = "middle_name")
    private String middleName;

    /**
     * Employee's date of birth.
     */
    @Column(name = "birth_date")
    private Date birthDate;
}
