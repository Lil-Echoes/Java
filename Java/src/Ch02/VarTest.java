package Ch02;

public class VarTest {

	public static void main(String[] args) {
		byte k = 21;
//		short k2; k2 = 3000; //초기값 부여가능
//		int a, b, c; //같은 형의 변수는 ,로 나열이 가능
//		int d = 23,e = 500,f = 2300;
//		int $test;//_,$만 가능 //int 3test;
		byte k3 = 12;
		short s2 = 23; //byte su = k3 + s2;
		//자바의 연산결과 -> 기본적인 숫자 -> int를 사용
		int su = k3 + s2;
		System.out.println("변수의 종류");
		System.out.println("k = " + k + ", su = " + su);//출력할문자형태+변수명
		float f2 = 3.5f; //소수점은 무조건 double형임
		System.out.println("f2 = " + f2);
		boolean b1 = true,b2 = false;
		boolean b3 = 3 < 5; //수식을 통해서 결과값을 반환
		System.out.println("=논리형=");
		System.out.println("b1 = " + b1 + ", b2 = " + b2 + ",b3 = " + b3);
		System.out.println("==문자형==");
		char munja = 'a'; char munja2 = 'A' + 1;//66
		char munja3 = 65;
		System.out.println("munja = " + munja);//아스키코드값 , a
		System.out.println("munja2 = " + munja2); //B
		System.out.println("munja3 = " + munja3);//A
		System.out.println("형변환 munja3 = "+(int)munja3); //추가=>형변환 munja3=65
		//문자열형=>기본형처럼 사용 //String a = new String("abc");
		String str1 = "abc";
		String str2 = "자료형";
		String str3 = str1 +" "+ str2;//문자열결합
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2); //str3=abc 자료형
		System.out.println("str3 = " + str3);
		
		}
}