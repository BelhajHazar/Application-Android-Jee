package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import absences.dao.IEtudiantRepository;
import absences.entities.Etudiant;

@ComponentScan
@ImportResource("classpath:spring-config.xml")
@EnableAutoConfiguration
@SpringBootApplication


public class AbsencesApplication  extends SpringBootServletInitializer implements CommandLineRunner {
	/*
	@Autowired
	IEtudiantRepository etud;
	*/
	public static void main(String[] args) {
		SpringApplication.run(AbsencesApplication.class, args);
	}
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
		//etud.save(new Etudiant("mmm","mmmm","lllll",new Date(01,12,2017)));
		/*List<Etudiant> etud = etud.findAll();*/

	}
}
