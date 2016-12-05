package TopCoder;

public class GreaterGameDiv2 {
	public static void main(String args[]) {
		int snuke[] = {3,5,9,16,14,20,15,17,13,2};
		int sothe[] = {6,18,1,8,7,10,11,19,12,4};
		
		int snukeHands = getSunkeHands(snuke, sothe);
		System.out.print("Snuke hands: " + snukeHands);
	}

	private static int getSunkeHands(int[] snuke, int[] sothe) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 0; i < snuke.length; i++) {
			if(snuke[i] > sothe[i]) {
				count += 1;
			}
		}
		return count;
	}
}
