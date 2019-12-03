package com.bdd.tdd.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bdd.tdd.dao.EmployeRepository;
import com.bdd.tdd.entity.Employe;

//import com.bdd.tdd.dao.EmployeRepository;

@Controller
public class EmployeController {
	
	//injection de dependance
	@Autowired
	private EmployeRepository employeRepository;
	
	//la methode qui retourne la vue
	//le requestMapping c'est pour acceder a la vue
	@RequestMapping(value="/index")
	public String index() {		
		return "index";
		
	}
	
	//la methode pour afficher la liste des employés
	@RequestMapping(value="/all")
	//on stock dans le modele tout ce qui va etre affiché dans la vue
	public String allEMployees(Model model) {
		//on recupere la liste des employes
		List<Employe> employes=employeRepository.findAll();
		//et on stock cette liste dans le model
		model.addAttribute("allEmployees", employes);
		
		
		return "allEmployees";
		
	}
}
