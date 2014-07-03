package com.ninja_squad.geektic.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ninja_squad.geektic.config.dao.GeekDao;
import com.ninja_squad.geektic.config.modele.Geek;

public class GeekDaoTest extends BaseDaoTest{
	@Autowired
	private GeekDao GeekTest;
	@Test
	public void testGetAllGeek() {
		
		List<Geek> MaListe= GeekTest.getAllGeek('f');

		assertEquals(MaListe.size(),1);
		
	}

	@Test
	public void testGetGeekById() {
		Geek monGeek = GeekTest.getGeekById(4);
		assertEquals(monGeek.getPrenom(),"Adam");
	}

}
