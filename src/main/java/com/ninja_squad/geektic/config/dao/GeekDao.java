package com.ninja_squad.geektic.config.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.config.modele.Geek;
@Repository
public class GeekDao {
	
	@PersistenceContext
	private EntityManager em;

	 public List<Geek> getAllGeek()
	 {
         String jpql = "Select g from Geek as g";
         TypedQuery<Geek> query = em.createQuery(jpql, Geek.class);
         return query.getResultList(); 
	 }
	 
	 public Geek getGeekById(int id)
	 {
         return em.find(Geek.class, id); 
	 }

}
