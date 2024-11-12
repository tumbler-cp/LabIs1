package ru.ifmo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ifmo.model.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Integer> {}
