package TopCoder;

import java.util.ArrayList;

public class CircularShift {
	static String input = "isgbiao";
	static String nextString = "isgbiao";
	static String minString = "isgbiao";
	static char maxChar = 'a';
	static int maxChanges = 2;
	static int count = 0;
	static StringBuilder sb;
	static ArrayList<String> allStrings = new ArrayList<String>();
	static ArrayList<String> replacedStrings = new ArrayList<String>();
	public static void main(String args[]) {

		StringBuilder sb1 = new StringBuilder(nextString);
		
		// finding no of strings with all shift possiblities
		for(int j = 0; j < input.length(); j++) {
			for(int i = 0; i < input.length(); i++) {
				sb1.setCharAt(i, (i == input.length() - 1) ? input.charAt(0) : input.charAt(i+1));
			}
			nextString = sb1.toString();
			allStrings.add(nextString);
			if(!getMinString(minString, nextString).equals(minString)) {
				minString = nextString;
			}
			input = nextString;
		}
		
		// result of all possiblities after replacing no of characters
		for(int k = 0; k < allStrings.size(); k++) {
			maxChar = 'a';
			count = 0;
			StringBuilder sb99 = new StringBuilder(allStrings.get(k));
			for(int i = 0; i < minString.length(); i++) {
				if(sb99.charAt(i) > maxChar) {
					if(count < maxChanges) {
						sb99.setCharAt(i, 'a');
						count += 1;
					}
				}
			}
			replacedStrings.add(sb99.toString());
		}
		
		// finding smallest string from result array
		String answerString = replacedStrings.get(0);
		for(int i = 0; i < replacedStrings.size(); i++) {
			answerString = getMinString(replacedStrings.get(i), answerString);
		}
		System.out.print("Answer is: " + answerString);
	}
	
	
	// get min string from two string
	static String getMinString(String first, String second) {
		String smallestString = "";
		for(int i = 0; i < first.length(); i++) {
			if(first.charAt(i) < second.charAt(i)) {
				smallestString = first;
				break;
			} else if(first.charAt(i) > second.charAt(i)){
				smallestString = second;
				break;
			} else {
				smallestString = second;
			}
		}
		return smallestString;
	}
}