package ru.ifmo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ifmo.model.Person;
import ru.ifmo.repository.PersonRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public void save(Person person) {
        personRepository.save(person);
    }

    public Person getById(Long id) {
        return personRepository.getReferenceById(id);
    }

    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
}
