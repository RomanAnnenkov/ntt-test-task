package com.example.nttTestTask.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

/**
 * Base class Organization
 */
@Entity
@Data
@Table(name = "organizations")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Organization {

    /**
     * Unique identifier of organization.
     */
    @Id
    @Column(name = "organization_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Full name of organization.
     */
    @Column(name = "full_name")
    private String fullName;

    /**
     * Short name of organization.
     */
    @Column(name = "short_name")
    private String shortName;

    /**
     * INN code of organization.
     */
    @Column(name = "inn")
    private String inn;

    /**
     * OGRN code of organization.
     */
    @Column(name = "ogrn")
    private String ogrn;

    /**
     * Post address of organization.
     */
    @Column(name = "post_address")
    private String postAddress;

    /**
     *
     */
    @Column(name = "legal_address")
    private String legalAddress;

    /**
     * ID of employee who is the CEO.
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ceo_id", referencedColumnName = "employee_id")
    private Employee ceo;

    /**
     * List organization offices.
     */
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "organization_id", referencedColumnName = "organization_id")
    private List<Office> offices;

}
