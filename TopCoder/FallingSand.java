package TopCoder;

public class FallingSand {
	static String nextPosition[] = null;
	public static void main(String args[]) {
		String initialPosition[] = {"..o..o..o..o..o..o..o..o..o..o..o",
				 "o..o..o..o..o..o..o..o..o..o..o..",
				 ".o..o..o..o..o..o..o..o..o..o..o.",
				 "...xxx...xxx...xxxxxxxxx...xxx...",
				 "...xxx...xxx...xxxxxxxxx...xxx...",
				 "...xxx...xxx......xxx......xxx...",
				 "...xxxxxxxxx......xxx......xxx...",
				 "...xxxxxxxxx......xxx......xxx...",
				 "...xxxxxxxxx......xxx......xxx...",
				 "...xxx...xxx......xxx............",
				 "...xxx...xxx...xxxxxxxxx...xxx...",
				 "...xxx...xxx...xxxxxxxxx...xxx...",
				 "..o..o..o..o..o..o..o..o..o..o..o",
				 "o..o..o..o..o..o..o..o..o..o..o..",
				 ".o..o..o..o..o..o..o..o..o..o..o."};
		String finalPosition[] = null;
		
		for(int i = 0; i < initialPosition.length; i++) {
			finalPosition = getNextIteration((nextPosition != null) ? nextPosition : initialPosition);
		}
		
		System.out.print("{");
		for(int i = 0; i < finalPosition.length; i++) {
			System.out.print("\"" + finalPosition[i] + "\"");
			if(i != finalPosition.length-1) {
				System.out.print(",\n");
			}
		}
		System.out.print("}");
	}

	private static String[] getNextIteration(String position[]) {
		// TODO Auto-generated method stub
		String returnPosition[] = position;
		StringBuilder rowBuilder = null, upperRowBuilder = null;
		for(int i = 1; i < position.length; i++) {
			String row = position[i];
			String upperRow = position[i-1];
			rowBuilder = new StringBuilder(row);
			upperRowBuilder = new StringBuilder(upperRow);
			for(int j = 0; j < row.length(); j++) {
				if(String.valueOf(row.charAt(j)).equals(".") && String.valueOf(upperRow.charAt(j)).equals("o")) {
					rowBuilder.setCharAt(j, 'o');
					upperRowBuilder.setCharAt(j, '.');
				}
			}
			returnPosition[i-1] = upperRowBuilder.toString();
			returnPosition[i] = rowBuilder.toString();
		}
		nextPosition = returnPosition;
		return returnPosition;
	}
}