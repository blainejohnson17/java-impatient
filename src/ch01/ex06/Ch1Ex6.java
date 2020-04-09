package ch01.ex06;

import java.math.BigInteger;

public class Ch1Ex6 {

	public static void main(String[] args) {
		BigInteger result = BigInteger.valueOf(1);
		for(int i = 2; i < 1000; i++) {
			result = result.multiply(BigInteger.valueOf(i)); 
		}
		System.out.printf("factorial of 1000 is: %d", result);
	}

}
