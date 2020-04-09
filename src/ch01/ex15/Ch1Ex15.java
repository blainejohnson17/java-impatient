package ch01.ex15;

import java.util.ArrayList;

public class Ch1Ex15 {
	 
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> triangle = pascTriangle(5);
	}
	
	public static ArrayList<ArrayList<Integer>> pascTriangle(int levels) {
		ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < levels; i++) {
			ArrayList<Integer> level = new ArrayList<Integer>();
			for(int j = 0; j < (i + 1); j++) {
				int prevLevel = i - 1;
				int prevIdx = j - 1;
				int val;
				int val1;
				int val2;
				if (prevLevel >= 0) {
					if (prevIdx >= 0) {
						val1 = triangle.get(prevLevel).get(prevIdx);
					} else {
						val1 = 0;
					}
					if (j < triangle.get(prevLevel).size()) {
						val2 = triangle.get(prevLevel).get(j);
					} else {
						val2 = 0;
					}
					val = val1 + val2;
				} else {
					val = 1;
				}
				level.add(val);	
			}
			triangle.add(level);
		}
		
		return triangle;
	}

}
