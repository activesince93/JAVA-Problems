import java.util.Scanner;

public class LonelyInteger {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int arrayInt[] = new int[101];
		
		for(int i = 0; i < length; i++) {
			++arrayInt[sc.nextInt()];
		}
		
		for(int i = 0; i < arrayInt.length; i++) {
			if(arrayInt[i] == 1) {
				System.out.println(String.valueOf(i));
				break;
			}
		}
	}
}
