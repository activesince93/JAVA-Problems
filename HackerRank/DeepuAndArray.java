import java.util.Scanner;

public class DeepuAndArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int elements[] = new int[arraySize];
		for(int i = 0; i < arraySize; i++) {
			elements[i] = sc.nextInt();
		}
		
		int queriesSize = sc.nextInt();
		for(int i = 0; i < queriesSize; i++) {
			int num = sc.nextInt();
			for(int j = 0; j < arraySize; j++)
				if(elements[j] > num)
					elements[j] -= 1;
		}
		
		String str = "";
		for(int i = 0; i < arraySize; i++) {
			str += (elements[i] + " ");
		}
		System.out.print(str.trim());
		sc.close();
	}
}
