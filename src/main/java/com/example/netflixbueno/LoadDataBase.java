/*package com.example.netflixbueno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDataBase {
    private static final Logger log = LoggerFactory.getLogger(LoadDataBase.class);

    @Bean
    CommandLineRunner initDatabase(DirectorRepository repository) {

        return args -> {
            log.info("Preloading Winery" + DirectorRepository.save(new Director(1,"Emilio")));

        };
    }

}*/