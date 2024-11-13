package ru.ifmo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ifmo.model.Organization;
import ru.ifmo.repository.OrganizationRepository;

import java.util.List;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    public List<Organization> getAll() {
        return organizationRepository.findAll();
    }

    public void save(Organization organization) {
        organizationRepository.save(organization);
    }

    public Organization getById(Long id) {
        return organizationRepository.getReferenceById(id);
    }

    public void deleteById(Long id) {
        organizationRepository.deleteById(id);
    }
}
