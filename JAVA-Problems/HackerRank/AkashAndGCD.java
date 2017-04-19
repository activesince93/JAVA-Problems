import java.util.Scanner;

public class AkashAndGCD {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int values[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			values[i] = sc.nextInt();
		}

		int noOfInputs = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < noOfInputs; i++) {
			String str = sc.nextLine();
			char C = str.split(" ")[0].charAt(0);
			int X = Integer.parseInt(str.split(" ")[1]);
			int Y = Integer.parseInt(str.split(" ")[2]);
			int answer = 0;
			if (C == 'C') {
				for (int j = X; j <= Y; j++) {
					answer += functionCalc(values[j - 1]);
				}
				System.out.println(answer + "");
			} else {
				values[X - 1] = Y;
			}
		}
	}

	static int functionCalc(int num) {
		int returnNum = 0;
		for (int i = 1; i <= num; i++) {
			returnNum += gcd(i, num);
		}
		return returnNum;
	}

	static int gcd(int number1, int number2) {
		if (number2 == 0) {
			return number1;
		}
		return gcd(number2, number1 % number2);
	}
}
