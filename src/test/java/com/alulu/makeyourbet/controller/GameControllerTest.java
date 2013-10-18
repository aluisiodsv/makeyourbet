package com.alulu.makeyourbet.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GameControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new GameController(null, null, null));
 	}
}
