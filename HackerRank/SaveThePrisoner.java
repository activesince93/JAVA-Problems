import java.util.Scanner;

public class SaveThePrisoner {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int i = 0; i < testCases; i++) {
			int prisoners = sc.nextInt();
			int candies = sc.nextInt();
			int start = sc.nextInt();
			
			System.out.println((((candies % prisoners) - 1) + start) % prisoners + "");
		}
	}
}
