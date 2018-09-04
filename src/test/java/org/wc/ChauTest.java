package org.wc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChauTest {

	private Chau chau = new Chau();
	
	@Test
	public void testSaludar() {
		assertEquals("Chau",chau.saludar());
	}
	
}
