package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ManasaAndStones {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		for(int i = 0; i < testCases; i++) {
			int stones = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			ArrayList<Integer> uniqueArrayList = new ArrayList<Integer>();
			for(int j = stones-1; j >= 0; j--) {
				uniqueArrayList.add((j*a) + ((stones- j - 1) * b));
			}
			uniqueArrayList = uniqueList(uniqueArrayList);
			Collections.sort(uniqueArrayList);
			
			for(int j = 0; j < uniqueArrayList.size(); j++) {
				System.out.print(uniqueArrayList.get(j) + " ");
			}
			System.out.println();
		}
	}

	private static ArrayList<Integer> uniqueList(ArrayList<Integer> uniqueArrayList) {
		Set<Integer> hs = new HashSet<>();
		hs.addAll(uniqueArrayList);
		uniqueArrayList.clear();
		uniqueArrayList.addAll(hs);
		return uniqueArrayList;
	}
}
