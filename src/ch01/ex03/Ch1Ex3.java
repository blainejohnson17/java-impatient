package ch01.ex03;

import java.util.Scanner;

public class Ch1Ex3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num1 = in.nextInt();
		System.out.println();
		
		System.out.print("Enter an integer: ");
		int num2 = in.nextInt();
		System.out.println();
		
		System.out.print("Enter an integer: ");
		int num3 = in.nextInt();
		System.out.println();
		
		if (num1 > num2 && num1 > num3) {
			System.out.printf("The max num is: %d", num1);
		} else if (num2 > num3) {
			System.out.printf("The max num is: %d", num2);
		} else {
			System.out.printf("The max num is: %d", num3);
		}
		
		System.out.println();

		System.out.printf("The max num is: %d", Math.max(Math.max(num1, num2), num3));

		in.close();

	}

}
