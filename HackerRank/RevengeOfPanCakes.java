import java.util.Scanner;

public class RevengeOfPanCakes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < testCases; i++) {
			String stack = sc.nextLine();
			char[] values = stack.toCharArray();
			int count = 0;
			while(!allHappy(values)) {
				int changeValue = changeAt(values);
				values = flippedValues(changeValue, values);
				count += 1;
			}
			System.out.println("Case #" + (i + 1) + ": " + count);
		}
	}
	
	static boolean allHappy(char[] values) {
		for(char value : values) 
			if(value != '+') 
				return false;
		return true;
	}
	
	static int changeAt(char[] values) {
		for(int i = 1; i < values.length; i++)
			if(values[0] != values[i])
				return i - 1;
		return values.length - 1;
	}
	
	static char[] flippedValues(int changeIndex, char[] values) {
		char changeValue = (values[0] == '+') ? '-' : '+'; 
		for(int i = 0; i <= changeIndex; i++) {
			values[i] = changeValue;
		}
		return values;
	}
}
