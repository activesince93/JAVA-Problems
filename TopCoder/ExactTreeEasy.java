package TopCoder;

public class ExactTreeEasy {
	public static void main(String args[]) {
		int non_leaves = 10;
		int leaves = 9;
		int i = 0, getI = 0;
		int fixedLeaves = leaves;
		System.out.print("{");
		while(leaves > 0 && i < non_leaves-1) {
			if(i == 0) {
				System.out.print(i + "," + (i+1) + ",");
				leaves --;
			} else if(i <= non_leaves-fixedLeaves) {
				System.out.print(i + "," + (i+1) + ",");
				getI = i;
			} else {
				System.out.print(getI + "," + (i+1) + ",");
				leaves--;
			}
			i++;
		}
		System.out.print("}");
	}
}
