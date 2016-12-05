import java.util.Scanner;

public class TheLastWord {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int textCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < textCases; i++) {
			String str = sc.nextLine();
			String resultantStr = String.valueOf(str.charAt(0));
			for (int j = 1; j < str.length(); j++) {
				if (str.charAt(j) >= resultantStr.charAt(0)) {
					resultantStr =  str.charAt(j) + resultantStr;
				} else {
					resultantStr = resultantStr + str.charAt(j);
				}
			}
			System.out.println("Case #" + (i + 1) + ": " + resultantStr);
		}
	}
}
