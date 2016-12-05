import java.util.Scanner;

public class TrailingZeros {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();		
		int count = 0;
		while(number > 0) {
			number /= 5;
			count += number;
		}
		System.out.println(count + "");
	}
}
