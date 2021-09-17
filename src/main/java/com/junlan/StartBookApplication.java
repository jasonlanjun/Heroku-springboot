package com.junlan;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class StartBookApplication {

    public static void main(String[] args) {

        SpringApplication.run(StartBookApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(BookRepository repository) {
        return args -> {
            repository.save(new Book("Book1", "Author1", new BigDecimal("10.00")));
            repository.save(new Book("Book2", "Author2", new BigDecimal("11.00")));
            repository.save(new Book("Book3", "Author3", new BigDecimal("12.00")));
        };
    }
}