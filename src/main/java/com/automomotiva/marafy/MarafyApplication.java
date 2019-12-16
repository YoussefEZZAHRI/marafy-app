package com.automomotiva.marafy;

import com.automomotiva.marafy.dao.PartRepository;
import com.automomotiva.marafy.dao.SubCategoryRepository;
import com.automomotiva.marafy.entities.Part;
import com.automomotiva.marafy.entities.SubCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class MarafyApplication implements CommandLineRunner {

	@Autowired
	private PartRepository partRepository;
	@Autowired
	private SubCategoryRepository subCategoryRepository;
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(MarafyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		restConfiguration.exposeIdsFor(Part.class,SubCategory.class);
		subCategoryRepository.save(new SubCategory(null,"Freinage","",null,null));
		partRepository.save(new Part());
		partRepository.save(new Part());
		partRepository.save(new Part());
		subCategoryRepository.findByTitle("frenage");
		partRepository.findAll().forEach(part->{

			part.setTitle("Disque frein");
			part.setSubCategory(new SubCategory(1L,"Freinage","",null,null));
			partRepository.save(part);
		});

	}
}
