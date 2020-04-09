package ch01.ex02;

import java.util.Scanner;

public class Ch1Ex2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		int angle = Integer.parseInt(input);
		int normalizedAngle = (360 + angle) % 360;
		System.out.println(normalizedAngle);
		
		in.close();
	}

}
