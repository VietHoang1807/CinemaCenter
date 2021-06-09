package com.github.cinema.cinemaCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.github.cinema"})
@EnableMongoRepositories("com.github.cinema.repositories")
public class CinemaApplication {

	public static void main(String[] args) {SpringApplication.run(CinemaApplication.class, args);}

}
