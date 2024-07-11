package com.example.nttTestTask.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Base class Organization
 */
@Entity
@Data
@Table(name = "organizations")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "inn")
    private String inn;

    @Column(name = "ogrn")
    private String ogrn;

    @Column(name = "post_address")
    private String postAddress;

    @Column(name = "legal_address")
    private String legalAddress;

    @Column(name = "ceo_id")
    private Long employee;

    @Column(name = "office_id")
    private Long office;
}
