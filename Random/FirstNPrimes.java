package CodeJam2017;

import java.util.Scanner;

public class FirstNPrimes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int lastNum = sc.nextInt();
		boolean isPrimeArr[] = new boolean[lastNum];
		
		for(int i = 2; i < lastNum; i++) {
			if(!isPrimeArr[i]) {
				int num = i;
				while(num < lastNum) {
					isPrimeArr[num] = true;
					num += i;
				}
				System.out.println(String.valueOf(i));
			}
		}
	}
}