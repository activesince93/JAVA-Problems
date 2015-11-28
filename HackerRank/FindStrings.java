package HackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class FindStrings {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> hashSet = new HashSet<String>();
		int stringsCount = sc.nextInt();
		sc.nextLine();
		for (int k = 0; k < stringsCount; k++) {
			String str = sc.nextLine().trim();
			for (int i = 0; i < str.length(); i++) {
				for (int j = i; j < str.length(); j++) {
					hashSet.add(str.substring(i, j + 1));
				}
			}
		}
		String arrStr[] = hashSet.toArray(new String[hashSet.size()]);
		Arrays.sort(arrStr);
		int testCases = Integer.parseInt(sc.nextLine().trim());
		for(int i = 0; i < testCases; i++) {
			int num = Integer.parseInt(sc.nextLine().trim());
			if(num <= arrStr.length)
				System.out.println(arrStr[num-1]);
			else
				System.out.println("INVALID");
		}
	}
}