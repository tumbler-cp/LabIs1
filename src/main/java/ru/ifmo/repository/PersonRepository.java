package ru.ifmo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ifmo.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}
