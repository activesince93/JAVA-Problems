package HackerRank;

import java.util.Scanner;

public class SherlockAndSquares {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int j = 0; j < testCases; j++) {
			int startNum = sc.nextInt();
			int endNum = sc.nextInt();
			int count = 0;
			
			int startSqrtNo = (int)Math.sqrt(startNum);
			
			while(startSqrtNo * startSqrtNo <= endNum) {
				if(startSqrtNo * startSqrtNo >= startNum && startSqrtNo * startSqrtNo <= endNum) {
					count ++;
				}
				startSqrtNo ++;
			}
			System.out.print(count + "\n");
		}
	}
}