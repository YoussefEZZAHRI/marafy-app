package com.automomotiva.marafy.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long postId;

    private String title;

    private LocalDate date_post;

    private String description;
}
