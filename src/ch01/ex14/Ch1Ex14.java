package ch01.ex14;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch1Ex14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String line = null;
		ArrayList<String> lines = new ArrayList<String>();
		while (!(line = in.nextLine()).isEmpty()) {
			lines.add(line);
		}

		int[][] square = new int[lines.size()][];
		for (int i = 0; i < lines.size(); i++) {
			String[] strs = lines.get(i).split(" ");
			int[] nums = new int[strs.length];
			for (int j = 0; j < strs.length; j++) {
				String str = strs[j];
				nums[j] = Integer.parseInt(str);
			}
			square[i] = nums;
		}

		int[] colSums = new int[square[0].length];
		int diag1 = square[0][0];
		int diag2 = square[0][square[0].length - 1];

		int sum = 0;
		for (int c = 0; c < square[0].length; c++) {
			sum += square[0][c];
			colSums[c] += square[0][c];
		}

		for (int r = 1; r < square.length; r++) {
			int rowSum = 0;
			for (int c = 0; c < square[r].length; c++) {
				rowSum += square[r][c];
				colSums[c] += square[r][c];
				if (r == c) {
					diag1 += square[r][c];
				}
				if (r == square[0].length - c - 1) {
					diag2 += square[r][c];
				}
			}
			if (rowSum != sum) {
				System.out.println("not magic");
				in.close();
				return;
			}
		}

		if (diag1 != sum || diag2 != sum) {
			System.out.println("not magic");
			in.close();
			return;
		}

		for (int i = 0; i < colSums.length; i++) {
			if (colSums[i] != sum) {
				System.out.println("not magic");
				in.close();
				return;
			}
		}

		System.out.println("magic");

		in.close();
	}

}
