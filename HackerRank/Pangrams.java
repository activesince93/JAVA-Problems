package HackerRank;

import java.util.Scanner;

public class Pangrams {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < str.length(); j++) {
				if((i+65) == str.charAt(j) || (i+97) == str.charAt(j)) {
					count ++;
					break;
				}
			}
		}
		if(count == 26) {
			System.out.print("pangram");
		} else {
			System.out.print("not pangram");
		}
	}
}
