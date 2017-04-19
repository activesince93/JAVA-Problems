package HackerRank;

import java.util.Scanner;

public class ServiceLane {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int laneLength = sc.nextInt();
		int testCases = sc.nextInt();
		int laneLenghtArray[] = new int[laneLength];
		for(int i = 0; i < laneLength; i++) {
			laneLenghtArray[i] = sc.nextInt();
		}
		
		for(int i = 0; i < testCases; i++) {
			int enterPoint = sc.nextInt();
			int exitPoint = sc.nextInt();
			int minLengthVehicle = 99;
			for(int j = enterPoint; j <= exitPoint; j++) {
				if(laneLenghtArray[j] < minLengthVehicle) {
					minLengthVehicle = laneLenghtArray[j];
				}
			}
			System.out.print(minLengthVehicle + "\n");
		}
	}
}
