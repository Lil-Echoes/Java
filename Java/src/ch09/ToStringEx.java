package ch09;

class Card {
	String kind;			//스페이드, 하트, 클로버ㅡ 다이아몬드
	int number;				// 1 ~ 13
	
	public Card (String kind, int number) {
		this.kind = kind; this.number = number;
	}
	
	public boolean equals(Object obj) {
			return number == ((Card)obj).number;		// 숫자 기준
//			return kind.equals (((Card)obj).kind);		// 종류 기준
	}
	
//	종류와 숫자 모두 같은 경우
//	public boolean equals(Object obj) {
//		return number == ((Card)obj).number && kind.equals (((Card)obj).kind); 
//}
	
	
	public String toString() {
		return "카드[종류 : " + kind + ", 번호 : " + number;
}
	
}
	
//	생성자 kind number
//	카드 종류가 같으면 같다고 정함
//	출력하면 카드 종륭하 번호가 출력



public class ToStringEx {
	public static void main(String[] args) {
		
		Card c1 = new Card("스페이드", 10);
		Card c2 = new Card("스페이드", 7);
		Card c3 = new Card("하트", 10);
		
		if(c1.equals(c2)) System.out.println("c1과 c2는 같다");
		else System.out.println("c1과 c2는 다르다");
		if(c1.equals(c3)) System.out.println("c1과 c3는 같다");
		else System.out.println("c1과 c3는 다르다");
		
		System.out.println("====================================");
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		
	}

}
