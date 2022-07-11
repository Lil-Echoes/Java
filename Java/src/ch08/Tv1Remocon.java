package ch08;

public class Tv1Remocon implements RemoteControl {
	
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
}

class RationRemocon implements RemoteControl {
	
	public void turnOff() {
		System.out.println("라디오를 끕니다");
	}

	public void turnOn() {
		System.out.println("라디오를 켭니다");
	}
}