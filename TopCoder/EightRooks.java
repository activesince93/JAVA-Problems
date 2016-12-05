package TopCoder;

import java.util.ArrayList;

public class EightRooks {
	
	static String position[] = {"......R.",
		 "....R...",
		 "...R....",
		 ".R......",
		 "R.......",
		 ".....R..",
		 "..R.....",
		 ".......R"};
	static ArrayList<Integer> positionInEachRow = new ArrayList<Integer>();
	
	public static void main(String args[]) {
		for(int i = 0; i < position.length; i++) {
			for(int j = 0; j < position[i].length(); j++) {
				if(position[i].charAt(j) == 'R') {
					positionInEachRow.add(j);
				}
			}
		}
		if(positionInEachRow.size() == 8) {
			if(isEachUnique(positionInEachRow)) {
				System.out.print("Correct");
			} else {
				System.out.print("Incorrect");
			}
		} else {
			System.out.print("Incorrect");
		}
	}

	private static boolean isEachUnique(ArrayList<Integer> positionInEachRow2) {
		// TODO Auto-generated method stub
		for(int i = 0; i < positionInEachRow2.size(); i++) {
			for(int j = 0; j < positionInEachRow2.size(); j++) {
				if(i != j) {
					if(positionInEachRow2.get(i) == positionInEachRow2.get(j)) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
