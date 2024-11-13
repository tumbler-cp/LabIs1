package ru.ifmo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    private Address officialAddress;

    @Min(1)
    private long annualTurnover;

    @NotNull
    @Min(1)
    @Column(nullable = false)
    private Long employeesCount;

    @NotNull
    @NotBlank
    @Column(nullable = false, unique = true)
    private String fullName;

    @Min(1)
    private long rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getOfficialAddress() {
        return officialAddress;
    }

    public void setOfficialAddress(Address officialAddress) {
        this.officialAddress = officialAddress;
    }

    @Min(1)
    public long getAnnualTurnover() {
        return annualTurnover;
    }

    public void setAnnualTurnover(@Min(1) long annualTurnover) {
        this.annualTurnover = annualTurnover;
    }

    public @NotNull @Min(1) Long getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(@NotNull @Min(1) Long employeesCount) {
        this.employeesCount = employeesCount;
    }

    public @NotNull @NotBlank String getFullName() {
        return fullName;
    }

    public void setFullName(@NotNull @NotBlank String fullName) {
        this.fullName = fullName;
    }

    @Min(1)
    public long getRating() {
        return rating;
    }

    public void setRating(@Min(1) long rating) {
        this.rating = rating;
    }
}
