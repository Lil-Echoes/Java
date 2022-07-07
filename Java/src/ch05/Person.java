package ch05;

public class Person {
	String name, hobby;
	int age;
	
	Person() {};
	Person(String n) {
		name = n;
		}
	Person(String n, int a) {
		name = n; age = a;
	}
	Person(String n, int a, String h) {
		name = n; age = a; hobby = h;
	}
	
	void print() {
		System.out.printf("이름 : %s\n나이 : %d\n취미 : %s\n==================\n", name, age, hobby);		
	}
	
	
	
}
