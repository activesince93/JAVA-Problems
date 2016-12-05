import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emphasize {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		for(int i = 0; i <= 264; i++) {
			String str = sc.nextLine();
			System.out.println(emphasize(str));
		}
		sc.close();
	}
	
	public static String emphasize(String input) {
        Pattern p = Pattern.compile("(\">)(.*?)(</string)");
        String replacement = null;
        Matcher m  = p.matcher(input);
        while (m.find()) {
            String matchedString = m.group();
            replacement = matchedString.substring(matchedString.lastIndexOf("\">") + 2, matchedString.indexOf("</string"));
        }
        return replacement;
    }
}
