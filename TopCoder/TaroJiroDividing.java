package TopCoder;

import java.util.ArrayList;

public class TaroJiroDividing {
	public static void main(String args[]) {
		int X = 1000000000;
		int Y = 999999999;
		int result = 0;
		ArrayList<Integer> listX = new ArrayList<Integer>();
		ArrayList<Integer> listY = new ArrayList<Integer>();

		listX.add(X);
		listY.add(Y);
		
		while(X % 2 == 0) {
			X = X/2;
			listX.add(X);
		}
		
		while(Y % 2 == 0) {
			Y = Y/2;
			listY.add(Y);
		}
		
		for(int i = 0; i < listX.size(); i++) {
			for(int j = 0; j < listY.size(); j++) {
				if(listX.get(i) == listY.get(j)) {
					result ++;
				}
			}
		}
		System.out.print("Result is: " + result);
	}
}
