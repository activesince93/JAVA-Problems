package HackerRank;

import java.util.Scanner;

public class CorrectnessAndTheLoopInvariant {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int array[] = new int[arraySize];
		for(int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length-1; j++) {
				if(array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		for(int n: array){
            System.out.print(n+" ");
        }
	}
}
