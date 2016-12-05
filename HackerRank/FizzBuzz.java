import java.util.Scanner;

public class FizzBuzz {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int i = 0; i < testCases; i++) {
			int Num1 = sc.nextInt();
			int Num2 = sc.nextInt();
			System.out.println((Num1 + Num2) + "");
		}
	}
}