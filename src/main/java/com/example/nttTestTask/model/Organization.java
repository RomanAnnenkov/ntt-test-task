package com.example.nttTestTask.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

/**
 * Base class Organization
 */
@Entity
@Data
@Table(name = "organizations")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Organization {
    @Id
    @Column(name = "organization_id")
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ceo_id", referencedColumnName = "employee_id")
    private Employee ceo;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "organization_id", referencedColumnName = "organization_id")
    private Set<Office> offices;

}
