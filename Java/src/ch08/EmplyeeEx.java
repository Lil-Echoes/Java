package ch08;

public class EmplyeeEx {
	public static void main(String[] args) {
		
		Employee[] emps = new Employee[5];
		emps[0] = new SalesEmployee("블랙핑크", 2000000);
		emps[1] = new SalesEmployee("bTS", 5000000);
		emps[2] = new HourlyEmployee("박보검", 100, 800);
		emps[3] = new HourlyEmployee("차은우", 200, 20000);
		emps[4] = new HourlyEmployee("이준호", 300, 10000);
		
		for(Employee emp : emps) {
			int sal = emp.computePay();
			int bonus = emp.computeIncentive();
			System.out.println("=====" + emp.getName() + "의 급여 명세서");
			System.out.println("급여 : " + sal);
			System.out.println("보너스 : " + bonus);
		}
	}
}
