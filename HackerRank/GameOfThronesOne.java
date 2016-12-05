package HackerRank;

import java.util.Scanner;

public class GameOfThronesOne {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strArray[] = new String[26];
		if(str.length() % 2 == 0) {
			for(int i = 0; i < str.length(); i++) {
				if(strArray[str.charAt(i) - 97] != null) {
					strArray[str.charAt(i) - 97] += "1";
				} else {
					strArray[str.charAt(i) - 97] = "1";
				}
			}
		} else {
			for(int i = 0; i < str.length(); i++) {
				if(strArray[str.charAt(i) - 97] != null) {
					strArray[str.charAt(i) - 97] += "1";
				} else {
					strArray[str.charAt(i) - 97] = "1";
				}
			}
		}
		if(str.length() % 2 == 0) {
			boolean evenPossible = true;
			for(int i = 0; i < strArray.length; i++) {
				if(strArray[i] != null) {
					if(strArray[i].length() % 2 != 0) {
						System.out.print("NO");
						evenPossible = false;
						break;
					}
				}
			}
			if(evenPossible) {
				System.out.print("YES");
			}
		} else {
			boolean oddPossible = true;
			int singleInstance = 0;
			for(int i = 0; i < strArray.length; i++) {
				if(strArray[i] != null) {
					if(strArray[i].length() % 2 != 0 && singleInstance == 0) {
						singleInstance ++;
					} else if(strArray[i].length() % 2 != 0 && singleInstance == 1) {
						System.out.print("NO");
						oddPossible = false;
						break;
					}
				}
			}
			if(oddPossible) {
				System.out.print("YES");
			}
		}
	}
}
