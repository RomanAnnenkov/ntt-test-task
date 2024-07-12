package com.example.nttTestTask.repository;

import com.example.nttTestTask.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Jpa Repository interface for organization
 */
@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
