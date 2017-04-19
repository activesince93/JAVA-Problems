package TopCoder;

public class ForgetfulAddition {
	public static void main(String args[]) {
		int receivedMessage = 98765;
		int smallestNum = receivedMessage;
		for(int i = 10; i < receivedMessage; i *= 10) {
			int a = receivedMessage % i;
			int b = receivedMessage / i;
			int num = a + b;
			
			if(num < smallestNum) {
				smallestNum = num;
			}
		}
		System.out.print("Number is: " + smallestNum);
	}
}