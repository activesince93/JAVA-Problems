package HackerRank;

import java.util.Scanner;

public class SongOfPi {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final String PI_STRING = "31415926535897932384626433833";
		String songString = "";
		String songList[];
		int testcases = Integer.parseInt(sc.nextLine());
		for(int i = 0; i <= testcases; i++) {
			String newString = "";
			songString = sc.nextLine();
			songList = songString.split(" ");
			
			for(int j = 0; j < songList.length; j++) {
				newString = newString + songList[j].length();
			}
			if(PI_STRING.contains(newString) && newString.contains("3")) {
				System.out.print("It's a pi song.\n");
			} else {
				System.out.print("It's not a pi song.\n");
			}
 		}
	}
}