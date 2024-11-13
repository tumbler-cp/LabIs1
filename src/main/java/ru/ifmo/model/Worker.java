package ru.ifmo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;
import ru.ifmo.model.enums.Position;
import ru.ifmo.model.enums.Status;

import java.util.Date;

@Entity
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Имя не может быть пустым")
    @Column(nullable = false)
    @NotNull(message = "Введите имя!")
    private String name;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    private Coordinates coordinates;

    @Column(nullable = false)
    @NotNull
    private Date creationDate;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    private Organization organization;

    @Column(nullable = false)
    @NotNull
    private double salary;

    @Min(1)
    private int rating;

    @Column(nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private Position position;

    @Column(nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    private Person person;

    @PrePersist
    protected void onCreate() {
        this.creationDate = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotBlank @NotNull String getName() {
        return name;
    }

    public void setName(@NotBlank @NotNull String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @NotNull
    public double getSalary() {
        return salary;
    }

    public void setSalary(@NotNull double salary) {
        this.salary = salary;
    }

    @Min(1)
    public int getRating() {
        return rating;
    }

    public void setRating(@Min(1) int rating) {
        this.rating = rating;
    }

    public @NotNull Position getPosition() {
        return position;
    }

    public void setPosition(@NotNull Position position) {
        this.position = position;
    }

    public @NotNull Status getStatus() {
        return status;
    }

    public void setStatus(@NotNull Status status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
