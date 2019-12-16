package com.automomotiva.marafy.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Engine implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "engine_id")
    private Long engineId;
    private String title;
    private int submodel_id;
    private String make;
    private String year;
    private String model;
    private String sub_model;
    private int num_parts;

}
