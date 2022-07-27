package ch19;

public class Member {
	static final int MALE = 0;
	static final int FEMALE = 1;
	
	private String name;
	private int gender;
	private int age;
	
	public Member(String name, int age, int gender) {
		this.name=name; this.age=age; this.gender=gender;
	}

	public String getName() {
		return name;
	}

	public int getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}
	

}
