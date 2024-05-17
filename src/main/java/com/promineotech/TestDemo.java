package com.promineotech;

import java.util.Random;

public class TestDemo { /* start of class */

	public int addPositive(int a, int b) {

		if (a > 0 && b > 0) {
			return a + b;
		}

		else {
			throw new IllegalArgumentException("Both parameters must be positive!");

		}
	}

	int randomNumberSquared() {
		int sqNum = getRandomInt();
		return sqNum * sqNum;
	}

	public int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;

	}

} /* end of class */
