package com.alulu.makeyourbet.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class UserControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new UserController(null, null, null));
 	}
}
