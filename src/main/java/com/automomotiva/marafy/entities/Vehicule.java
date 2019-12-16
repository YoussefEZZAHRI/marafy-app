package com.automomotiva.marafy.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Vehicule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id")
    private Long vehicleId;
    private String name;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

//	@OneToMany(mappedBy = "vehicule", fetch = FetchType.LAZY)
//	private Collection<SubCategory> CP;


//	public Collection<SubCategory> getCP() {
//		return CP;
//	}
//
//	public void setCP(Collection<SubCategory> cP) {
//		CP = cP;
//	}

}
