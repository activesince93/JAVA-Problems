package TopCoder;

public class GameOfStones {
	public static void main(String args[]) {
		int pilesArray[] = {10, 15, 20, 12, 1, 20};
		int total = 0;
		int diffTotal = 0;
		
		for(int i = 0; i < pilesArray.length; i++) {
			total += pilesArray[i];
		}
		
		if(total % pilesArray.length == 0) {
			int mid = total / pilesArray.length;
			int[] diffWithLevel = getDifferenceArray(pilesArray, mid);
			
			for(int i = 0; i < diffWithLevel.length; i++) {
				if(diffWithLevel[i] % 2 != 0) {
					System.out.print("Return: " + -1);
					break;
				} else {
					if(diffWithLevel[i] < 0) {
						diffWithLevel[i] = Math.abs(diffWithLevel[i]);
					}
					diffTotal += diffWithLevel[i];
				}
			}
			
			if(diffTotal != 0 && diffTotal % diffWithLevel.length == 0) {
				System.out.print("Return: " + diffTotal / diffWithLevel.length);
			}
		} else {
			System.out.print("Return: " + -1);
		}
	}

	private static int[] getDifferenceArray(int[] pilesArray, int mid) {
		// TODO Auto-generated method stub
		int differenceArray[] = new int[pilesArray.length];
		for(int i = 0; i < pilesArray.length; i++) {
			differenceArray[i] = pilesArray[i] - mid;
		}
		return differenceArray;
	}
}
