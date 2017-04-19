package HackerRank;

import java.util.Scanner;

public class ChocolateFeast {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		for(int i = 0; i < testCases; i++) {
			int N = sc.nextInt();
			int C = sc.nextInt();
			int M = sc.nextInt();
			int noOfChocolates = 0;
			int wrappers = 0;
			noOfChocolates += N/C;
			wrappers = noOfChocolates;
			while(wrappers >= M) {
				int a = wrappers/M;
				noOfChocolates += a;
				wrappers = (a + (wrappers%M));
			}
			System.out.print(noOfChocolates + "\n");
		}
	}
}