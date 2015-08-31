package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class CutTheSticks {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int noOfSticks = sc.nextInt();
		ArrayList<Integer> sticksLengthArray = new ArrayList<Integer>();
		for(int i = 0; i < noOfSticks; i++) {
			sticksLengthArray.add(sc.nextInt());
		}
		while(sticksLengthArray.size() > 0) {
			int count = 0;
			int minNum = getMinimumNo(sticksLengthArray);
			ArrayList<Integer> newSticksLengthArray = new ArrayList<Integer>();
			for(int i = 0; i < sticksLengthArray.size(); i++) {
				newSticksLengthArray.add(sticksLengthArray.get(i) - minNum);
				count ++;
			}
			sticksLengthArray = getNonZeroArray(newSticksLengthArray);
			System.out.print(count + "\n");
		}
	}

	private static ArrayList<Integer> getNonZeroArray(ArrayList<Integer> sticksLengthArray) {
		ArrayList<Integer> returnSticksLengthArray = new ArrayList<Integer>();
		for(int i = 0; i < sticksLengthArray.size(); i++) {
			if(sticksLengthArray.get(i) > 0) {
				returnSticksLengthArray.add(sticksLengthArray.get(i));
			}
		}
		return returnSticksLengthArray;
	}

	private static int getMinimumNo(ArrayList<Integer> sticksLengthArray) {
		int minNum = 9999;
		
		for(int i = 0; i < sticksLengthArray.size(); i++) {
			if(sticksLengthArray.get(i) < minNum) {
				minNum = sticksLengthArray.get(i);
			}
		}
		return minNum;
	}
}
