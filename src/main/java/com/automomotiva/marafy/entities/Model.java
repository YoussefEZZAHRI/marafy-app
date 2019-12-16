package com.automomotiva.marafy.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Model implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "model_id")
    private Long modelId;

    private String title;

    @ManyToOne
    @JoinColumn(name = "BRAND")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "YEAR")
    private Year year;

    // @OneToMany(mappedBy="model",fetch=FetchType.LAZY)
    // private Collection<Motorisation> moteur;

}

