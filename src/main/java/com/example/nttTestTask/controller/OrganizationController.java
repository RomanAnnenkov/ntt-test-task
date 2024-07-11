package com.example.nttTestTask.controller;

import com.example.nttTestTask.model.Organization;
import com.example.nttTestTask.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller for organization
 */
@RestController
@AllArgsConstructor
public class OrganizationController {
    /**
     * Organization service
     */
    private OrganizationService service;

    /**
     * Get method for all organizations
     * @return List organizations
     */
    @GetMapping("/organizations")
    public ResponseEntity<List<Organization>> getAllOrganizations() {
            return ResponseEntity.ok(service.getAllOrganizations());
    }
}
