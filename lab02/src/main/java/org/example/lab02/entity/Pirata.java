package org.example.lab02.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "Pirata")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pirata {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String name;

    @Column
    private Double bounty;

    @Column
    private String crew;

    @Column
    private Boolean isAlive;
}
