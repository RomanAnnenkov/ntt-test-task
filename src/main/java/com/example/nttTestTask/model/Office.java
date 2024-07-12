package com.example.nttTestTask.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Base class office
 */
@Entity
@Data
@Table(name = "offices")
public class Office {

    /**
     * Unique ID of office.
     */
    @Id
    @Column(name = "office_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Office name.
     */
    @Column(name = "name")
    private String name;

    /**
     * Office address.
     */
    @Column(name = "address")
    private String address;

    /**
     * Office chief.
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "chief_id", referencedColumnName = "employee_id")
    private Employee chief;

    /**
     * ID of the organization that owns this office.
     */
    @Column(name = "organization_id")
    private int organizationId;
}
