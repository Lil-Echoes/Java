package ch09;

import java.util.Random;

public class RandomEx {
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		System.out.println(ran.nextInt(100));		// 0~99까지
		System.out.println(ran.nextInt(101));		// 0~100까지
		System.out.println(ran.nextInt(100) + 1);	// 1~100까지
		System.out.println(ran.nextInt());			// int 정수 중에서 random
		System.out.println(ran.nextFloat());		// float 실수 중에서 random
		System.out.println(ran.nextDouble());		// double 실수 중에서 random
		System.out.println(ran.nextLong());			// long 정수 중에서 random
		System.out.println(ran.nextBoolean());		// boolean 중에서 random

	}

}
