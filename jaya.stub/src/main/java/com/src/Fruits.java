package com.src;

import java.util.List;

public class Fruits {

	private Market market;

	public Fruits(Market market) {

		this.market = market;
	}

	public String getMyFavoriteFruits() {

		List<String> allList = market.getAllVegetableAndFruits();

		String fav = null;

		for (String x : allList) {

			if (x.equals("Apple")) {
				return x;
			}

		}

		return fav;
	}

}
