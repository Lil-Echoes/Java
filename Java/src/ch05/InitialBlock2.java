package ch05;

public class InitialBlock2 {
	static int[] arr = new int[10];
	static {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}
	}
	
	public static void main(String[] args) {
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
