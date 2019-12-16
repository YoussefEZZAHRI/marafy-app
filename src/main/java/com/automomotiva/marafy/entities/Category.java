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
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;

    private String title;

    private String slug;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Collection<SubCategory> subCategories;

}
