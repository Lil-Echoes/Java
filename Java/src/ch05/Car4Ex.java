package ch05;

class Car4 {
	String carNo;						// 차량번호
	int inTime;							// 입고시간
	int outTime;						// 출고시간
	int fee;							// 주차요금
	final int MONEY_PER_HOUR = 5000;	// 시간당 주차요금
	
	Car4(String c, int i, int o) {		// 멤버변수 초기화
		carNo = c; inTime = i; outTime = o;
	}
	void calFee() {
		fee = (outTime-inTime) * MONEY_PER_HOUR;
	}
	void prn() {
		System.out.printf("차량번호 : %s\n입고시간 : %d시\n출고시간 : %d시\n주차요금 : %d\n",carNo, inTime, outTime, fee);
		System.out.println("====================");
	}

}

public class Car4Ex {

	public static void main(String[] args) {
		Car4 car1 = new Car4 ("가1234", 10, 13);
		Car4 car2 = new Car4 ("나4567", 9, 18);
		Car4 car3 = new Car4 ("다9876", 11, 16);
		
//		car1.calFee();						// 개별 실행
//		car2.calFee();
//		car3.calFee();
//		
//		car1.prn();
//		car2.prn();
//		car3.prn();
		
		Car4[] cars = {car1, car2, car3};	// 배열을 통한 실행
		for(Car4 car : cars) {
			car.calFee();
			car.prn();
		}

	}

}
