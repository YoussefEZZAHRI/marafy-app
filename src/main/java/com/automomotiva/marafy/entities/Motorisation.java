package com.automomotiva.marafy.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Motorisation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "motorisation_id")
    private Long motorisationId;

    private String nom;

    @OneToMany(mappedBy = "motorisation", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Collection<Carburant> carburant;

}
