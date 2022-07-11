package ch07;

public class Teacher2 extends Person2 {
	
	private String subject;
	
	public Teacher2(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getBan() {
		return subject;
	}

	public void setBan(String subject) {
		this.subject = subject;
	}
	
	void print() {
		super.print();
		System.out.println("과목 : " + subject);
	}

}
