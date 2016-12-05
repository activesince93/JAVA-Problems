package TopCoder;

public class CountryGroup {
	public static void main(String args[]) {
		int peopleAnswers[] = {2,2,3,3,3};
		int nextPos = 0;
		int count = 0;
		boolean isError = false;
		for(int i = 0; i < peopleAnswers.length; i += nextPos) {
			for(int j = 0; j < peopleAnswers[i]; j++) {
				nextPos = j+1;
				if(peopleAnswers[i] > peopleAnswers.length || peopleAnswers[i] != peopleAnswers[i+j]) {
					isError = true;
					break;
				}
			}
			if(isError) {
				count = -1;
				break;
			} else {
				count ++;
			}
		}
		System.out.print("Count is: " + count);
	}
}