package ch01.ex08;

import java.util.Scanner;

public class Ch1Ex8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		String[] substrings = input.split(" ");
		
		for(int i = 0; i < substrings.length; i++) {
			System.out.println(substrings[i]);	
		}
		
		in.close();
	}
	

}
