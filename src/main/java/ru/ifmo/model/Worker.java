package ru.ifmo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import ru.ifmo.model.enums.Position;
import ru.ifmo.model.enums.Status;

import java.util.Date;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
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

}
