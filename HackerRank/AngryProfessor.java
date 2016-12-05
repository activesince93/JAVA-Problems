package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class AngryProfessor {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		for(int i = 0; i < testCases; i++) {
			int N = scanner.nextInt();
			int K = scanner.nextInt();
			int count = 0;
			ArrayList<Integer> studentTime = new ArrayList<Integer>();
			for(int j = 0; j < N; j++) {
				studentTime.add(scanner.nextInt());
			}
			for(int j = 0; j < studentTime.size(); j++) {
				if(studentTime.get(j) <= 0) {
					count += 1;
				}
			}
			if(count >= K) {
				System.out.print("NO");
			} else {
				System.out.print("YES");
			}
			System.out.println();
		}
	}
}
