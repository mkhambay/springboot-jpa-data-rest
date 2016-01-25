package com.mk.race.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mk.race.app", "com.mk.race.app.*"})
public class MkRaceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MkRaceAppApplication.class, args);
	}
}
