package TopCoder;

import java.util.Arrays;

public class LittleElephantAndDouble {
	public static void main(String args[]) {
		int inputArray[] = {7, 7, 7, 7};
		Arrays.sort(inputArray);
		String resultStr = "YES";

		Outerloop:
			for(int i = 0; i < inputArray.length; i++) {
				for(int j = i+1; j < inputArray.length; j++) {
					if(!isOK(inputArray[i], inputArray[j])) {
						resultStr = "NO";
						break Outerloop;
					}
				}
			}
		System.out.print(resultStr);
	}

	private static boolean isOK(int i, int j) {
		int value = j / i;
		int compareValue;
		for(int k = 0; k <= k+1; k++) {
			compareValue = (int) Math.pow(2, k);
			if(value == compareValue) {
				return true;
			}
			if(compareValue > value) {
				break;
			}
		}
		return false;
	}
}