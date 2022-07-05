package ch05;


class Card {
	
//	String kind[] = new String[] {"스페이드", "하트", "다이아", "클로버"};
//	int number[] = n
	
//	kind(스페이드, 하트, 다이아, 클로버)
//	number 1 ~ 13
//	클래스 변수 width, height
	
	String kind;
	int number;
	static int width;
	static int height;
	
	
	void print() {
//		종류, 번호, 가로, 세로 출력
		System.out.println("종류 : " + kind);
		System.out.println("번호 : " + number);
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("==================");
	}

	
}


public class CardEx {

	public static void main(String[] args) {
		
//		초기 가로 100, 세로 250
//		카드 3개 생성
//		스페이드 7
//		하트 1
//		클로버 10
//		각각을 출력하는 프로그램 작성
		
		Card card1 = new Card();
		card1.width = 100;
		card1.height = 250;
		
		card1.kind = "스페이드";
		card1.number = 7;
		
		Card card2 = new Card();
		card2.kind = "하트";
		card2.number = 1;
		
		Card card3 = new Card();
		card3.kind = "클로버";
		card3.number = 10;
		
		card1.print();
		card2.print();
		card3.print();
		
	}

}
