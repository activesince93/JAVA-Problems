package TopCoder;

public class SumOfPower {
	public static void main(String args[]) {
		int elements[] = {3,14,15,92,65};
		int total = 0;
		for(int i = 0; i < elements.length; i++) {
			for(int j = i; j < elements.length; j++) {
				for(int k = i; k <= j; k++) {
					total += elements[k];
				}
			}
		}
		System.out.print(total);
	}
}