package TopCoder;

public class TaroString {
	public static void main(String args[]) {
		String inputString = "ACBBAT";
		while(!inputString.equals("CAT") && inputString.length() >= 3) {
			for(int i = 0; i < inputString.length(); i++) {
				if(inputString.charAt(i) != 'C' && inputString.charAt(i) != 'A' && inputString.charAt(i) != 'T') {
					inputString = afterRemoving(inputString, inputString.charAt(i));
				}
			}
		}
		if(inputString.equals("CAT")) {
			System.out.print("Possible");
		} else {
			System.out.print("Impossible");
		}
			
	}

	private static String afterRemoving(String inputString, char character) {
		StringBuilder sb = new StringBuilder(inputString);
		for(int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) == character) {
				sb.replace(i, i+1, "");
			}
		}
		return sb.toString();
	}
}