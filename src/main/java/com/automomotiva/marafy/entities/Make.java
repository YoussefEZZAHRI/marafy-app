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
public class Make implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "make_id")
    private Long makeID;

    private String title;

    @OneToMany(mappedBy = "make", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Collection<Part> parts;


}
