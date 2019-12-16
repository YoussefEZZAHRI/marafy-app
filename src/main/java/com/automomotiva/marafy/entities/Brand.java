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
public class Brand implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "brand_id")
    private Long brandId;

    private String title;

    private String slug;

    private String initial;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Collection<Model> modele;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Collection<Part> parts;

}
