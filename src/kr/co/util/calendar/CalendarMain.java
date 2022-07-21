package kr.co.util.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		//GregorianCalendar가 Calendar를 상속받아 구현하였으므로 아래와 같은 선언이 가능하다. 다형성
		//Calendar ca = new GregorianCalendar();
		Calendar ca = Calendar.getInstance();
		System.out.println(ca);
		
		int y = ca.get(Calendar.YEAR);
		System.out.println(y);
		
		int m = ca.get(Calendar.MONTH);
		System.out.println(m + 1);
		
		int d = ca.get(Calendar.DAY_OF_MONTH);
		System.out.println(d);
		
		int h = ca.get(Calendar.HOUR);	//12시간표기법
		System.out.println(h);
		System.out.println(ca.get(Calendar.HOUR_OF_DAY));	//24시표기법
		
		int mi = ca.get(Calendar.MINUTE);
		System.out.println(mi);
		
		int sec = ca.get(Calendar.SECOND);
		System.out.println(sec);
		
		long milis = ca.getTimeInMillis();
		System.out.println(milis);
		
		ca.set(Calendar.YEAR, 2002);
		ca.set(Calendar.MONTH, 11);
		ca.set(Calendar.DATE, 25);
		
		y = ca.get(Calendar.YEAR);
		m = ca.get(Calendar.MONTH);
		d = ca.get(Calendar.DATE);
		System.out.println(y);
		System.out.println(m);
		System.out.println(d);
		
	}

}
