package TopCoder;

import java.util.ArrayList;

public class CatchTheBeatEasy {
	public static void main(String args[]) {
		int givenTime[] = {0,0,0,0};
		int givenPos[] = {0,0,0,0};
		int currTime = 0;
		int currPos = 0;
		int minTimePos = 0;
		boolean isPossible = true;;
		ArrayList<Integer> time = new ArrayList<Integer>();
		ArrayList<Integer> position = new ArrayList<Integer>();
		
		for(int i = 0; i < givenPos.length; i++) {
			position.add(givenPos[i]);
			time.add(givenTime[i]);
		}
		
		while(time.size() > 0) {
			int minTime = Integer.MAX_VALUE;
			for(int i = 0; i < time.size(); i++) {
				if(time.get(i) < minTime) {
					minTime = time.get(i);
					minTimePos = position.get(i);
				}
			}
			
			if((minTime - currTime) >= Math.abs(minTimePos - currPos)) {
				int num = time.indexOf(minTime);
				time.remove(num);
				position.remove(num);
				currPos = minTimePos;
				currTime = minTime;
			} else {
				isPossible = false;
				break;
			}
		}
		if(isPossible) {
			System.out.print("Able to catch");
		} else {
			System.out.print("Not able to catch");
		}
	}
}