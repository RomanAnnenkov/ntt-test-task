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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "chief_id")
    private Long chief;
}
