package ch01.ex10;

import java.util.Random;

public class Ch1Ex10 {
	public static void main(String[] args) {
		Random rand = new Random();
		Long random = rand.nextLong();
		
		System.out.println(Long.toString(random, 36));
	}
}
