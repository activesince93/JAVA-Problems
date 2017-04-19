package TopCoder;

public class CorruptedMessage {
	public static void main(String args[]) {
		String receivedMessage = "hello";
		int lettersChanged = 3;
		int prevCount = 0;
		char macRepeated = 0;
		int occurancesNeeded = receivedMessage.length() - lettersChanged;
		int count = 0;
		for(int i = 0; i < receivedMessage.length(); i++) {
			count = 0;
			for(int j = 0; j < receivedMessage.length(); j++) {
				if(receivedMessage.charAt(i) == receivedMessage.charAt(j)) {
					count ++;
				}
			}
			if(count == occurancesNeeded) {
				prevCount = count;
				macRepeated = receivedMessage.charAt(i);
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder(receivedMessage);
		for(int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) != macRepeated) {
				sb.setCharAt(i, macRepeated);
			}
		}
		System.out.print("\nOriginal message is: " + sb.toString());
	}
}