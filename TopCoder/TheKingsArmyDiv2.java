package TopCoder;

public class TheKingsArmyDiv2 {
	public static void main(String args[]) {
		String army[] = {"SSS",
				 "SSS",
				 "SSS"};
		boolean boolAwards = false;
		String armyMatrix[][] = new String[army.length][army[0].length()];
		
		for(int i = 0; i < army.length; i++) {
			for(int j = 0; j < army[i].length(); j++) {
				armyMatrix[i][j] = String.valueOf(army[i].charAt(j));
			}
		}
		
		boolean possible = getResult(army, armyMatrix);
		
		for(int i = 0; i < army.length; i++) {
			for(int j = 0; j < army[i].length(); j++) {
				if(armyMatrix[i][j].equals("H") && !possible) {
					boolAwards = true;
					break;
				}
			}
			if(boolAwards) {
				break;
			}
		}
		
		if(boolAwards) 
			System.out.print("Awards: " + 1);
		else 
			System.out.print("Awards: " + 2);
		
	}

	private static boolean getResult(String[] army, String[][] armyMatrix) {
		// TODO Auto-generated method stub
		boolean possible = false;
		String result = "";
		
		for(int i = 0; i < army.length; i++) {
			for(int j = 0; j < army[i].length(); j++) {
				if(armyMatrix[i][j].equals("H")) {
					if(((i < army.length - 1) ? (armyMatrix[i][j].equals(armyMatrix[i+1][j])) : false)
							|| ((i > 0) ? (armyMatrix[i][j].equals(armyMatrix[i-1][j])) : false)
							|| ((j < army[i].length() - 1) ? (armyMatrix[i][j].equals(armyMatrix[i][j+1])) : false)
							|| ((j > 0) ? (armyMatrix[i][j].equals(armyMatrix[i][j-1])) : false)) {
						possible = true;
						break;
					}
				}
			}
			if(possible)
				break;
		}
		
		return possible;
	}
}