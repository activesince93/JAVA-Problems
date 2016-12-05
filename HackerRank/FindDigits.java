package HackerRank;

import java.util.Scanner;

public class FindDigits {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int i = 0; i < testCases; i++) {
			long number = sc.nextLong();
			String longString = String.valueOf(number);
			int count = 0;
			for(int j = 0; j < longString.length(); j++) {
				if(Character.getNumericValue(longString.charAt(j)) != 0) {
					if(number % Character.getNumericValue(longString.charAt(j)) == 0) {
						count += 1;
					}
				}
			}
			System.out.print(count + "\n");
		}
	}
}
