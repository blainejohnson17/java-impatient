package ch02.ex10;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int[] intArr = { 1, 4, 2, 33, 34, 5 };

		int randomInt = RandomNumbers.randomElement(intArr);
		System.out.println("Random Int: " + randomInt);

		ArrayList<Integer> intList = new ArrayList<Integer>();

		for (int i : intArr) {
			intList.add(i);
		}

		Integer randomInteger = RandomNumbers.randomElement(intList);
		System.out.println("Random Integer: " + randomInteger);
	}

}
