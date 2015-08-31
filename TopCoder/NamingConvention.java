package TopCoder;


public class NamingConvention {
	public static void main(String args[]) {
		String snake_case = "the_variable_name_can_be_very_long_like_this";
		String[] list = snake_case.split("_");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < list.length; i++) {
			if(i != 0) {
				StringBuilder sbInner = new StringBuilder(list[i].trim());
				sbInner.setCharAt(0, String.valueOf(sbInner.charAt(0)).toUpperCase().charAt(0));
				sb.append(sbInner.toString());
			} else {
				sb.append(list[i].trim());
			}
		}
		System.out.print(sb.toString());
	}
}
