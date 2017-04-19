package TopCoder;

public class DecipherabilityEasy {
	public static void main(String args[]) {
		String originalString = "singleroundmatch"; 
		String eatenString = "singeroundmatc";
		boolean isPossible = true;
		int count = 0;
		
		try {
			for(int i = 0; i < originalString.length(); i++) {
				if(originalString.charAt(i) != eatenString.charAt(i-count)) {
					count++;
				}
			}
		} catch (Exception e) {
			isPossible = false;
		}
		if(isPossible && count == 1) {
			System.out.print("Possible");
		} else {
			System.out.print("Impossible");
		}
	}
}