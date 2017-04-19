package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheLoveLetterMystery {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int testCases = Integer.parseInt(br.readLine());
			for(int i = 0; i < testCases; i++) {
				String str = br.readLine();
				char C[] = str.toCharArray();
				int L = C.length;
				long count = 0;
				for(int j = 0, k = L-1; j < k; ++j, --k) {
					if(C[j] != C[k]) {
						int temp = Math.abs(C[j] - C[k]);
						count += temp;
					}
				}
				System.out.print(count + "\n");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}