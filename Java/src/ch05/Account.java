package ch05;

public class Account {
	
	String accountNo;			// 계좌 번호
	String name;				// 예금주
	int balance;				// 잔액
	
	public Account(String aNo, String n, int b) {
		accountNo = aNo; name = n; balance = b;
	}
	
	void deposit(int money) {	// 예금
		balance += money;		// balance = balance + money
		System.out.println(name + " 입금 : " + money);

	}
	
	void withdraw(int money) {	// 출금
		if(balance >= money) {
			balance -= money;	// balance = balance - money
			System.out.println(name + " 출금 : " + money);
		} else {
			System.out.println("꺼져!!! 잔액이 부족해");
		}
	}
	
	void disp() {
		System.out.println("===계좌번호 : " + accountNo + "===");
		System.out.println("예금주 : " + name);
		System.out.println("잔액 : " + balance);
		System.out.println("=========================");
	}
	

}
