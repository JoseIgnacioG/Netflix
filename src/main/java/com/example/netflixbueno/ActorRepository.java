package com.example.netflixbueno;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "actor", path = "actor")
public interface ActorRepository extends PagingAndSortingRepository<Actor, Integer> {





}
