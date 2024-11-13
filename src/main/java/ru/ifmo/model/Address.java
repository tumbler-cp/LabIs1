package ru.ifmo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Address {
    @Id
    @Size(max = 20)
    private String zipCode;
}
