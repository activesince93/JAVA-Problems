import java.util.Scanner;

public class CoinJam {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; i++) {
			int binaryLength = sc.nextInt();
			int neededSolutions = sc.nextInt();
			int solutions = 0;
			System.out.println("Case #1:");
			for (int j = 32769; j <= 65535; j++) {
				if (solutions == neededSolutions) {
					break;
				}
				String s = Integer.toBinaryString(j);
				if (s.endsWith("1")) {
					long baseValues[] = new long[9];
					for (int k = 0; k < 9; k++) {
						baseValues[k] = ((k + 2) != 10) ? getValuesKthBase(k + 2, s) : Long.parseLong(s);
						if (isPrime(baseValues[k])) {
							break;
						}
					}
					if (nonZeroArray(baseValues)) {
						printValues(s, baseValues);
						solutions += 1;
					}
				}
			}
		}
	}

	static synchronized long getValuesKthBase(int baseValue, String s) {
		long returnBaseValue = 0;
		int length = s.length();
		for (int i = length - 1; i >= 0; i--) {
			if (s.charAt(i) == '1')
				returnBaseValue += Math.pow(baseValue, length - i - 1);
		}
		return returnBaseValue;
	}

	static synchronized boolean isPrime(long number) {
		int sqrt = (int) (Math.sqrt(number) + 1);
		for (int i = 2; i <= sqrt; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	static synchronized boolean nonZeroArray(long baseValues[]) {
		for (long value : baseValues)
			if (value == 0 || isPrime(value))
				return false;
		return true;
	}

	static synchronized void printValues(String s, long baseValues[]) {
		System.out.print(s + " ");
		String valueStr = "";
		for (int i = 0; i < baseValues.length; i++) {
			valueStr += getNonTrivialDivider(baseValues[i]) + " ";
		}
		System.out.print(valueStr.trim() + "\n");
	}

	static synchronized int getNonTrivialDivider(long value) {
		int sqrt = (int) (Math.sqrt(value) + 1);
		for (int i = 2; i <= sqrt; i++)
			if (value % i == 0)
				return i;
		return 0;
	}
}
