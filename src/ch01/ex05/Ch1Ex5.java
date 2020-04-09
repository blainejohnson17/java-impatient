package ch01.ex05;

public class Ch1Ex5 {

	public static void main(String[] args) {
		double d = (double) Integer.MAX_VALUE + 1.0;
		System.out.println(d);
		// 2.147483648E9
		int i = (int) d;
		System.out.println(i);
		// output is 2147483647
		// casting to int, for double > int max value; int is round to int max
	}

}
