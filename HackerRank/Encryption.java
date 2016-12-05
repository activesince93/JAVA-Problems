package HackerRank;

import java.util.Scanner;

public class Encryption {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.replaceAll(" ", ""); 
		int L = str.length();
		int number = (int) Math.sqrt(L);
		int rows, columns;
		if(L == number * number) {
			rows = number;
			columns = number;
		} else if(L > number * (number+1)) {
			rows = number + 1;
			columns = number + 1;
		} else {
			rows = number;
			columns = number + 1;
		}
		char strArray[] = str.toCharArray();
		String matrix[][] = new String[rows][columns];
		int count = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				matrix[i][j] = (count < (L)) ? String.valueOf(strArray[count]) : "";
				count++;
			}
		}

		for(int i = 0; i < columns; i++) {
			for(int j = 0; j < rows; j++) {
				System.out.print(matrix[j][i]);
			}
			System.out.print(" ");
		}

	}
}
