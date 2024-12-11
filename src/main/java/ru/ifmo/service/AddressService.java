package ru.ifmo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ifmo.model.Address;
import ru.ifmo.repository.AddressRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;

    public List<Address> getAll() {
        return addressRepository.findAll();
    }

    public void save(Address worker) {
        addressRepository.save(worker);
    }

    public Address getById(String id) {
        return addressRepository.getReferenceById(id);
    }

    public void deleteById(String id) {
        addressRepository.deleteById(id);
    }

}
