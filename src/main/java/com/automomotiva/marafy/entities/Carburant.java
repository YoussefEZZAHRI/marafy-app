package com.automomotiva.marafy.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Carburant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carburant_id")
    private Long carburantId;
    private String type;

    @ManyToOne
    @JoinColumn(name = "motorisation_id")
    private Motorisation motorisation;

}
