package ch05;

public class Box1Ex {

	public static void main(String[] args) {
		
		Box box1 = new Box();
		
		box1.width = 20;						//값을 저장하지 않으면 Box에서 width 초기값(10)을 불러움
		box1.height = 25;
		box1.depth = 50;
		
		box1.calVolume();
		box1.square();
		
		System.out.println("===============");
		
		Box box2 = new Box();
		
		box2.width = 12;
		box2.height = 20;
		box2.depth = 25;
		
		box2.calVolume();
		box2.square();

	}

}
