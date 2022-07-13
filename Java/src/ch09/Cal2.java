package ch09;

import java.util.Calendar;

public class Cal2 {
	public static void main(String[] args) {
		
		Calendar cal2 = Calendar.getInstance();
		System.out.print("현재 ");
		if (cal2.get(Calendar.AM_PM) == 0) System.out.print("오전");
		else System.out.print("오후");
		System.out.printf(" %d시 %d분 %d초 입니다\n", cal2.get(Calendar.HOUR), cal2.get(Calendar.MINUTE) + 1, cal2.get(Calendar.SECOND));

	}

}
