package com.example.nttTestTask.service;

import com.example.nttTestTask.model.Organization;
import com.example.nttTestTask.repository.OrganizationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for organization
 */
@Service
@AllArgsConstructor
public class OrganizationService {
    /**
     * Repository field
     */
    private OrganizationRepository repository;

    /**
     * Method to get all organizations
     * @return list of all organizations
     */
    public List<Organization> getAllOrganizations() {
        return repository.findAll();
    }

    /**
     * Method to get organization by id
     * @param id organization id
     * @return organization object
     */
    public Organization getOrganizationById(Long id) {
        return repository.getReferenceById(id);
    }
}
