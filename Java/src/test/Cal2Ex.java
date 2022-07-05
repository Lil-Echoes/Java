package test;

//	improt Box라는 클래스는 ch05 패키지에 있는 Box
import ch05.Box;

//import ch05.Cal;

public class Cal2Ex {
	
public static void main(String[] args) {
		
		Box b1 = new Box();				// 반드시 객체를 생성해야 사용 가능
		b1.width = 20;
		b1.height = 25;
		b1.depth =15;
		b1.calVolume();
		
//		같은 패키지에 있는 클래스가 아닌 경우 패키지명.클래스으로 사용한다 
		ch05.Box b2 = new ch05.Box();   	 
		b2.width = 20;
		b2.height = 25;
		b2.depth =15;
		b2.calVolume();
		
		
		
//		public 있어야 다른 패키지에서 사용 가능
//		같은 패키지에 있으면 public 없어도 사용 가능
//		Cal c1 = new Cal();
//		c1.x = 20;
//		c1.y = 25;
//		c1.cal();

	}

}
