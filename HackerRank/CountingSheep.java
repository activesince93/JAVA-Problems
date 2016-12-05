import java.util.Scanner;

public class CountingSheep {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; i++) {
			int N = sc.nextInt();
			int num = N;
			int j = 1;
			boolean allCovered[] = new boolean[10];
			allCovered = fillArray(N, allCovered);
			if (N != 0) {
				while (!checkAllCovered(allCovered) || num > Integer.MAX_VALUE) {
					num = (j + 1) * N;
					allCovered = fillArray(num, allCovered);
					j += 1;
				}
				if(num > Integer.MAX_VALUE) 
					System.out.println("Case #" + (i + 1) + ": INSOMNIA");
				else 
					System.out.println("Case #" + (i + 1) + ": " + num);
			} else {
				System.out.println("Case #" + (i + 1) + ": INSOMNIA");
			}
		}
	}
	
	private static boolean[] fillArray(int n, boolean allCovered[]) {
		String numStr = String.valueOf(n);
		for(int i = 0; i < numStr.length(); i++) {
			allCovered[Character.getNumericValue(numStr.charAt(i))] = true;
		}
		return allCovered;
	}

	static boolean checkAllCovered(boolean allCovered[]) {
		for(boolean value : allCovered) 
			if(!value) 
				return false;
		return true;
	}
}
