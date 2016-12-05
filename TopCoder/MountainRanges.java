package TopCoder;

public class MountainRanges {
	public static void main(String args[]) {
		int mountainsHeightArray[] = {1,2,3,4,4,3,2,1};
		int peaksCount = 0;
		for(int i = 0; i < mountainsHeightArray.length; i++) {
			if(((i == mountainsHeightArray.length - 1) ? true : (mountainsHeightArray[i] > mountainsHeightArray[i+1])) 
					&& ((i == 0) ? true : (mountainsHeightArray[i] > mountainsHeightArray[i-1]))) {
				peaksCount++;
			}
		}
		System.out.print("Peaks visible: " + peaksCount);
	}
}