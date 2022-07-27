package ch18;

interface MyFun2 {
	void method(int x);
}

public class Lamda2Ex {
	public static void main(String[] args) {
		
		MyFun2 mf;
		mf = (x) -> {
			int result = x * 5;
			System.out.printf("결과 : %s\n", result);
			};
		mf.method(5);
		
//		매개변수가 한 개인 경우에는 소괄호()를 생략할 수 있다
		mf=x->{System.out.println("결과 : " + x*5);};
		mf.method(10);
		
//		실행문이 한 개인 경우에는 중괄호{}를 생략할 수 있다
		mf=x->System.out.println("결과 : " + x*5);
		mf.method(6);
	}

}
