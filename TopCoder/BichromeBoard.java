package TopCoder;

public class BichromeBoard {
	
	static String board[] = {"WBW", "BWB", "WBW"};
	static String boardArray[][] = new String[board.length][board[0].length()];
	
	public static void main(String args[]) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length(); j++) {
				boardArray[i][j] = String.valueOf(board[i].charAt(j));
			}
		}
		
		if(!isPossible()) {
			System.out.print("Possible");
		} else {
			System.out.print("Impossible");
		}
	}

	private static boolean isPossible() {
		for(int i = 0; i < boardArray.length; i++) {
			for(int j = 0; j < boardArray[i].length; j++) {
				if(!boardArray[i][j].equals(boardArray[i][(j > 0) ? j-1 : j]) 
						&& boardArray[i][j].equals(boardArray[(i > 0) ? i-1 : i][j]) 
						&& boardArray[i][j].equals(boardArray[i][(j < boardArray[i].length - 1) ? j+1 : j]) 
						&& boardArray[i][j].equals(boardArray[(i < boardArray.length - 1) ? i+1 : i][j])) {
					return true;
				}
			}
		}
		return false;
	}
}
