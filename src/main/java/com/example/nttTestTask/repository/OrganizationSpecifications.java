package com.example.nttTestTask.repository;

import com.example.nttTestTask.model.Organization;
import org.springframework.data.jpa.domain.Specification;

/**
 * Organization specification class for enable jpa filter.
 */
public class OrganizationSpecifications {
    /**
     * Filter by full name of organization.
     * @param fullName part or full name of organization
     * @return specification for automatic build filter query
     */
    public static Specification<Organization> hasFullName(String fullName) {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("fullName"), "%" + fullName + "%"));
    }

    /**
     * Filter by short name of organization.
     * @param shortName part or full short name of organization
     * @return specification for automatic build filter query
     */
    public static Specification<Organization> hasShortName(String shortName) {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("shortName"), "%" + shortName + "%"));
    }

    /**
     * Filter by inn of organization.
     * @param inn part or full inn code of organization
     * @return specification for automatic build filter query
     */
    public static Specification<Organization> hasInn(String inn) {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("inn"), "%" + inn + "%"));
    }

    /**
     * Filter by ogrn of organization.
     * @param ogrn part or full ogrn code of organization
     * @return specification for automatic build filter query
     */
    public static Specification<Organization> hasOgrn(String ogrn) {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("ogrn"), "%" + ogrn + "%"));
    }

    /**
     * Find organization by id.
     * @param id ID of organization
     * @return specification for automatic build query
     */
    public static Specification<Organization> hasId(Long id) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("id"), id);
    }
}
