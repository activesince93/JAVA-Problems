package CodeJam2017;

import java.util.Scanner;

public class TidyNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int i = 0; i < testCases; i++) {
			System.out.println("Case #" + (i+1) + ": " +String.valueOf(findTidy(sc.nextLong())));
		}
	}

	private static long findTidy(long number) {
		if (checkIfTidy(number)) {
			return number;
		} else {
			if(number > 0){ 
				return findTidy(getNextNumToCheck(number));
			} else {
				return 0;
			}
		}
	}
	
	private static long getNextNumToCheck(long number) {
		String numberStr = String.valueOf(number);
		String newNumberStr = "";
		for(int i = 0; i < numberStr.length() - 1; i++) {
			if(numberStr.charAt(i) > numberStr.charAt(i + 1)) {
				String extraString;
				if((Character.getNumericValue(numberStr.charAt(i + 1)) - 1) <= 0) {
					newNumberStr += numberStr.substring(0, i);
					newNumberStr += Character.getNumericValue(numberStr.charAt(i)) - 1;
					extraString = numberStr.substring(i + 1);
				} else {
					newNumberStr += numberStr.substring(0, i + 1);
					newNumberStr += Character.getNumericValue(numberStr.charAt(i + 1)) - 1;
					extraString = numberStr.substring(i + 2);
				}
				extraString = extraString.replaceAll(".", "9");
				newNumberStr += extraString;
				break;
			}
			newNumberStr = "";
		}
		return Long.valueOf(newNumberStr);
	}

	private static boolean checkIfTidy(long number) {
		String numberStr = String.valueOf(number);
		if(numberStr.length() == 1) return true;
		for(int i = 0; i < numberStr.length() - 1; i++) {
			if(numberStr.charAt(i) > numberStr.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}
}
