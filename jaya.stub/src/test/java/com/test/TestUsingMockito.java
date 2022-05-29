package com.test;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.src.Market;
import com.src.Vegetable;

public class TestUsingMockito {

	@Test
	public void unitTestCase2() {
		Market mk = Mockito.mock(Market.class);

		List<String> allveg = Arrays.asList("ladyFinger", "aalu", "gobi");

		Vegetable veg = new Vegetable(mk);

		when(mk.getAllVegetableAndFruits()).thenReturn(allveg);

		String myveg = veg.getMyFavouriteVegetable();

		Assert.assertEquals("ladyFinger", myveg);

	}

}
