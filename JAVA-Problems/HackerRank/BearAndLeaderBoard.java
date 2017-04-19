import java.util.Scanner;

public class BearAndLeaderBoard {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int students = sc.nextInt();
		int queries = sc.nextInt();
		int studentScores[] = new int[students];
		int studentForSorting[] = new int[students];
		for (int i = 0; i < queries; i++) {
			int studentNo = sc.nextInt();
			int studentScore = sc.nextInt();

			studentScores[studentNo - 1] += studentScore;
			studentForSorting = reverse(studentScores);
			System.out.println(String.valueOf(getHashValue(studentForSorting)));
		}
	}

	private static int getHashValue(int[] studentForSorting) {
		int previousMultiplier = 0;
		int previousValue = 0;
		int returnHash = 0;
		int multiplier = 1;
		int repeatCount = 1;
		for (int i = 0; i < studentForSorting.length; i++) {
			if (i != 0) {
				if (studentForSorting[i] == previousValue) {
					multiplier = previousMultiplier;
					repeatCount += 1;
				} else {
					multiplier += repeatCount;
					repeatCount = 1;
				}
			}
			returnHash += (studentForSorting[i] * (multiplier));
			previousMultiplier = multiplier;
			previousValue = studentForSorting[i];
		}
		return returnHash;
	}

	private static int[] reverse(int[] originalArray) {
		int n = originalArray.length;
		int intArray[] = new int[n];
		for(int i = 0; i < n; i++) intArray[i] = originalArray[i];
		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (intArray[j - 1] < intArray[j]) {
					int temp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		return intArray;
	}
}
