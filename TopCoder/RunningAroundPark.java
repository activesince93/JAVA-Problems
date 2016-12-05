package TopCoder;

public class RunningAroundPark {
	public static void main(String args[]) {
		int remindArray[] = {1,2};
		int count = 1;
		
		for(int i = 0; i < remindArray.length - 1; i++) {
			if(remindArray[i] >= remindArray[i + 1]) {
				count ++;
			}
		}
		System.out.print("Count is: " + count);
	}
}
