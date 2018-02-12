package com.psl.controller;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.psl.controller.AddLocationController;
import com.psl.controller.BookRoomController;

public class TestAddLocationController extends Mockito {

	
	AddLocationController alc=new AddLocationController();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDoPostHttpServletRequestHttpServletResponse() {
	
		assertNotNull(alc);
	
	}

}
