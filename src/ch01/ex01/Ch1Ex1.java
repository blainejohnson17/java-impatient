package ch01.ex01;

import java.util.Scanner;

public class Ch1Ex1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int num = Integer.parseInt(input);
		System.out.printf("octal: %o", num);
		System.out.println();
		System.out.printf("hex: %x", num);
		in.close();
	}

}
