import java.util.Scanner;

public class RDCalculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int initialAmount = sc.nextInt();
		double amount = initialAmount;
		double interest = sc.nextDouble();
		int months = sc.nextInt();
		int count = 0;
		while(months > 0) {
			amount += (amount * (interest/1200));
			months -= 1;
			System.out.println("Month " + ++count + ": " + (int)amount);
			amount += initialAmount;
		}
	}
}