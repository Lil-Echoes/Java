package ch07;

public class Teacher extends Person {
	
	private String subject;
	
	public Teacher(String name, int age, String subject) {
		setName(name); setAge(age); this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setPart(String subject) {
		this.subject = subject;
	}
	
	void printTh() {
		print();
		System.out.println("과목 : " + subject);
	}

}
