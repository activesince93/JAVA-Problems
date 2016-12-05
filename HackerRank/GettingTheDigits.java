import java.util.Scanner;

public class GettingTheDigits {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < testCases; i++) {
			String stringValue = sc.nextLine();
			StringBuilder str = new StringBuilder(stringValue);
			String number = "";
			while (stringValue.contains("Z") && stringValue.contains("E") && stringValue.contains("R")
					&& stringValue.contains("O")) {
				number += 0;
				str.setCharAt(str.indexOf("Z"), ' ');
				str.setCharAt(str.indexOf("E"), ' ');
				str.setCharAt(str.indexOf("R"), ' ');
				str.setCharAt(str.indexOf("O"), ' ');
				stringValue = str.toString();
			}
			while (stringValue.contains("O") && stringValue.contains("N") && stringValue.contains("E")) {
				number += 1;
				str.setCharAt(str.indexOf("O"), ' ');
				str.setCharAt(str.indexOf("N"), ' ');
				str.setCharAt(str.indexOf("E"), ' ');
				stringValue = str.toString();
			}
			while (stringValue.contains("T") && stringValue.contains("W") && stringValue.contains("O")) {
				number += 2;
				str.setCharAt(str.indexOf("T"), ' ');
				str.setCharAt(str.indexOf("W"), ' ');
				str.setCharAt(str.indexOf("O"), ' ');
				stringValue = str.toString();
			}
			while (stringValue.contains("T") && stringValue.contains("H") && stringValue.contains("R")
					&& hasTwoChars(stringValue, "E")) {
				number += 3;
				str.setCharAt(str.indexOf("T"), ' ');
				str.setCharAt(str.indexOf("H"), ' ');
				str.setCharAt(str.indexOf("R"), ' ');
				str.setCharAt(str.indexOf("E"), ' ');
				str.setCharAt(str.indexOf("E"), ' ');
				stringValue = str.toString();
			}
			while (stringValue.contains("F") && stringValue.contains("O") && stringValue.contains("U")
					&& stringValue.contains("R")) {
				number += 4;
				str.setCharAt(str.indexOf("F"), ' ');
				str.setCharAt(str.indexOf("O"), ' ');
				str.setCharAt(str.indexOf("U"), ' ');
				str.setCharAt(str.indexOf("R"), ' ');
				stringValue = str.toString();
			}
			while (stringValue.contains("F") && stringValue.contains("I") && stringValue.contains("V")
					&& stringValue.contains("E")) {
				number += 5;
				str.setCharAt(str.indexOf("F"), ' ');
				str.setCharAt(str.indexOf("I"), ' ');
				str.setCharAt(str.indexOf("V"), ' ');
				str.setCharAt(str.indexOf("E"), ' ');
				stringValue = str.toString();
			}
			while (stringValue.contains("S") && stringValue.contains("I") && stringValue.contains("X")) {
				number += 6;
				str.setCharAt(str.indexOf("S"), ' ');
				str.setCharAt(str.indexOf("I"), ' ');
				str.setCharAt(str.indexOf("X"), ' ');
				stringValue = str.toString();
			}
			while (stringValue.contains("S") && stringValue.contains("V")
					&& stringValue.contains("N") && hasTwoChars(stringValue, "E")) {
				number += 7;
				str.setCharAt(str.indexOf("S"), ' ');
				str.setCharAt(str.indexOf("E"), ' ');
				str.setCharAt(str.indexOf("V"), ' ');
				str.setCharAt(str.indexOf("E"), ' ');
				str.setCharAt(str.indexOf("N"), ' ');
				stringValue = str.toString();
			}
			while (stringValue.contains("E") && stringValue.contains("I") && stringValue.contains("G")
					&& stringValue.contains("H") && stringValue.contains("T")) {
				number += 8;
				str.setCharAt(str.indexOf("E"), ' ');
				str.setCharAt(str.indexOf("I"), ' ');
				str.setCharAt(str.indexOf("G"), ' ');
				str.setCharAt(str.indexOf("H"), ' ');
				str.setCharAt(str.indexOf("T"), ' ');
				stringValue = str.toString();
			}
			while (hasTwoChars(stringValue, "N") && stringValue.contains("I")
					&& stringValue.contains("E")) {
				number += 9;
				str.setCharAt(str.indexOf("N"), ' ');
				str.setCharAt(str.indexOf("I"), ' ');
				str.setCharAt(str.indexOf("N"), ' ');
				str.setCharAt(str.indexOf("E"), ' ');
				stringValue = str.toString();
			}
			System.out.println("Case #" + (i + 1) + ": " + number);
		}
	}

	static boolean hasTwoChars(String str, String character) {
		int i;
		if ((i = str.indexOf(character)) != -1)
			if ((i = str.indexOf(character, i + 1)) != -1)
				return true;
		return false;
	}
}
