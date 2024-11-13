package ru.ifmo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ifmo.model.Worker;
import ru.ifmo.repository.WorkerRepository;

import java.util.List;

@Service
public class WorkerService {
    @Autowired
    private WorkerRepository workerRepository;

    public List<Worker> getAll() {
        return workerRepository.findAll();
    }

    public void save(Worker worker) {
        workerRepository.save(worker);
    }

    public Worker getById(Integer id) {
        return workerRepository.getReferenceById(id);
    }

    public void deleteById(Integer id) {
        workerRepository.deleteById(id);
    }
}
