package TopCoder;

public class DoubleLetter {
	public static void main(String args[]) {
		String inputString = "zzxzxxzxxzzx";
		String result = getResult(inputString);
		System.out.print(result);
	}

	private static String getResult(String inputString) {
		String returnValue;
		try {
			boolean isPossible = true;
			returnValue = "";
			if(inputString.length() % 2 != 0) {
				returnValue = "Impossible";
			}
			StringBuilder sb = new StringBuilder(inputString);
			while(isPossible && sb.length() > 1) {
				for(int i = 0; i < sb.length(); i++) {
					if(sb.charAt(i) == sb.charAt(i + 1)) {
						sb.delete(i, i+2);
						break;
					}
				}
			}
			if(sb.toString().length() == 0) {
				returnValue = "Possible";
			}
		} catch (Exception e) {
			returnValue = "Impossible";
		}
		return returnValue;
	}
}
