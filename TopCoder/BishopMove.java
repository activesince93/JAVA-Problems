package TopCoder;

import java.util.Scanner;

public class BishopMove {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int startI = sc.nextInt();
		int startJ = sc.nextInt();
		int endI = sc.nextInt();
		int endJ = sc.nextInt();
		
		int result = getResult(startI, startJ, endI, endJ);
		System.out.print(result);
	}

	private static int getResult(int startI, int startJ, int endI, int endJ) {
		// TODO Auto-generated method stub
		if(startI == endI && startJ == endJ) {
			return 0;
		}
		if(((startI + startJ) % 2 == 0) && ((endI + endJ) % 2 == 0)) {
			if((Math.abs(startI - endI) == Math.abs(startJ - endJ))) {
				return 1;
			} else {
				return 2;
			}
		} else if(((startI + startJ) % 2 != 0) && ((endI + endJ) % 2 != 0)) {
			if((Math.abs(startI - endI) == Math.abs(startJ - endJ))) {
				return 1;
			} else {
				return 2;
			}
		} else {
			return -1;
		}
	}
}