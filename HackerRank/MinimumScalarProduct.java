import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MinimumScalarProduct {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long testCases = sc.nextLong();
		for (int j = 0; j < testCases; j++) {
			ArrayList<Long> arrayA = new ArrayList<>();
			ArrayList<Long> arrayB = new ArrayList<>();
			int numbers = sc.nextInt();
			for (int i = 0; i < numbers; i++) {
				arrayA.add(sc.nextLong());
			}
			for (int i = 0; i < numbers; i++) {
				arrayB.add(sc.nextLong());
			}
			Collections.sort(arrayA);
			Collections.sort(arrayB);
			Collections.reverse(arrayB);
			long total = 0;
			for (int i = 0; i < numbers; i++) {
				total += (arrayA.get(i) * arrayB.get(i));
			}
			System.out.println("Case #" + (j + 1) + ": " + total);
		}
	}
}
