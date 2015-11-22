package HackerRank;

public class ConsoleBasedProgress {
	public static void main(String args[]) throws InterruptedException {
		for(int i = 0; i <= 100; i++) {
			updateProgress(i);
			Thread.sleep(100);
		}
	}
	
	static void updateProgress(int intNum) {
		System.out.print("\r[");
		System.out.print("" + intNum);
		System.out.print("%]");
	}
}
