package HackerRank;

import java.util.Scanner;

public class CaesarCipher {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int strLen = scanner.nextInt();
		String str = scanner.next();
		int noOfShifts = scanner.nextInt();
		StringBuilder sb = new StringBuilder(str);
		
		for(int i = 0; i < strLen; i++) {
			int value = str.charAt(i);
			if(value >= 65 && value <= 90) {
				noOfShifts = noOfShifts % 26;
				value += noOfShifts;
				if(value > 90) {
					value -= 26;
				}
			} else if(value >= 97 && value <= 122) {
				noOfShifts = noOfShifts % 26;
				value += noOfShifts;
				if(value > 122) {
					value -= 26;
				}
			}
			sb.setCharAt(i, (char)value);
		}
		System.out.print(sb.toString());
	}
}