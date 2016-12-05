package TopCoder;

public class ABBA {
	public static void main(String args[]) {
		String inputString = "A";
		String outputString = "BB";
		
		while(outputString.length() > inputString.length()) {
			if(outputString.charAt(outputString.length()-1) == 'B') {
				outputString = new StringBuilder(outputString.substring(0, outputString.length()-1)).reverse().toString();
			} else {
				outputString = outputString.substring(0, outputString.length()-1);
			}
		}
		if(inputString.equals(outputString)) {
			System.out.print("Possible");
		} else {
			System.out.print("Impossible");
		}
	}
}