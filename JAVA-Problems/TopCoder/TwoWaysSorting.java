package TopCoder;

public class TwoWaysSorting {
	public static void main(String args[]) {
		String pattern[] = {"c", "bb", "aaa"};
		boolean isLexographically = false;
		boolean isLength = false;
		
		isLexographically = getIsLexoGraphically(pattern);
		isLength = getIsLength(pattern);
		
		if(isLexographically && isLength) {
			System.out.print("Both");
		} else if(isLexographically) {
			System.out.print("Lexographically");
		} else if(isLength) {
			System.out.print("Length");
		} else {
			System.out.print("None");
		}
	}

	private static boolean getIsLexoGraphically(String[] pattern) {
		boolean isLexographically = true;
		for(int i = 0; i < pattern.length - 1; i++) {
			String str1 = pattern[i];
			String str2 = pattern[i+1];
			int length = (str1.length() < str2.length()) ? str1.length() : str2.length();
			for(int j = 0; j < length; j++) {
				if(str1.charAt(j) > str2.charAt(j)) {
					isLexographically = false;
					break;
				}
				if(str1.charAt(j) == str2.charAt(j)) {
					if(str1.length() > str2.length()) {
						isLexographically = false;
					}
				}
			}
			if(!isLexographically) {
				break;
			}
		}
		return isLexographically;
	}

	private static boolean getIsLength(String[] pattern) {
		boolean isLength = true;
		for(int i = 0; i < pattern.length - 1; i++) {
			String str1 = pattern[i];
			String str2 = pattern[i+1];
			if(str1.length() > str2.length()) {
				isLength = false;
				break;
			}
		}
		return isLength;
	}
}
