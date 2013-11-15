package com.bahawi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bahawi.entities.Etudiant;
import com.bahawi.service.Userservice;

@Controller
public class Defauktcontroller {
	
	@Autowired
	Userservice testservice;
	
	@RequestMapping("/")
	public String hello()
	{
		System.out.println("first controller");
		testservice.add(new Etudiant(1, "ait baha", "ismail"));
		return "index";
	}

}
