package com.alulu.makeyourbet.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BetControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new BetController(null, null, null, null, null, null));
 	}
}
