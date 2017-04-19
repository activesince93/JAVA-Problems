package HackerRank;

import java.util.Scanner;

public class TheGridSearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < testCases; i++) {
			String rowColumn = sc.nextLine();
			String strArray[] = rowColumn.split(" ");
			int rows = Integer.parseInt(strArray[0]);
			int columns = Integer.parseInt(strArray[1]);
			int mainMatrix[][] = new int[rows][columns];
			for(int j = 0; j < rows; j++) {
				String str = sc.nextLine();
				for(int k = 0; k < columns; k++) {
					mainMatrix[j][k] = Character.getNumericValue(str.charAt(k));
				}
			}

			String smallRowColumn = sc.nextLine();
			String strSmallArray[] = smallRowColumn.split(" ");
			int smallRows = Integer.parseInt(strSmallArray[0]);
			int smallColumns = Integer.parseInt(strSmallArray[1]);
			int smallMatrix[][] = new int[smallRows][smallColumns];
			for(int j = 0; j < smallRows; j++) {
				String str = sc.nextLine();
				for(int k = 0; k < smallColumns; k++) {
					smallMatrix[j][k] = Character.getNumericValue(str.charAt(k));
				}
			}
			boolean isPossible = false;
			mainloop:
				for(int j = 0; j < (rows - smallRows); j++) {
					for(int k = 0; k < (columns - smallColumns); k++) {
						boolean possible = true;
						outerloop:
							for(int a = 0; a < smallRows; a++) {
								for(int b = 0; b < smallColumns; b++) {
									if(mainMatrix[a+j][b+k] != smallMatrix[a][b]) {
										possible = false;
										break outerloop;
									}
								}
							}
						if(possible) {
							isPossible = true;
							break mainloop;
						}
					}
				}
			if(isPossible) System.out.print("YES");
			else System.out.print("NO");
			System.out.println();
		}
	}
}
