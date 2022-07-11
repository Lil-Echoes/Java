package ch07;

public class FruitSeller3 {
	
	String name;
	int numOfApple;
	int money;
	final int PRICE_PER_APPLE = 1000;
	
	public FruitSeller3(String name, int numOfApple, int money) {
		this.name = name;
		this.numOfApple = numOfApple; this.money = money;
	}
	
	int saleApple(int amt) {			
		
		int num = amt / PRICE_PER_APPLE;
		if (numOfApple >= num) {		// 주문한 수량이 남아있는 사과의 수량
			money += amt;
			numOfApple -= num;
			System.out.printf("%s  %d개 판매, 수입 %d월\n", name, num, amt);
		} else {
			System.out.println("사과가 부족해서 팔 수 없습니다");
			num = 0;					// 안 팔았다
		}
		
		return num;
	}
	
	void print() {
		System.out.println(name + "의 사과 갯수 : " + numOfApple);
		System.out.println(name + "의 현금잔액 : " + money);
		System.out.println("===========================");
	}

}
