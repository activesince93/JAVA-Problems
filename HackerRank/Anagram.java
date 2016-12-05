package HackerRank;

import java.util.Scanner;

public class Anagram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < testCases; i++) {
			String str = sc.nextLine();
			int count = sortString(str);
			System.out.print(count + "\n");
		}
	}

	private static int sortString(String str) {
		int count = 0;
		if(str.length() % 2 == 0) {
			String str1 = str.substring(0, str.length()/2);
			String str2 = str.substring(str.length()/2);
			count = getAnagramCount(str1, str2);
		} else {
			count = -1;
		}
		return count;
	}

	private static int getAnagramCount(String str1, String str2) {
		int str1Repeat[] = new int[26];
		int str2Repeat[] = new int[26];
		int difference = 0;
		for(int i = 0; i < str1.length(); i++) {
			str1Repeat[str1.charAt(i) - 97] += 1; 
		}
		for(int i = 0; i < str2.length(); i++) {
			str2Repeat[str2.charAt(i) - 97] += 1; 
		}
		
		for(int i = 0; i < str1Repeat.length; i++) {
			difference += Math.abs(str1Repeat[i] - str2Repeat[i]);
		}
		return difference/2;
	}
}
