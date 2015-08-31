package HackerRank;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long start = sc.nextInt();
		long end = sc.nextInt();
		long count = 0;
		for(long i = start; i <= end; i++) {
			if(isKaprekarNumber(i)) {
				System.out.print(i + " ");
				count ++;
			}
		}
		if(count == 0) {
			System.out.print("INVALID RANGE");
		}
	}

	private static boolean isKaprekarNumber(long i) {
		// TODO Auto-generated method stub
		String squareString = String.valueOf(i * i);
		if(Long.parseLong(squareString) != i) {
			if(squareString.length() > 1) {
				long firstPart = Long.parseLong(squareString.substring(0, squareString.length()/2));
				long secondpart = Long.parseLong(squareString.substring(squareString.length()/2, squareString.length()));
				if(firstPart + secondpart == i) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return true;
		}
	}
}
