package org.wc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloTest {

	private Hello hello = new Hello();
	
	
	@Before
	public void setUp() {
		hello.setI(1);
	}
	
	
	@Test
	public void testGreet() {
		String expected = "Hola mundo";
		assertEquals(expected,hello.greet());
	}
	
	@Test
	public void testIsMonday() {
		assertFalse(hello.isMonday());
	}
	
	@After
	public void tearDown() {
		hello.setI(0);
	}

}
