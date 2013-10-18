package com.alulu.makeyourbet.repository;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.alulu.makeyourbet.repository.impl.ShowdownRepositoryImpl;

public class ShowdownRepositoryImplTest {

    @Test public void fakeTest() {
  		assertNotNull("put something real.", new ShowdownRepositoryImpl(null));
  	}
}

