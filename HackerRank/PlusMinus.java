package HackerRank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class PlusMinus {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double numbers = scanner.nextInt();
		double positive = 0, negative = 0, neutral = 0;
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for(int i = 0; i < numbers; i++) {
			numberList.add(scanner.nextInt());
		}

		for(int i = 0; i < numbers; i++) {
			if(numberList.get(i) > 0) {
				positive ++;
			} else if(numberList.get(i) < 0) {
				negative ++;
			} else {
				neutral ++;
			}
		}
		double a = positive / numbers;
		double b = negative / numbers;
		double c = neutral / numbers;
		System.out.print(new DecimalFormat("##.###").format(a) + "\n" + new DecimalFormat("##.###").format(b) + "\n" + new DecimalFormat("##.###").format(c));
	}
}