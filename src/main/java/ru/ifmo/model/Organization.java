package ru.ifmo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
