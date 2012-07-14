package com.tfnico.examples.building.methone;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethoneTest {

	@Test
	public void test() {
		Methone methone = new Methone();
		assertEquals("methone",methone.toString());
		assertNotNull(methone.getVersion());
	}

}
