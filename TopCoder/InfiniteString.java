package TopCoder;

public class InfiniteString {
	public static void main(String args[]) {
		String s = "a";
		String t = "z";
		
		for(int i = 0; i < 100 * (s.length()); i++) {
			s = s + s;
			t = t + t;
		}
		
		if(s.substring(0, 100).equals(t.substring(0, 100))) {
			System.out.print("Equal");
		} else {
			System.out.print("Not Equal");
		}
		
	}
}
