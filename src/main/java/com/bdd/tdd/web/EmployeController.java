package com.bdd.tdd.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.bdd.tdd.dao.EmployeRepository;

@Controller
public class EmployeController {
	
	//injection de dependance
	/*@Autowired
	private EmployeRepository employeRepository;*/
	
	//la methode qui retourne la vue
	@RequestMapping(value="/index")
	public String index(Model model) {
		
		
		return "index";
		
	}
}
