package ru.ifmo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ifmo.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {}
