package kr.co.util.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		Calendar future = Calendar.getInstance();
		Calendar past = Calendar.getInstance();
		
		future.set(Calendar.MINUTE, now.get(Calendar.MINUTE) + 7);
		
		//int diff = (future.get(Calendar.MINUTE) - now.get(Calendar.MINUTE)) * 60;
		long diff = ((future.getTimeInMillis() - now.getTimeInMillis()) / 1000) / 60;
		System.out.println(diff);
		
		past.set(Calendar.YEAR, 2000);
		past.set(Calendar.MONTH, 10);
		past.set(Calendar.DATE, 7);
		long lived = ((now.getTimeInMillis() - past.getTimeInMillis()) / (1000*60*60*24));
		System.out.println(lived);
		System.out.println(lived / 365);
		
		Date date = now.getTime();
		System.out.println(date);
		
	}

}
