package HackerRank;

import java.util.Scanner;

public class UtopianTree {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int i = 0; i < testCases; i++) {
			int noOfCycles = sc.nextInt();
			int height = 1;
			for(int j = 0; j < noOfCycles; j++) {
				if(j % 2 == 0) {
					height *= 2;
				} else {
					height += 1;
				}
			}
			System.out.print(height + "\n");
		}
		
	}
}
