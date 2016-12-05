import java.util.Scanner;

public class AlienLanguage {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int strLength = sc.nextInt();
		int noOfStrings = sc.nextInt();
		int testCases = sc.nextInt();
		String sourceStringsArray[] = new String[noOfStrings];
		sc.nextLine();
		for(int i = 0; i < noOfStrings; i++) {
			sourceStringsArray[i] = sc.nextLine();
		}
		for(int i = 0; i < testCases; i++) {
			String checkStr = sc.nextLine();
			int count = 0;
			for(int j = 0; j < noOfStrings; j++) {
				if(isMatching(checkStr, sourceStringsArray[j], strLength)) {
					count += 1;
				}
			}
			System.out.println("Case #" + (i + 1) + ": " + count);
		}
	}
	
	private static boolean isMatching(String checkStr, String sourceStr, int strLength) {
		for (int i = 0; i < strLength; i++) {
			if (checkStr.charAt(0) == '(') {
				boolean matched = false;
				String str = checkStr.substring(checkStr.indexOf("(") + 1, checkStr.indexOf(")"));
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == sourceStr.charAt(i)) {
						matched = true;
						break;
					}
				}
				if (!matched)
					return false;
				checkStr = checkStr.substring(checkStr.indexOf(")") + 1);
			} else {
				if (sourceStr.charAt(i) != checkStr.charAt(0)) {
					return false;
				} else {
					checkStr = checkStr.substring(1);
				}
			}
		}
		return true;
	}
}
