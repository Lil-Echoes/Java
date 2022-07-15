package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Array1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<>();		// 저장할 데이터의 갯수에 제한이 없음	// 배열은 갯수 제한
		a1.add("구렁이");
		a1.add("팔렁이");
		a1.add("칠렁이");
		a1.add("구렁삼");
		a1.add("구렁사");
		
		System.out.println("데이터 건수 : " + a1.size());
		for(int i = 0; i < a1.size(); i++) {
			System.out.print(a1.get(i) + "\t");
		}
		System.out.println();
		
		for(String snake : a1) {
			System.out.print(snake + "\t");
		}
		System.out.println();
		
		Iterator<String> its = a1.iterator();			// 데이터를 Iterator형식에 맞게 넣어라
		while(its.hasNext()) {
			System.out.print(its.next() + "\t");
			
		}
	}

}
