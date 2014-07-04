package com.ninja_squad.geektic.config.dao;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.config.modele.Consultation;


@Repository
public class ConsultationDao {
	
	@PersistenceContext
	private EntityManager em;
	
	 public List<Consultation> getAllConsultation()
	 {
         String jpql = "SELECT c FROM Consultation as c ";
         TypedQuery<Consultation> query = em.createQuery(jpql, Consultation.class);
         return query.getResultList(); 
	 }
	 
	 public void insertConsultation(int idGeek, String  adresseIp) 
	 {

		 java.util.Date date = new java.util.Date(); 
		 
		 Consultation maCons = new Consultation(adresseIp,idGeek,date);

		 em.persist(maCons);
		 
	 }
}
