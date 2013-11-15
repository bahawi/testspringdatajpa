package com.bahawi.service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bahawi.dao.EtudiantDao;
import com.bahawi.entities.Etudiant;

@Service("testservice")
public class Userservice {
	
	@Autowired
	EtudiantDao testdao;
	
	 
	  public List<Etudiant>findAll() {
	    List users = testdao.findAll();
	    return users;
	  }
	  
	
		 public Etudiant get( Integer id ) {
		
			 Etudiant person = (Etudiant) testdao.get(id);
			  
			  return person;
			 }
	
			 public void add(Etudiant person) 
			 {
			  
			  testdao.add(person);
			 }

}
