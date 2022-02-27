package com.fishbase.fishbaseapi;

import com.fishbase.fishbaseapi.model.Taxon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.fishbase.fishbaseapi.model.*")
@EnableJpaRepositories("com.fishbase.fishbaseapi.repository")
@SpringBootApplication
public class FishbaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(FishbaseApplication.class, args);
    }
}
