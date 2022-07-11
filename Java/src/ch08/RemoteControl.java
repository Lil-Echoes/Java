package ch08;

//	java .18(Java8)에 추가된 메소드 default, static
public interface RemoteControl {
	
//	interface에 있는 모든 변수는 public final 생략
	int MAX_VOLUME = 10;		//상수, 즉 변경하지 못
	int MIN_VOLUME = 0;
	
//	인터페이스 모든 메소는 public abstract
	void turnOff();
	void turnOn();
	
//	default 메소드는 구현부를 만들 수 있다
	default void setMute(boolean mute) {
		if (mute) System.out.println("무음처리 합니다");
		else System.out.println("무음 해제합니다");
	}
	
//	static 메소드도 구현부를 만들 수 있다
	static void changeBattery() {
		System.out.println("건전지를 교환홥니다");
	}

}
