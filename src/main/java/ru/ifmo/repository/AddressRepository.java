package ru.ifmo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ifmo.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {}
