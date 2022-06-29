package Ch02;

public class DataTypeTest2 {

	public static void main(String[] args) {
		/*
		 * byte a1 = 100;
		 * double a2;
		 * a2 = a1; // 큰자료형=작은자료형 할당 가능
		 * System.out.println("byte 형 :" + a1);
		 * System.out.println("deouble 형 :" + a2); */
		
		double b1 = 100.5;
		byte b2;
		// b2=b1, 작은자료형 = 큰자료형 불가능
		b2 = (byte)b1;
		System.out.println("double형 : " + b1);
		System.out.println("byte형 : " + b2);

	}

}
