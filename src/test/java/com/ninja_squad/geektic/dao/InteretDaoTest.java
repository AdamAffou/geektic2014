package com.ninja_squad.geektic.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ninja_squad.geektic.config.dao.GeekDao;
import com.ninja_squad.geektic.config.dao.InteretDao;
import com.ninja_squad.geektic.config.modele.Geek;
import com.ninja_squad.geektic.config.modele.Interet;

public class InteretDaoTest extends BaseDaoTest{
	
	@Autowired
	private InteretDao InteretTest;
	@Test
	public void testGetAllInteret() {
		List<Interet> MaListe= InteretTest.getAllInteret();

		assertEquals(MaListe.size(),3);
	}

	@Test
	public void testGetInteretById() {
		Interet monInteret = InteretTest.getInteretById(2);
		assertEquals(monInteret.getNom(),"JAVA");
	}

}
