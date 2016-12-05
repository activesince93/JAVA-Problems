import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CLockTimeToNextQuarterHour {
	public static void main(String args[]) {
		long time = System.currentTimeMillis();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date(time));
		
		int unroundedMinutes = calendar.get(Calendar.MINUTE);
		int mod = unroundedMinutes % 15;
		calendar.add(Calendar.MINUTE, mod < 5 ? -mod : (15-mod));
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		
		long returnTime = calendar.getTimeInMillis();
		String format = "hh:mm aa";
		System.out.println(getDate(returnTime + 900000, format) + "\n" + getDate(returnTime + (2 * 900000), format));
		
	}
	
	public static String getDate(long milliSeconds, String dateFormat) {
	    SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
	     Calendar calendar = Calendar.getInstance();
	     calendar.setTimeInMillis(milliSeconds);
	     return formatter.format(calendar.getTime());
	}
}
