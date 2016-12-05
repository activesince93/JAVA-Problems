package HackerRank;

import java.util.Scanner;

public class CavityMap {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int matrixSize = Integer.parseInt(sc.nextLine());
		int matrix[][] = new int[matrixSize][matrixSize];
		
		for(int i = 0; i < matrixSize; i++) {
			String str = sc.nextLine();
			for(int j = 0; j < str.length(); j++) {
				matrix[i][j] = Character.getNumericValue(str.charAt(j));
			}
		}
		
		for(int i = 1; i < matrixSize-1; i++) {
			for(int j = 1; j < matrixSize-1; j++) {
				if(matrix[i][j] > matrix[i][j-1] && matrix[i][j] > matrix[i][j+1]
						&& matrix[i][j] > matrix[i-1][j] && matrix[i][j] > matrix[i+1][j]) {
					matrix[i][j] = 'X';
				}
			}
		}
		for(int i = 0; i < matrixSize; i++) {
			for(int j = 0; j < matrixSize; j++) {
				if(matrix[i][j] == 88) {
					System.out.print("X");
				} else {
					System.out.print(matrix[i][j]);
				}
			}
			System.out.println();
		}
	}
}
