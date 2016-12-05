package TopCoder;

public class TaroGrid {
	public static void main(String args[]) {
		String grid[] = {"W"};
		char a = 0;
		int count = 0, prevCount = 0;
		for(int i = 0; i < grid.length; i++) {
			count = 0;
			for(int j = i; j < grid.length; j++) {
				if(j == i) {
					a = grid[j].charAt(i);
				}
				if(grid[j].charAt(i) == a) {
					count ++;
				} else {
					break;
				}
			}
			if(count > prevCount) prevCount = count;
		}
		System.out.print("Count is: " + prevCount);
	}
}
