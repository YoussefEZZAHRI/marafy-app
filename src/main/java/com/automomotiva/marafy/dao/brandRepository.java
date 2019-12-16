package com.automomotiva.marafy.dao;

import com.automomotiva.marafy.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface brandRepository extends JpaRepository<Brand, Long> {

}
