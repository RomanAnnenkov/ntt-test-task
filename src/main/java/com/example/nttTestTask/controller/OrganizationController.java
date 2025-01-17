package com.example.nttTestTask.controller;

import com.example.nttTestTask.model.Organization;
import com.example.nttTestTask.service.OrganizationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller for organization
 */
@RestController
@AllArgsConstructor
@Tag(name = "Organizations", description = "Interact with organizations")
public class OrganizationController {
    /**
     * Organization service
     */
    private OrganizationService service;

    /**
     * Get method for all organizations
     *
     * @return List organizations
     */
    @GetMapping("/organizations")
    @Operation(summary = "Get list of all organization")
    public ResponseEntity<List<Organization>> getAllOrganizations() {
        return ResponseEntity.ok(service.getAllOrganizations());
    }

    /**
     * Get method for organization by id
     *
     * @param id organization id
     * @return organization
     */
    @GetMapping("/organizations/{id}")
    @Operation(summary = "Get organization by id")
    public ResponseEntity<List<Organization>> getOrganizationById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getOrganizationById(id));
    }

    /**
     * Get method for filter organization list
     * @param fullNameLike part full name of organization
     * @param shortNameLike part full name of organization
     * @param innLike part full name of inn code
     * @param ogrnLike part full name of ogrn code
     * @return list of found organization
     */
    @GetMapping("/organizations/filter")
    @Operation(summary = "Find organizations", description = "Apply filter parameters on list of organizations")
    public ResponseEntity<List<Organization>> findOrganizationsByFilter(@RequestParam(required = false) String fullNameLike,
                                                                        @RequestParam(required = false) String shortNameLike,
                                                                        @RequestParam(required = false) String innLike,
                                                                        @RequestParam(required = false) String ogrnLike) {
        return ResponseEntity.ok(service.findOrganizationsByFilter(fullNameLike, shortNameLike, innLike, ogrnLike));
    }
}
