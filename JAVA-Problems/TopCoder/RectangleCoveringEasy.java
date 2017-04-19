package TopCoder;

import java.util.Scanner;

public class RectangleCoveringEasy {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int holeW = scanner.nextInt();
		int holeH = scanner.nextInt();
		int boardW = scanner.nextInt();
		int boardH = scanner.nextInt();
		
		int returnValue = getResult(holeW, holeH, boardW, boardH);
		System.out.print("" + returnValue);
	}

	private static int getResult(int holeW, int holeH, int boardW, int boardH) {
		if((boardH * boardW) <= (holeH * holeW)) {
			return -1;
		}
		if(boardW >= holeW && boardH >= holeH) {
			return 1;
		} else {
			if(boardH >= holeW && boardW >= holeH) {
				return 1;
			} else {
				return -1;
			}
		}
	}
}
