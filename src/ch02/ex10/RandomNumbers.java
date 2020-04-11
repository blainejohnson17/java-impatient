package ch02.ex10;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
	public static Integer randomElement(ArrayList<Integer> list) {
		Random rand = new Random();
		int idx = rand.nextInt(list.size());
		return list.get(idx);
	}

	public static int randomElement(int[] intArray) {
		Random rand = new Random();
		int idx = rand.nextInt(intArray.length);
		return intArray[idx];
	}
}
