package TopCoder;

import java.util.ArrayList;

public class ValueOfString {
	
	static int count = 0;
	static int total = 0;
	
	public static void main(String args[]) {
		String s = "zyxwvutsrqponmlkjihgfedcba";
		ArrayList<Integer> inputList = new ArrayList<Integer>();
		
		inputList = stringToValuesArray(s);
		
		for(int i = 0; i < inputList.size(); i++) {
			count = 0;
			for(int j = 0; j < inputList.size(); j++) {
				if(inputList.get(i) >= inputList.get(j)) {
					count++;
				}
			}
			total += count * inputList.get(i);
		}
		System.out.print("String value: " + total);
	}

	private static ArrayList<Integer> stringToValuesArray(String s) {
		// TODO Auto-generated method stub
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		for(int i = 0; i < s.length(); i++) {
			returnList.add(s.charAt(i)-96);
		}
		return returnList;
	}
}
