package ru.ifmo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ifmo.model.Coordinates;
import ru.ifmo.repository.CoordinatesRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoordinatesService {

    private final CoordinatesRepository coordinatesRepository;

    public List<Coordinates> getAll() {
        return coordinatesRepository.findAll();
    }

    public void save(Coordinates worker) {
        coordinatesRepository.save(worker);
    }

    public Coordinates getById(Long id) {
        return coordinatesRepository.getReferenceById(id);
    }

    public void deleteById(Long id) {
        coordinatesRepository.deleteById(id);
    }

}
