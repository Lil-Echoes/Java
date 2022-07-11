package ch07;

public class FruitSeller2 {
	
	String name;
	int numOfApple;
	int money;
	final int PRICE_PER_APPLE = 1000;
	
	public FruitSeller2(String name, int numOfApple, int money) {	// 초기화
		this.name = name;
		this.numOfApple = numOfApple; this.money = money;
	}
	
	int saleApple(int amt) {			
		money += amt;
		int num = amt / PRICE_PER_APPLE;	
		numOfApple -= num;
		return num;
	}
	
	void print() {
		System.out.println(name + "의 사과 갯수 : " + numOfApple);
		System.out.println(name + "의 현금잔액 : " + money);
		System.out.println("===========================");
	}

}
