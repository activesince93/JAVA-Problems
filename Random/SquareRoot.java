package Random;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		double sqrt = getSquareRoot(number);
		System.out.println("Square root of number " + number + " is: " + sqrt);
	}
	
	static double getSquareRoot(int num) {
		double t = 0;
		double sqrtRoot = num / 2;
		do {
			t = sqrtRoot;
			sqrtRoot = (t + (num/t)) / 2;
		} while((t - sqrtRoot) != 0);
		
		return sqrtRoot;
	}
}