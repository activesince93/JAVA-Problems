package HackerRank;

import java.util.HashSet;
import java.util.Scanner;

public class Gemstones {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int numTestCases = sc.nextInt();
		HashSet<Character> baseSet = new HashSet<Character>();
		HashSet<Character> currSet = new HashSet<Character>();

		for (char c = 'a'; c <= 'z'; c++) {
			baseSet.add(c);
		}
		while (numTestCases > 0) {
			currSet.clear();
			char[] currentRockElements = sc.next().toCharArray();

			for (int i = 0; i < currentRockElements.length; i++) {
				currSet.add(currentRockElements[i]);
			}

			baseSet.retainAll(currSet);

			--numTestCases;
		}
		System.out.println(baseSet.size());
	}
}