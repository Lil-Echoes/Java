package ch11;

import java.util.TreeSet;

public class TreeSet1 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> lotto = new TreeSet<>();
//		중복도 막고 순서대로 정렬
		while (lotto.size() < 6) {
//						(정수) 0 ~ 1 사이의 실수 0 ~ 44까지 실수 -> 정수
			int num = (int)(Math.random() * 45) + 1;		// 1~45
			lotto.add(num);
		}
		System.out.println(lotto);
	}

}
