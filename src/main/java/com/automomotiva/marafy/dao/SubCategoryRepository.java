package com.automomotiva.marafy.dao;

import com.automomotiva.marafy.entities.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.Path;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
    @RestResource
    public List<SubCategory> findByTitle(@Param("cat") String cat);
}
