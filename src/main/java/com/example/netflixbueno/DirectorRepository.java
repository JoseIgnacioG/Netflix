package com.example.netflixbueno;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "director", path = "director")
public interface DirectorRepository extends PagingAndSortingRepository<Director, Integer> {

    //Esto nos devuelve un findALL
}
