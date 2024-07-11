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
    @Id
    @Column(name = "office_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "chief_id", referencedColumnName = "employee_id")
    private Employee chief;

    @Column(name = "organization_id")
    private int organizationId;
}
