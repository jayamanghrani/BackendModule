package com.stub;

import java.util.ArrayList;
import java.util.List;

import com.src.Market;

public class StubMarket implements Market {

	public List<String> getAllVegetableAndFruits() {

		List<String> list = new ArrayList<String>();

		list.add("Apple");
		list.add("Banana");
		list.add("Pineapple");
		list.add("Orange");
		return list;

	}

}
