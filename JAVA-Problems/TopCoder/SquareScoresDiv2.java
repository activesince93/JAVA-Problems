package TopCoder;

import java.util.ArrayList;

public class SquareScoresDiv2 {
	
	static String str = "p";
	static String series = "";
	static int subStringLength = 0;
	static int occurances = 0;
	public static void main(String args[]) {
		
		ArrayList<String> seriesList = new ArrayList<String>();
		
		for(int i = 0; i < str.length(); i += subStringLength) {
			series = "";
			for(int j = i; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					series += String.valueOf(str.charAt(j));
					subStringLength = series.length();
				} else {
					subStringLength = series.length();
					break;
				}
			}
			seriesList.add(series);
		}
		
		for(int i = 0; i < seriesList.size(); i++) {
			int n = seriesList.get(i).length();
			occurances += ((n*(n+1))/2);
		}
		System.out.print("\nOccurances: " + occurances);
	}
}
