package TopCoder;

public class BacteriesColony {
	public static void main(String args[]) {
		int colonies[] = {5, 3, 4, 6, 1};
		int newColonies[] = new int[colonies.length];

		int max = returnMaxNumber(colonies);
		
		for(int i = 0; i < colonies.length; i++) {
			newColonies[i] = colonies[i];
		}
		
		for(int j = 0; j < max; j++) {
			for(int i = 1; i < colonies.length - 1; i++) {
				if(colonies[i] > colonies[i-1] && colonies[i] > colonies[i+1]) {
					newColonies[i] = colonies[i] - 1;
				}
				if(colonies[i] < colonies[i-1] && colonies[i] < colonies[i+1]) {
					newColonies[i] = colonies[i] + 1;
				}
			}
			
			for(int i = 0; i < newColonies.length; i++) {
				colonies[i] = newColonies[i];
			}
		}

		System.out.print("{");
		for(int i = 0; i < colonies.length; i++) {
			System.out.print(colonies[i]);
			if(i != colonies.length - 1)
				System.out.print(",");
		}
		System.out.print("}");
	}

	private static int returnMaxNumber(int[] colonies) {
		// TODO Auto-generated method stub
		int max = 0;
		for(int i = 0; i < colonies.length; i++) {
			if(colonies[i] > max) {
				max = colonies[i];
			}
		}
		return max;
	}
}
