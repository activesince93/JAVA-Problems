import java.math.BigInteger;
import java.util.Scanner;

public class ComplexGCD {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		BigInteger numA = new BigInteger(input.split(" ")[0].trim());
		BigInteger numB = new BigInteger(input.split(" ")[1].trim());
		
		System.out.print(gcd(numA, numB) + "");
		sc.close();
	}

	private static BigInteger gcd(BigInteger a, BigInteger b) {
		if(b.equals(new BigInteger("0"))) return a;
		return gcd(b, a.mod(b));
	}
}
