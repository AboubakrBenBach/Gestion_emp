package com.bdd.tdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bdd.tdd.dao.EmployeRepository;
import com.bdd.tdd.entity.Employe;

@SpringBootApplication
public class EmployeApplication {

	public static void main(String[] args) {
		ApplicationContext cont= SpringApplication.run(EmployeApplication.class, args);
		EmployeRepository employeRepository= cont.getBean(EmployeRepository.class);
		
		 //pour enregistrer
		employeRepository.save(new Employe("Laguerre","Drucker","LD20","Berri-uqam"));
		employeRepository.save(new Employe("Sady","Doucoure","SD80","Place des arts"));
		employeRepository.save(new Employe("Ben Bachir","Aboubakr","AB15","Longueuil"));
		 
		employeRepository.findAll().forEach(p->System.out.println(p.getPrenom()));
	}

}
