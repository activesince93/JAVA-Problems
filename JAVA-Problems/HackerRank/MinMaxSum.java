import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[5];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		
		int minTotal = 0, maxTotal = 0;
		for(int i = 0; i < nums.length - 1; i++) {
			minTotal += nums[i];
		}
		for(int i = 1; i < nums.length; i++) {
			maxTotal += nums[i];
		}
		System.out.println(minTotal + " " + maxTotal);
	}
}
