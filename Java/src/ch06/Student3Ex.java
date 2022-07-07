package ch06;

public class Student3Ex {
	public static void main(String[] args) {
		
		Student3 st1 = new Student3();
		st1.setName("로제");
		st1.setKor(90);
		st1.setEng(80);
		st1.setMath(70);
		
		Student3 st2 = new Student3();
		st2.setName("보검");
		st2.setKor(99);
		st2.setEng(77);
		st2.setMath(66);
		
		st1.print();
		st2.print();
	}

}
