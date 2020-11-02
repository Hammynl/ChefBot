package com.github.hammynl.chef.utilities;

import java.util.Random;

public class RandomizerUtils {
	
	public int generateRandomIntInRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
