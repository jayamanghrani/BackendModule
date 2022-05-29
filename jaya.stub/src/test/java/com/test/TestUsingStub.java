package com.test;

import org.junit.Assert;
import org.junit.Test;

import com.src.Fruits;
import com.src.Market;
import com.stub.StubMarket;

public class TestUsingStub {

	Market smMarket = new StubMarket();

	Fruits fruit = new Fruits(smMarket);

	@Test
	public void unitTest1() {

		String myfruit = fruit.getMyFavoriteFruits();
		Assert.assertEquals("Apple", myfruit);

	}

}
