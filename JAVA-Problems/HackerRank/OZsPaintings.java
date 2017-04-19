import java.util.Scanner;

public class OZsPaintings {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int Z = sc.nextInt();
			int total = 0;
			int minimum = ((X < Y && X < Z) ? X : (Y < Z && Y < X) ? Y : Z);
			total = minimum;
			X = X - minimum;
			Y = Y - minimum;
			Z = Z - minimum;

			if (X != 0)
				total += Math.ceil(X / 3);
			if (Y != 0)
				total += Math.ceil(Y / 3);
			if (Z != 0)
				total += Math.ceil(Z / 3);

			System.out.println(total + "");
		}
	}
}
