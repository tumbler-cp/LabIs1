package ru.ifmo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ifmo.model.Location;
import ru.ifmo.repository.LocationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LocationService {

    private final LocationRepository locationRepository;

    public List<Location> getAll() {
        return locationRepository.findAll();
    }

    public void save(Location location) {
        locationRepository.save(location);
    }

    public Location getById(Integer id) {
        return locationRepository.getReferenceById(id);
    }

    public void deleteById(Integer id) {
        locationRepository.deleteById(id);
    }
}
