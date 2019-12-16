package com.automomotiva.marafy.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class SubSubCategory implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sub_sub_category_id")
	private Long subSubCategoryId;

	private String title;

	private String slug;

	private Long sub_category_id;

}
