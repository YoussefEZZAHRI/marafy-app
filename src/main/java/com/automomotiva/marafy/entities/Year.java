package com.automomotiva.marafy.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Year implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long yearId;

}
