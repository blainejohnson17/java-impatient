package ch01.ex11;

import java.util.Scanner;

public class Ch1Ex11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		
		for(int i = 0; i < input.length(); i++) {
			char character = input.charAt(i); 
			int codePoint = input.codePointAt(input.offsetByCodePoints(0, i));
			if (codePoint > 256) {
				System.out.printf("char: %s, unicode: %x", character, codePoint);
			}
		}
		in.close();
	}
}

