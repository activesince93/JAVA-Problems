package TopCoder;

public class KitayutaMart2 {
	public static void main(String args[]) {
		int singleApplePrice = 160;
		int paidMoney = 163680;
		int appleCount = 0;
		while(paidMoney >= singleApplePrice) {
			paidMoney = (paidMoney - singleApplePrice) / 2;
			appleCount ++;
		}
		System.out.print("Total apples: " + appleCount);
	}
}
