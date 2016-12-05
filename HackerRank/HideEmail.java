import java.util.Scanner;

public class HideEmail {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String officialEmail = sc.nextLine();
        String str = officialEmail.substring(officialEmail.indexOf("@"));
        String emailName = officialEmail.substring(0, officialEmail.indexOf("@"));
        emailName = emailName.replaceAll(".", "x");
        String email = emailName + str;
        System.out.print(email); 
	}
}
