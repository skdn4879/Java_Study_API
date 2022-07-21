package kr.co.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 {

	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());
		
		/*ca.roll(Calendar.MINUTE, 20);
		System.out.println(ca.getTime());*/
		//roll은 지정된 field만 영향
		
		ca.add(Calendar.MINUTE, 20);
		System.out.println(ca.getTime());
		
		System.out.println("========================================");
		ca = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E");
		String time = sd.format(ca.getTime());
		System.out.println(time);
		
	}

}
