package TopCoder;

import java.util.ArrayList;


public class ManySquares {
	public static void main(String args[]) {
		int sticksArray[] = {2,2,4,4,8,8};
		System.out.print("Squares: " + howManySquares(sticksArray));
	}

	private static int howManySquares(int[] sticksArray) {
		ArrayList<Integer> unique = new ArrayList<Integer>();
		for(int i = 0; i < sticksArray.length; i++){
            boolean isDistinct = false;
            for(int j = 0; j < i; j++){
                if(sticksArray[i] == sticksArray[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
            	unique.add(sticksArray[i]);
            }
        }
		int squareCount = 0;
		for(int i = 0; i < unique.size(); i++) {
			int count = 0;
			for(int j = 0; j < sticksArray.length; j++) {
				if(unique.get(i) == sticksArray[j]) {
					count++;
				}
			}
			squareCount += count / 4;
		}
		return squareCount;
	}
}