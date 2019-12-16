package com.automomotiva.marafy.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Part implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String title;

    private LocalDate date_post;

    private String description;

    @OneToMany(mappedBy = "part", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Collection<Photo> photos = new HashSet<Photo>();

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "make_id")
    private Make make;

    @ManyToOne
    @JoinColumn(name = "sub_category_id")
    private SubCategory subCategory;

    private String partNumber;

    private String manufacturerNumber;

    @Column
    @ElementCollection(targetClass = String.class)
    private List<String> prices = new ArrayList<>();


}
