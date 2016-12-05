import java.util.Scanner;

public class ReverseWords {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < testCases; i++) {
			String words[] = sc.nextLine().split(" ");
			for(int j = 0; j < words.length/2; j++) {
				words[j] = words[j] + words[words.length - j - 1];
				words[words.length - j - 1] = words[j].substring(0, words[j].length() - words[words.length - j - 1].length());
				words[j] = words[j].substring(words[words.length - j - 1].length());
			}
			String str = "";
			for(String word : words) {
				str += (word + " ");
			}
			System.out.println("Case #" + (i + 1) + ": " + str.trim());
		}
	}
}