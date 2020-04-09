package ch01.ex07;

import java.util.Scanner;

public class Ch1Ex7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		short short1 = (short) in.nextInt();
		short short2 = (short) in.nextInt();
		// sum
		short sum = (short) (short1 + short2);
		// diff
		short diff = (short) (short1 - short2);
		// product
		short product = (short) (short1 * short2);
		// quotient
		short quotient = (short) (short1 / short2);
		// remainder
		short remainder = (short) (short1 % short2);
		
		System.out.printf(" sum: %d\n diff: %d\n product: %d\n quotient: %d\n remainder: %d\n", sum, diff, product, quotient, remainder);
		
		in.close();
	}

}
