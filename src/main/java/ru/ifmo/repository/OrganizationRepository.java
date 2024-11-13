package ru.ifmo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ifmo.model.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
