package ch05;

//	public이 아니기 떄문에 다른 패키지에서 사용 불가능
class Cal {
	int x = 0, y = 0;
	public void cal() {
		System.out.println("연산결과");
		System.out.printf("%d + %d = %d\n", x, y, x + y);
		System.out.printf("%d - %d = %d\n", x, y, x - y);
		System.out.printf("%d * %d = %d\n", x, y, x * y);
		System.out.printf("%d / %d = %d\n\n", x, y, x / y);

	}
}

//	한 파일에 두개의 클래스 같이 사용할 때 main에 잇는 클래스명과 파일명이 일치하고 public
public class Cal1Ex {

	public static void main(String[] args) {
		Cal cal1 = new Cal();
		Cal cal2 = new Cal();
		Cal cal3 = new Cal();
		
		cal1.x=10;
		cal1.y=20;
		
		cal2.x=12;
		cal2.y=4;
		
		cal3.x=15;
		cal3.y=5;
		
		cal1.cal();
		cal2.cal();
		cal3.cal();

	}

}
