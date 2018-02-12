package com.psl.controller;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jgroups.Message;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.psl.controller.BookRoomController;
import com.psl.dao.BookingDao;

public class TestBookRoomController {

	BookingDao bookingDao;
	
	@Before
	public void setUp() throws Exception {
	bookingDao=new BookingDao();
	
	}

	@After
	public void tearDown() throws Exception {
	bookingDao=null;
	}


	@Test
	public void testDoPostHttpServletRequestHttpServletResponse() {
		//assertEquals(null, null);
		
		assertNotNull(bookingDao.getTrainingIDList(0));
	}

}
