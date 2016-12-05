package TopCoder;

public class InterestingNumber {
	public static void main(String args[]) {
		String inputString = "611";
		boolean isInteresting = true;
		for(int i = 0; i < inputString.length(); i++) {
			if((i + Character.getNumericValue(inputString.charAt(i)) + 1) > inputString.length() - 1) {
				if(inputString.charAt(i) != inputString.charAt(i - Character.getNumericValue(inputString.charAt(i)) - 1)) {
					isInteresting = false;
				}
			}
			if((i - Character.getNumericValue(inputString.charAt(i)) - 1) < 0) {
				if(inputString.charAt(i) != inputString.charAt(i + Character.getNumericValue(inputString.charAt(i)) + 1)) {
					isInteresting = false;
				}
			}
			if((i + Character.getNumericValue(inputString.charAt(i)) + 1) <= inputString.length() - 1
					&& (i - Character.getNumericValue(inputString.charAt(i)) - 1) >= 0) {
				if(inputString.charAt(i) != inputString.charAt(i - Character.getNumericValue(inputString.charAt(i)) - 1)
						&& inputString.charAt(i) != inputString.charAt(i + Character.getNumericValue(inputString.charAt(i)) + 1)) {
					isInteresting = false;
				}
			}
		}
		if(isInteresting)
			System.out.print("Interesting");
		else 
			System.out.print("Not Interesting");
	}
}
