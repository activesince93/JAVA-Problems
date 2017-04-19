package HackerRank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String inputDate = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ssa");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		Date date;
		try {
			date = sdf.parse(inputDate);
			System.out.print(sdf2.format(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}