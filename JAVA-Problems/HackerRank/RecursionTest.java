
public class RecursionTest {
	
	static String value = "";
	static int num = 0;
	
	public static void main(String args[]) {
		String value = getValue(3);
		System.out.println(value);
	}

	private static String getValue(int i) {
		// TODO Auto-generated method stub
		if(num == i) {
			value = "Print";
		} else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			++num;
			getValue(i);
		}
		return value;
	}
}
