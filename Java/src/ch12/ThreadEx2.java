package ch12;

class Thread2 extends Thread {
	public void run() {
		for(int i = 1; i<20; i++) {
			System.out.print("대박\t");
			if(i%10==9) System.out.println();
			try {
				Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
	}
}

public class ThreadEx2 {
	
	public static void main(String[] args) {
		
		Thread2 td1 = new Thread2();
//		td1.run();
		td1.start();
		
		for(int i = 1; i<20; i++) {
			System.out.print("사건\t");
			if(i%10==9) System.out.println();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
