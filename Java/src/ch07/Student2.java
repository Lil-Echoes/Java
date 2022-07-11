package ch07;

public class Student2 extends Person2 {
	
	private String ban;
	
	public Student2(String name, int age, String ban) {
		super(name, age);
		this.ban = ban;
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}
	
	void print() {
		super.print();
		System.out.println("반 : " + ban);
	}

}
