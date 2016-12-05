package HackerRank;

import java.util.Scanner;

public class LibraryFine {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		int daye = sc.nextInt();
		int monthe = sc.nextInt();
		int yeare = sc.nextInt();
		
		if(day > daye && month == monthe && year == yeare) {
			System.out.print(15 * (day - daye));
		} else if(month > monthe && year == yeare) {
			System.out.print(500 * (month - monthe));
		} else if(year > yeare) {
			System.out.print(10000);
		} else {
			System.out.print(0);
		}
	}
}
