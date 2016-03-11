package com.pyramid.tennis;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testApp() {
		assertNotNull(new AppTest());
	}
	
	@Test
	public void testInitGame() {
		assertEquals("love - love", new App().init());
	}
}
