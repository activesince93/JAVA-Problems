package HackerRank;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int matrix[][] = new int[T][T];
		for(int i = 0; i < T; i++) {
			for(int j = 0; j < T; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int total1 = 0, total2 = 0;
		int i = T-1;
		int j = 0;
		while (i >= 0) {
			total1 += matrix[i][i];
			total2 += matrix[i][j];
			j++;
			i--;
		}
		
		System.out.println(String.valueOf(Math.abs(total1-total2)));
	}
}
