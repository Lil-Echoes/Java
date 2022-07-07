package ch05;

public class PersonEx {

	public static void main(String[] args) {
		
		Person ps1 = new Person();
		ps1.name = "아이유";
		ps1.age = 28;
		ps1.hobby = "침뱉기";
		
		Person ps2 = new Person ("로제");
		ps2.age = 25;
		ps2.hobby = "욕하기";
		
		Person ps3 = new Person ("보검", 32);
		ps3.hobby = "졸기";
		
		Person ps4 = new Person ("블랙핑크", 27, "춤");
		
//		ps1.print();
//		ps2.print();
//		ps3.print();
//		ps4.print();
		
		Person[] person = {ps1, ps2, ps3, ps4};
		for (Person p : person) {
			p.print();
		}

	}

}
