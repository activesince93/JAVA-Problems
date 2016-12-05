package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		System.out.print(getFatorial(number).toString());
	}

	private static BigInteger getFatorial(int number) {
		BigInteger fact = new BigInteger("1");
		while(number > 0) {
			fact = fact.multiply(new BigInteger(String.valueOf(number)));
			number--;
		}
		return fact;
	}
}
