package ru.ifmo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import ru.ifmo.model.enums.Color;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
