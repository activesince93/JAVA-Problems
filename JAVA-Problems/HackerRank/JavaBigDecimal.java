package HackerRank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaBigDecimal {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int numbers = Integer.parseInt(sc.nextLine());
		ArrayList<BigDecimal> arrayList = new ArrayList<BigDecimal>();
		for(int i = 0; i < numbers; i++) {
			String str = sc.nextLine();
			arrayList.add(new BigDecimal(str));
		}
		Collections.sort(arrayList);
		Collections.reverse(arrayList);
		for(int i = 0; i < arrayList.size(); i++) {
			String str = arrayList.get(i).toPlainString();
			if(str.startsWith("0."))
				str = str.substring(1);
			System.out.print(str + "\n");
		}
	}
}
