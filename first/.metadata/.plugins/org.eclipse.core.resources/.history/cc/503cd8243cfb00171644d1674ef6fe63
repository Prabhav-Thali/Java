package com.psl.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.psl.entity.Room;

public class TestRoomDao {

	RoomDao roomdao;
	@Before
	public void setUp() throws Exception {
		roomdao=new RoomDao();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testinsertRoomDetails(){
		//assertTrue(roomdao.insertRoomDetails(new Room(103, "corel", "alkissessment", 34, "HJ")));
	}

	@Test
	public void testGetRoomByLocation() {
		assertNotNull(roomdao.getRoomByLocation("Goa"));
	}

	@Test
	public void testGetRoomByLocationByType() {
		assertNotNull(roomdao.getRoomByLocationByType("HJ","Lab"));
	}

}
