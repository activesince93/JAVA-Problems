import java.util.*;

public class StoreCredit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int i = 0; i < testCases; i++) {
			int storeCredit = sc.nextInt();
			int noOfItems = sc.nextInt();
			int itemPriceArray[] = new int[noOfItems];
			for(int j = 0; j < noOfItems; j++) {
				itemPriceArray[j] = sc.nextInt();
			}
			Outer:
			for(int j = 0; j < noOfItems - 1; j++) {
				for(int k = j + 1; k < noOfItems; k++) {
					if(itemPriceArray[j] + itemPriceArray[k] == storeCredit) {
						int small = (j < k) ? j : k;
						int large = (small == j) ? k : j;
						System.out.println("Case #" + (i + 1) + ": " + (small + 1) + " " + (large + 1));
						break Outer;
					}
				}
			}
		}
	}
}
