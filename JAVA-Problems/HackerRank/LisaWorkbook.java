import java.util.Scanner;

public class LisaWorkbook {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int chapters = sc.nextInt();
		int maxProbs = sc.nextInt();
		int chaptersProbs[] = new int[chapters];
		for(int i = 0; i < chaptersProbs.length; i++) {
			chaptersProbs[i] = sc.nextInt();
		}
		int page = 0;
		for(int i = 0; i < chaptersProbs.length; i++) {
			if(chaptersProbs[i] % maxProbs == 0) {
				page += chaptersProbs[i] / maxProbs;
			} else {
				page += ((chaptersProbs[i] / maxProbs) + 1);
			}
		}
		
	}
}
