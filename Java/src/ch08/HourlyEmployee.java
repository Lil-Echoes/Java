package ch08;

public class HourlyEmployee extends Employee {
	
	private int hoursWorked;
	private int moneyPerHour;
	
	public HourlyEmployee(String name, int hoursWorked, int moneyPerHour) {
		super(name); this.hoursWorked = hoursWorked; this.moneyPerHour = moneyPerHour;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getMoneyPerHour() {
		return moneyPerHour;
	}

	public void setMoneyPerHour(int moneyPerHour) {
		this.moneyPerHour = moneyPerHour;
	}
	
	@Override		// @를 어노테이션 설명, 프로그램 설명하고 프로그램에 역할, comment(주석) : 설명만한다
					// @Override : overriding 규칙을 벗어나면 에러처리
	int computePay() {
		return hoursWorked * moneyPerHour;
	}

}
