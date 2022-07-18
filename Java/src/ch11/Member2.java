package ch11;

public class Member2 implements Comparable<Member2> {
	
	String name;
	int age;
	
	public Member2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int compareTo(Member2 o) {	// 비교하는 기준을 설정하는 메소드
//		비교는 문자형으로 변경하여 처리
//		비교는 문자형으로 해야하는데 age는 숫자이기에 문자로 변경해야함
//		숫자형을 문자형으로 변경하는 방법
//		1) 숫자형 + 문자형하여 문자형으로 변경 up casting
//		2) String.valueOf(int a)를 통하여 문자형으로 변경
		String age1 = age + "";
		String age2 = String.valueOf(o.age);
		return age1.compareTo(age2);
//		return name.compareTo(o.name);
	}
	
	public String toString() {
		return name + "(" + age + ")";
	}
	
	

}
