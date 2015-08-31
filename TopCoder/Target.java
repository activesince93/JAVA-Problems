package TopCoder;


public class Target {
	public static void main(String args[]) {
		int targetSize = 49;
		int startingPoint = 0;
		String matrix[][] = new String[targetSize][targetSize];
		
		while(targetSize > 1) {
			addDataToMatrix(matrix, targetSize, startingPoint);
			targetSize -= 2;
			startingPoint += 2;
		}
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.print("\n");
		}
	}

	private static void addDataToMatrix(String matrix[][], int targetSize, int startingPoint) {
		// TODO Auto-generated method stub
		for(int i = startingPoint; i < targetSize; i++) {
			for(int j = startingPoint; j < targetSize; j++) {
				if(i == startingPoint || j == startingPoint || i == targetSize-1 || j == targetSize-1) {
					matrix[i][j] = "#";
				} else {
					matrix[i][j] = " ";
				}
			}
		}
	}
}
