package com.automomotiva.marafy.dao;

import com.automomotiva.marafy.entities.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;
@RepositoryRestResource
public interface PartRepository extends JpaRepository<Part,Long> {

    @RestResource(path = "/byTitle")
    public List<Part> findByTitleContains(@Param("title") String title);

    @RestResource(path = "/byCategory")
    public List<Part> findBySubCategory_TitleContains(@Param("cat") String title);

    @RestResource(path = "/byPartNumber")
    public List<Part> findByPartNumber(@Param("ref") String title);


}
