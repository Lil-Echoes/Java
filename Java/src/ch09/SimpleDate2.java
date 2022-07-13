package ch09;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class SimpleDate2 {
	
	public static void main(String[] args) {
		
		GregorianCalendar gc = new GregorianCalendar(2013, 2, 5, 12, 25, 30);
		Date date = gc.getTime();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("(E) yyyy/MM/dd (a)HH:mm:ss");
		
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));
	}

}
