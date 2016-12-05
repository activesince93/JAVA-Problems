import java.util.Scanner;

class Test {
	public static void main(String args[]) {
		
		TempObj tempObj = new TempObj();
		tempObj.name = "Darshan";
		tempObj.num = "9033452134";
		
		TempObj newTempObj = new TempObj();
		try {
			newTempObj = tempObj.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		newTempObj.name = "Chintan";
		
		System.out.println(tempObj.name + " " + tempObj.num + "\n" + newTempObj.name + " " + tempObj.num);
		
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		System.out.println(userNameCamelCase(str));
	}
	
	private static String userNameCamelCase(String name) {
        String editedName = "";
        String[] nameArray = name.trim().split(" ");
        for(String nameStr : nameArray) {
//            String nameStr = nameStrValue.trim();
            if(nameStr.length() > 1) {
                editedName += (nameStr.substring(0, 1).toUpperCase() + nameStr.substring(1).toLowerCase() + " ");
            } else if(nameStr.length() == 1) {
                editedName += nameStr.toUpperCase() + " ";
            }
        }
        return editedName.trim();
    }
	
	public static class TempObj implements Cloneable {
		String name;
		String num;
		
		public TempObj() {}
		
		public TempObj clone() throws CloneNotSupportedException {
			return (TempObj) super.clone();
		}
	}
}