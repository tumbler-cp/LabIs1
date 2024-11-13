package ru.ifmo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import ru.ifmo.model.enums.Color;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Color eyeColor;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Color hairColor;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    private Location location;

    @Min(1)
    private double height;

    @Min(1)
    private int weight;

    @NotNull
    @Column(nullable = false)
    private String passportID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull Color getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(@NotNull Color eyeColor) {
        this.eyeColor = eyeColor;
    }

    public @NotNull Color getHairColor() {
        return hairColor;
    }

    public void setHairColor(@NotNull Color hairColor) {
        this.hairColor = hairColor;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Min(1)
    public double getHeight() {
        return height;
    }

    public void setHeight(@Min(1) double height) {
        this.height = height;
    }

    @Min(1)
    public int getWeight() {
        return weight;
    }

    public void setWeight(@Min(1) int weight) {
        this.weight = weight;
    }

    public @NotNull String getPassportID() {
        return passportID;
    }

    public void setPassportID(@NotNull String passportID) {
        this.passportID = passportID;
    }
}
