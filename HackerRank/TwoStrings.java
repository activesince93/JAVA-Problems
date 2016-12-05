package HackerRank;

import java.util.Scanner;

public class TwoStrings {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < testCases; i++) {
			boolean status = false;
			String first = sc.nextLine();
			String second = sc.nextLine();
			
			int firstStrRepeat[] = new int[26];
			int secondStrRepeat[] = new int[26];
			
			for(int j = 0; j < first.length(); j++) {
				firstStrRepeat[first.charAt(j) - 97] += 1; 
			}
			for(int j = 0; j < second.length(); j++) {
				secondStrRepeat[second.charAt(j) - 97] += 1; 
			}
			
			for(int j = 0; j < firstStrRepeat.length; j++) {
				if(firstStrRepeat[j] > 0 && secondStrRepeat[j] > 0) {
					status = true;
					break;
				}
			}
			if(status) System.out.print("YES\n");
			else System.out.print("NO\n");
		}
	}
}
