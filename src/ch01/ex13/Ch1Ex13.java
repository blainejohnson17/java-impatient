package ch01.ex13;

import java.util.ArrayList;
import java.util.Random;

public class Ch1Ex13 {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 1; i < 50; i++) {
			arr.add(i);
		}
		
		int[] picks = new int[6];
		Random rand = new Random();
		
		System.out.print("picks: ");
		for(int i = 0; i < 6; i++) {
			int randInt = rand.nextInt(49 - i);
			int pick = arr.remove(randInt);
			picks[i] = pick;
			System.out.printf("%s ", pick);
		}
		
//		System.out.print("picks: ");
//		for(int i = 0; i < 6; i++) {
//			System.out.printf("%s ", picks);
//		}
//		
	}

}
