package com.perales.ejemplohibernatesearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class EjemploHibernateSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploHibernateSearchApplication.class, args);
	}

}
