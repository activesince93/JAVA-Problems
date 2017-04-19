package HackerRank;

import java.util.Scanner;

public class AlternatingCharacters {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < testCases; i++) {
			String str = sc.nextLine();
			int count = getRemoveCharCounts(str);
			System.out.print(count + "\n");
		}
	}

	private static int getRemoveCharCounts(String str) {
		int count = 0;
		for(int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			}
		}
		return count;
	}
}