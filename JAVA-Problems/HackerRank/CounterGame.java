import java.util.Scanner;

public class CounterGame {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; i++) {
			long number = sc.nextLong();
			getWinner(number);
		}
	}

	private static void getWinner(long number) {
		String winner = "Richard";
		if (number == 1) {
			System.out.println(winner);
		} else {
			winner = "Louise";
			String binaryBigIntStr = Long.toBinaryString(number);
			while (true) {
				String exceptFirst = binaryBigIntStr.substring(1);
				if (Long.parseLong(exceptFirst, 2) == 0) {
					// N is power of 2
					binaryBigIntStr = binaryBigIntStr.substring(0, binaryBigIntStr.length() - 1);
					number = Long.parseLong(binaryBigIntStr, 2);
					number /= 2;
					if (number == 1) {
						System.out.println(winner);
						break;
					} else
						winner = flipWinner(winner);
				} else {
					// N is not power of 2
					int length = binaryBigIntStr.length();
					String stringWithZeros = "";
					for (int i = 0; i < length - 1; i++) {
						stringWithZeros += "0";
					}
					String newString = binaryBigIntStr.substring(0, 1) + stringWithZeros;
					binaryBigIntStr = newString;
					long anotherLong = Long.parseLong(newString, 2);
					if (number == 1) {
						System.out.println(winner);
						break;
					} else
						winner = flipWinner(winner);
				}
			}
		}
	}

	private static String flipWinner(String winner) {
		if(winner.equals("Richard")) return "Louise";
		else return "Richard";
	}
}
