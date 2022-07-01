package ch04;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		int[] score = {76, 45, 34, 89, 100, 50, 90, 92};
		System.out.println("처음 : " + Arrays.toString(score));
		
//		오름순 정렬
		int imsi = 0;
		for(int i=0; i < score.length; i++) {
			for(int j = i+1; j < score.length; j++) {
				if(score[i] > score[j]) {
					imsi = score[i];
					score[i] = score[j];
					score[j] = imsi;
				}
			}
			System.out.println((i+1) + " 실행 후 : " +Arrays.toString(score));		//배열 순서 변경 과정
				
		}
		for(int sc : score) {
			System.out.print(sc + "\t");
		}
		System.out.println(""
				+ "\n===============================================================");
		
//		내림순 정리
		imsi = 0;
		for(int i=0; i < score.length; i++) {
			for(int j = i+1; j < score.length; j++) {
				if(score[i] < score[j]) {
					imsi = score[i];
					score[i] = score[j];
					score[j] = imsi;
				}
			}
			
				
		}
		for(int sc : score) {
			System.out.print(sc + "\t");
		}
		System.out.println("\n");

	}

}
