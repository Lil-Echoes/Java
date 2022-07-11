package ch08;

public class CarEx {
	public static void main(String[] args) {
		
		Car[] cars = new Car[3];
		cars[0] = new Ambulance();
		cars[1] = new FireEngine();
		cars[2] = new Bus();
		
		for(Car car : cars) {
			car.move();
			System.out.println(car.x);
			if (car instanceof Bus) {
				((Bus)car).inwon();
				}
		}
	}

}
