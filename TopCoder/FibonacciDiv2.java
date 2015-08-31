package TopCoder;

import java.util.ArrayList;

public class FibonacciDiv2 {
	public static void main(String args[]) {
		int number = 1000000;
		ArrayList<Integer> fibonacciList = new ArrayList<Integer>();
		int num1 = 0;
		int num2 = 1;
		int temp = 0;
		fibonacciList.add(num1);
		fibonacciList.add(num2);
		while(num2 < 1000000) {
			temp = num2;
			num2 = temp + num1;
			num1 = temp;
			fibonacciList.add(num2);
		}
		
		int minDiff = 1000000;
		for(int i = 0; i < fibonacciList.size(); i++) {
			int difference = Math.abs(number - fibonacciList.get(i));
			if(minDiff > difference) {
				minDiff = difference;
			}
		}
		System.out.print(minDiff);
	}
}
