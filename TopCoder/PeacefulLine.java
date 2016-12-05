package TopCoder;

import java.util.ArrayList;

public class PeacefulLine {
	static int ageArray[] = {3,3,3,3,13,13,13,13,3};
	static ArrayList<Integer> initialPositions = new ArrayList<Integer>();
	static ArrayList<Integer> finalPositions = new ArrayList<Integer>();
	static int size = ageArray.length;

	public static void main(String args[]) {
		for(int i = 0; i < ageArray.length; i++) {
			initialPositions.add(ageArray[i]);
		}

		finalPositions.add(initialPositions.get(0));
		initialPositions.remove(0);
		for(int k = 0; k <= size; k++) {
			for(int i = 0; i < initialPositions.size(); i++) {
				if(initialPositions.get(i) != finalPositions.get(finalPositions.size()-1) && finalPositions.size() < size) {
					finalPositions.add(initialPositions.get(i));
					initialPositions.remove((initialPositions.get(i) == initialPositions.get(0)) ? 0 : i);
				}
			}
		}

		if(finalPositions.size() == size) {
			System.out.print("Possible");
		} else {
			System.out.print("Impossible");
		}
	}
}
