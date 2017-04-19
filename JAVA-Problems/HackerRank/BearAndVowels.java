import java.util.Scanner;

public class BearAndVowels {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < testCases; i++) {
			System.out.println(isHard(sc.nextLine()) ? "hard" : "easy");
		}
		sc.close();
	}

	private static boolean isHard(String nextLine) {
		int vowelsCount = 0;
		for(int i = 0; i < nextLine.length(); i++) {
			char strChar = nextLine.charAt(i);
			if(isVowel(strChar)) {
				++vowelsCount;
			}
		}
		int consonantsCount = nextLine.length() - vowelsCount;
		if(consonantsCount > vowelsCount) {
			return true;
		} else {
			return hasConsecutive(nextLine);
		}
	}

	private static boolean hasConsecutive(String nextLine) {
		if(nextLine.length() >= 3) {
			for(int i = 0; i < nextLine.length() - 3; i++) {
				if(!isVowel(nextLine.charAt(i)) 
						&& !isVowel(nextLine.charAt(i + 1)) 
						&& !isVowel(nextLine.charAt(i + 2))) {
					return true;
				}
			}
		} else {
			return true;	
		}
		return false;
	}
	
	private static boolean isVowel(char strChar) {
		return (strChar == 'a' || strChar == 'e' || strChar == 'i' 
				|| strChar == 'o' || strChar == 'u' || strChar == 'y');
	}
}
