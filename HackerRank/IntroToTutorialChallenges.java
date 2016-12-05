package HackerRank;

import java.util.Scanner;

public class IntroToTutorialChallenges {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int searchNum = sc.nextInt();
		int arraySize = sc.nextInt();
		for(int i = 0; i < arraySize; i++) {
			if(sc.nextInt() == searchNum) {
				System.out.print(i);
				break;
			}
		}
	}
}
