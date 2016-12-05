package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BalancedContestOrNot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int beauty[] = new int[5];
		int difficulty[] = new int[5];
		ArrayList<NameValue> nameValue = new ArrayList<NameValue>();
		for(int i = 0; i < 5; i++) {
			beauty[i] = sc.nextInt();
			difficulty[i] = sc.nextInt();
			nameValue.add(new NameValue(beauty[i], difficulty[i]));
		}
		Collections.sort(nameValue, new ChairWeightComparator());
		boolean value = true;
		for(int i = 0; i < nameValue.size() -1; i++) {
			if(nameValue.get(i).getName() > nameValue.get(i+1).getName() || nameValue.get(i).getValue() > nameValue.get(i+1).getValue()) {
				value = false;
				break;
			}
		}
		if(value) System.out.print("1");
		else System.out.print("0");
	}
	
	static class ChairWeightComparator implements Comparator<NameValue> {
	    @Override
		public int compare(NameValue chair1, NameValue chair2) {
	        return chair1.getName() - chair2.getName();
	    }
	}
	
	static class NameValue {
		int name;
		int value;
		public NameValue(int name, int value) {
			this.name = name;
			this.value = value;
		}
		public int getName() {
			return name;
		}
		public int getValue() {
			return value;
		}
		public void setName(int name) {
			this.name = name;
		}
		public void setValue(int value) {
			this.value = value;
		}
	}
}
