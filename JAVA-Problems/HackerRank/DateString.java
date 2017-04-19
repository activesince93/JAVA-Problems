
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DateString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		System.out.println(getFormattedDate(number));
	}

	private static String getFormattedDate(long number) {
		Calendar smsTime = Calendar.getInstance();
		smsTime.setTimeInMillis(number);
		Calendar now = Calendar.getInstance();

		final String timeFormatString = "hh:mm aa";
		final String dateTimeFormatString = "dd/MM/yyyy, hh:mm aa";
		if (now.get(Calendar.DATE) == smsTime.get(Calendar.DATE)) {
			DateFormat dateFormat = new SimpleDateFormat(timeFormatString);
			return dateFormat.format(smsTime.getTime());
		} else if (now.get(Calendar.DATE) - smsTime.get(Calendar.DATE) == 1) {
			return "YESTERDAY";
		} else {
			DateFormat dateFormat = new SimpleDateFormat(dateTimeFormatString);
			return dateFormat.format(smsTime.getTime()).toString();
		}
	}
}