package com.src;

import java.util.List;

public class Vegetable {

	private Market market;

	public Vegetable(Market mk) {
		this.market = mk;
	}

	public String getMyFavouriteVegetable() {

		List<String> allveg = market.getAllVegetableAndFruits();

		for (String x : allveg) {
			if (x.equals("ladyFinger")) {

				return x;
			}
		}

		return null;
	}

}
