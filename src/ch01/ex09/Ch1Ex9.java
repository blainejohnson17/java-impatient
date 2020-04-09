package ch01.ex09;

public class Ch1Ex9 {
	
	public static void main(String[] args) {
		String s1 = "hello";
		String[] a = {"h", "e", "l", "l", "o"};
		String s2 = String.join("", a);

		
		if (s1 == s2) {
			System.out.println("== true");
		}
		
		if (s1.equals(s2)) {
			System.out.println("equals true");
		}
	}

}
