package ch09;

import java.util.GregorianCalendar;

public class Gre1 {
	public static void main(String[] args) {
		GregorianCalendar gc1 = new GregorianCalendar();
		GregorianCalendar gc2 = new GregorianCalendar(2022, 4, 22);
		
		System.out.printf("오늘은 %d년 %d월 %d일 입니다\n", gc1.get(GregorianCalendar.YEAR), gc1.get(GregorianCalendar.MONTH) + 1, gc1.get(GregorianCalendar.DAY_OF_MONTH));
		System.out.printf("오늘은 %d년 %d월 %d일 입니다\n", gc2.get(GregorianCalendar.YEAR), gc2.get(GregorianCalendar.MONTH) + 1, gc2.get(GregorianCalendar.DAY_OF_MONTH));
		
	}

}
