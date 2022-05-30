package com.example.netflixbueno;


import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

public class Recommendations {

    private final TitleRepository titleRepository;

    public Recommendations(TitleRepository titleRepository) {
        this.titleRepository = titleRepository;
    }

/*
    @GetMapping("/recommend/best")
    CollectionModel<EntityModel<Title>> bestTitle(@RequestParam(value = "top", defaultValue = "10") int top) {
        top = sanitizeParam(top);
        Object assembler;
        List<EntityModel<Title>> wines = TitleRepository.findAllByBestRating(top).stream()
                .map(assembler::toModel).collect(Collectors.toList());

        return CollectionModel.of(wines, linkTo(methodOn(TitleController.class).all()).withSelfRel());
        
}
*/

    private int sanitizeParam(int top) {
        if (top < 1 || top > 500)
            top = 10;
        return top;
    }
}

