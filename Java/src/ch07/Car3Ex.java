package ch07;

public class Car3Ex {
	public static void main(String[] args) {
		
//		자식을 선언하고 부모를 생성해서 넣을 수 없다.
//		FireEngine3 fe = new Car3();
		
//		부모를 선언하고 자식을 대입하는 것은 up-casting 묵시적
		Car3 car1 = new FireEngine3();
		Car3 car2 = new Ambulance3();
		Car3 car3 = new Bus3();
		
//		부모를 선언하고 자식을 대입했을 경우에는 부모에 있는 메소드만 사용 가능
//		실제로 실행되는 메소드는 자식 메소드
		car1.drive();
		car2.drive();
		car3.drive();
		
//		car1.fire();	//
		
		System.out.println("=======================");
		Car3[] cars = {car1, car2, car3};
		for(Car3 car : cars) {
			car.drive();
		}
		System.out.println("=======================");
		for(int i = 0; i < cars.length; i++) {
			cars[i].drive();	// 실제로 실행되는 메소드는 자식메소드,
								// 부모에 메소드와 이름이 같은 메소드만 실행 가능
			System.out.println("색깔 : " + cars[i].color);	//변수는 부모 것으로 실행
			if (cars[i] instanceof FireEngine3) {		// true일 떄마
			((FireEngine3)cars[i]).fire();
			}
		}
	}
}
