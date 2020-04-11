package ch02.ex04;

import org.omg.CORBA.IntHolder;

public class Ch2Ex4 {
	
	public static void main(String[] args) {
		IntHolder intHolder1 = new IntHolder(1);
		IntHolder intHolder2 = new IntHolder(2);
		System.out.println("intHolder1 is: " + intHolder1.value + ", intHolder2 is: " + intHolder2.value);

		swapInt(intHolder1, intHolder2);
		
		System.out.println("intHolder1 is: " + intHolder1.value + ", intHolder2 is: " + intHolder2.value);
	}
	
	public static void swapInt(IntHolder int1, IntHolder int2) {
		int tmp = int1.value;
		int1.value = int2.value;
		int2.value = tmp;
	}

}
