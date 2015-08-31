package HackerRank;

import java.util.Scanner;

public class TaumAndBday {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long testCaese = sc.nextInt();
		for(long i = 0; i < testCaese; i++) {
			long giftBlack = sc.nextInt();
			long giftWhite = sc.nextInt();
			long costBlack = sc.nextInt();
			long costWhite = sc.nextInt();
			long costChange = sc.nextInt();
			long totalCost = 0;
			if(costBlack < costWhite) {
				totalCost += (costBlack * giftBlack);
				if((costBlack + costChange) < costWhite) {
					totalCost += ((costBlack + costChange) * giftWhite);
				} else {
					totalCost += (costWhite * giftWhite);
				}
			} else {
				totalCost += (costWhite * giftWhite);
				if((costWhite + costChange) < costBlack) {
					totalCost += ((costWhite + costChange) * giftBlack);
				} else {
					totalCost += (costBlack * giftBlack);
				}
			}
			System.out.print(totalCost + "\n");
		}
	}
}
