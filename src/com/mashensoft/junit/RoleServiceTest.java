package com.mashensoft.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RoleServiceTest {

	@Test
	void testPlus() {
		RoleService roleService = new RoleService();
		int result = roleService.plus(1, 2);
		assertEquals(3, result);
	}

	@Test
	void testMinus() {
		//fail("Not yet implemented");
		System.out.println("testMinus");
	}

}
