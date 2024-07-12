package com.example.nttTestTask.service;

import com.example.nttTestTask.model.Organization;
import com.example.nttTestTask.repository.OrganizationRepository;
import com.example.nttTestTask.repository.OrganizationSpecifications;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
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

    /**
     * Get method for filter organization list
     * @param fullNameLike part full name of organization
     * @param shortNameLike part short name of organization
     * @param innLike part of inn code
     * @param ogrnLike part of ogrn code
     * @return list of found organizations
     */
    public List<Organization> findOrganizationsByFilter(String fullNameLike, String shortNameLike, String innLike, String ogrnLike) {
        return repository.findAll(Specification.where(
                OrganizationSpecifications.hasFullName(fullNameLike))
                .or(OrganizationSpecifications.hasShortName(shortNameLike))
                .or(OrganizationSpecifications.hasInn(innLike))
                .or(OrganizationSpecifications.hasOgrn(ogrnLike))
        );
    }
}
