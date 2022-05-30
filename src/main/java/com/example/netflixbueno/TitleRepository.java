package com.example.netflixbueno;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "title", path = "title")
public interface TitleRepository extends PagingAndSortingRepository<Title, Integer> {




}
