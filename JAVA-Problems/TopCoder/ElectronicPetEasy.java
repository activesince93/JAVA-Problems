package TopCoder;

import java.util.Scanner;

public class ElectronicPetEasy {
	public static void main(String args[]) {
		boolean isDifficult = false;
		Scanner scanner = new Scanner(System.in);
		int[] values = new int[6];
		
		
		for(int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		
		int st1 = values[0];
		int p1 = values[1];
		int t1 = values[2];
		int st2 = values[3];
		int p2 = values[4];
		int t2 = values[5];
		int firstPetFeedingTime[] = new int[t1];
		int secondPetFeedingTime[] = new int[t2];
		int allTimes[] = new int[firstPetFeedingTime.length + secondPetFeedingTime.length];
		
		for(int i = 0; i < firstPetFeedingTime.length; i++) {
			if(i == 0) {
				firstPetFeedingTime[i] = st1;
				allTimes[i] = firstPetFeedingTime[i];
			} else {
				firstPetFeedingTime[i] = firstPetFeedingTime[i-1] + p1;
				allTimes[i] = firstPetFeedingTime[i];
			}
		}
		
		for(int i = 0; i < secondPetFeedingTime.length; i++) {
			if(i == 0) {
				secondPetFeedingTime[i] = st2;
				allTimes[i+firstPetFeedingTime.length] = secondPetFeedingTime[i];
			} else {
				secondPetFeedingTime[i] = secondPetFeedingTime[i-1] + p2;
				allTimes[i+firstPetFeedingTime.length] = secondPetFeedingTime[i];
			}
		}
		
		for(int i = 0; i < allTimes.length; i++) {
			for(int j = 0; j < allTimes.length; j++) {
				if(i != j) {
					if(allTimes[i] == allTimes[j]) {
						isDifficult = true;
					}
				}
			}
		}
		
		if(isDifficult) {
			System.out.print("Difficult");
		} else {
			System.out.print("Easy");
		}
	}
}
