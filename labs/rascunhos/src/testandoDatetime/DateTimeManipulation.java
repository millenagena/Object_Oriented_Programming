package testandoDatetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeManipulation {
	public static void main(String[] args) {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println("Current Date Time : " + dateFormat.format(cal.getTime()));
		cal.add(Calendar.DATE, -1);
		System.out.println("Subtract one day from current date : " + dateFormat.format(cal.getTime()));
	}
}
