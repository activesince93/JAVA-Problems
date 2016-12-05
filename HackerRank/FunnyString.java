package HackerRank;

import java.util.Scanner;


public class FunnyString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < testCases; i++) {
			String str = sc.nextLine();
			String revStr = new StringBuilder(str).reverse().toString();
			System.out.print(getStatus(str, revStr) + "\n");
		}
	}

	private static String getStatus(String str, String revStr) {
		for(int j = 1; j < str.length(); j++) {
			if(Math.abs(str.charAt(j) - str.charAt(j-1)) != Math.abs(revStr.charAt(j) - revStr.charAt(j-1))) {
				return "Not Funny";
			}
		}
		return "Funny";
	}
}