package Test;

import java.util.Scanner;

public class SherlockAndValidString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int values[] = new int[26];
		
		int len = str.length();
		for(int i = 0; i < len; i++) {
			values[str.charAt(i)-97] += 1; 
		}
		
		int nonZero = 0;
		for(int i = 0; i < 26; i++) {
			if(values[i] != 0) {
				nonZero += 1;
			}
		}
		boolean possible = true;
		boolean ifFirst = false;
		if(len % nonZero == 0) {
			int num = len / nonZero;
			for(int i = 0; i < 26; i++) {
				if(values[i] != num && values[i] != 0) {
					if(values[i] == num + 1 && !ifFirst) {
						ifFirst = true;
					} else {
						possible = false;
						break;
					}
				}
			}
			if(possible)
				System.out.print("YES");
			else 
				System.out.print("NO");
		} else {
			System.out.print("NO");
		}
	}
}
