package com.psl.dao;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestStatusDao {

	StatusDao statusdao;

	@Before
	public void setUp() throws Exception {
		statusdao = new StatusDao();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetStatus() throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		assertNotNull(statusdao.getStatus(11,sdf.parse("2014-02-12") , sdf.parse("2014-02-12")));
	}

}
