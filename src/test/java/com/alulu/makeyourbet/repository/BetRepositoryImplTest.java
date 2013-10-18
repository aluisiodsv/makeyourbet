package com.alulu.makeyourbet.repository;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.alulu.makeyourbet.repository.impl.BetRepositoryImpl;

public class BetRepositoryImplTest {

    @Test public void fakeTest() {
  		assertNotNull("put something real.", new BetRepositoryImpl(null));
  	}
}

