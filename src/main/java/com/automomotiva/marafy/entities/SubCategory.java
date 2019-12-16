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
public class SubCategory implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_category_id")
    private Long subCategoryId;

    private String title;

    private String slug;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    // @ManyToOne
    // @JoinColumn(name = "VEHICULE")
    // private Vehicule vehicule;
    //
    @OneToMany(mappedBy = "subCategory", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Collection<Part> parts;

}
