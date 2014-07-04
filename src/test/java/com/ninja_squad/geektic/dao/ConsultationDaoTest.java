package com.ninja_squad.geektic.dao;

import static org.junit.Assert.*;

import java.net.UnknownHostException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ninja_squad.geektic.config.dao.ConsultationDao;
import com.ninja_squad.geektic.config.dao.InteretDao;

public class ConsultationDaoTest extends BaseDaoTest{
	
	@Autowired
	private ConsultationDao ConsultationTest;
	
	@Test
	public void testGetAllConsultation() {
		fail("Not yet implemented");
	}

	@Test
	@Transactional
	public void testInsertConsultation()
	{
		ConsultationTest.insertConsultation(4,"127.2.0.1");
	}

}
