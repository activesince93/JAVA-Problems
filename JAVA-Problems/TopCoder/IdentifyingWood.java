package TopCoder;

public class IdentifyingWood {
	public static void main(String args[]) {
		String s = "string";
		String t = "longstring";
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < t.length(); i++) {
			for(int j = 0; j < s.length(); j++) {
				if(t.charAt(i) == s.charAt(j)) {
					s = s.substring(j+1);
					sb.append(t.charAt(i));
				}
			}
		}
		
		if(sb.toString().length() == t.length()) {
			System.out.print("Yep, it's wood.");
		} else {
			System.out.print("Nope.");
		}
	}
}
