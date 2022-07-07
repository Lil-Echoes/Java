package ch06;

class D2 {
	
//	참조형 변수 객체, 배열 callByRef 주소 전달 : 서로 영향을 미침
//	기본형 변수 값 정수, 실수, 문자, bool형 값
	int x, y;
	
	void swap(D2 d) {
		int imsi = d.x;
		d.x = d.y;
		d.y = imsi;
		System.out.println("m1 : " + d.x);
		System.out.println("m1 : " + d.y);
	}
}

public class CallByRef2 {
	public static void main(String[] args) {
		D2 d2 = new D2();
		d2.x = 10;
		d2.y = 20;
		d2.swap(d2);
		System.out.println("main : " + d2.x);
		System.out.println("main : " + d2.y);
		
		
//		D2 객체 생성학 객체를 swap메소드에 전달
//		객체에 있는 x와 y값 출력
		
	}

}
