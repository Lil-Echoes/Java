package ch11;

import java.util.Vector;
import java.util.Iterator;

public class Vector1 {

	public static void main(String[] args) {
		
		Vector<String> a1 = new Vector<>();
		a1.add("사과");
		a1.add("수박");
		a1.add("바나나");
		a1.add("딸기");
		a1.add("수박");
		
		for (int i = 0; i < a1.size(); i++) {
			System.out.print(a1.get(i) + "\t");
		}
		System.out.println();
		
		a1.add(2, "키위");
		
		for (int i = 0; i < a1.size(); i++) {
			System.out.print(a1.get(i) + "\t");
		}
		System.out.println();

		a1.set(4, "포도");
		
		Iterator<String> its = a1.iterator();
		while(its.hasNext()) {
			System.out.print(its.next() + "\t");
		}
		System.out.println();
		
		a1.remove(0);
		prn(a1);
		
		a1.remove("수박");
		prn(a1);
		
	}

	private static void prn(Vector<String> a1) {
		System.out.println(a1);
	}	
	
}
