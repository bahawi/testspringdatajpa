package com.bahawi.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bahawi.entities.Etudiant;


@Transactional
@Repository("testdao")
public class EtudiantDao {
	private static final int PAGE_SIZE = 50;
	
	@Autowired
	private SessionFactory sessionfactory;
	
	
	/*
	public Page<Person> findAllpage(Integer pageNumber) {
        PageRequest request =
                new PageRequest(pageNumber - 1, PAGE_SIZE, Sort.Direction.DESC, "startTime");
            return findAll(request);
	}
	*/
	
	@Transactional
	  public List<Etudiant> findAll() {
		
		    Session session = sessionfactory.getCurrentSession();
		    List etuds = session.createQuery("from Etudiant").list();
		    return etuds;

		}
	
	@Transactional
	 public Etudiant get( Integer id ) {
	
		  Session session = sessionfactory.getCurrentSession();
		  Etudiant person = (Etudiant) session.get(Etudiant.class, id);
		  
		  return person;
		 }
	
	@Transactional
		 public void add(Etudiant person) 
		 {
		  
		  Session session = sessionfactory.getCurrentSession();
		  session.save(person);
		 }

}
