package ch08;

public class Employee {
	
	final double INCENTIVE_RATE = 0.1;				// 변경 못함
	
	private String name;
	
	public Employee() {}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
		
	public void setName(String name) {
		this.name = name;
	}
		
	int computePay() {
		return 0;
	}
		
	final int computeIncentive() {				// 인센티브 계산하는 식은 변경 금지
		int result = 0;
		int pay = computePay();
		if (pay >= 100000) {					// 급여가 10만원 이상인 경우에만 인센티브를 지급
			double temp = pay * INCENTIVE_RATE;
			result = (int)temp;
		}
		return result;
	}

}
