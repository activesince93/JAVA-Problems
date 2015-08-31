package HackerRank;

import java.util.Scanner;

public class CommonChild {
	public static void main(String args[]) {
		Scanner jin = new Scanner(System.in);
		String str1 = jin.next();
		String str2 = jin.next();
		int len = str1.length();
		int[][] array = new int[len+1][len+1];
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					array[i+1][j+1] = array[i][j] + 1;
				} else {
					array[i+1][j+1] = Math.max(array[i][j+1], array[i+1][j]);
				}
			}
		}
		System.out.println(array[len][len]);
		array = null;
	}
}