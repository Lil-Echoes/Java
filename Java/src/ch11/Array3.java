package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Array3 {
	
	public static void main(String[] args) {
		
//		배열보다 추가, 삭제 편리하지만 속도는 배열이 빠르다
		
		
// 		ArrayList a1 사과, 수박, 바나나, 딸기, 수박을 추가
//		일반 for문으로 출력
		
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("사과");
		a1.add("수박");
		a1.add("바나나");
		a1.add("딸기");
		a1.add("수박");
		
		for (int i = 0; i < a1.size(); i++) {
			System.out.print(a1.get(i) + "\t");
		}
		System.out.println();
		
//		인덱스 2번째에 키위를 추가하고 확장 for문으로 출력
		
		a1.add(2, "키위");
		
		for (int i = 0; i < a1.size(); i++) {
			System.out.print(a1.get(i) + "\t");
		}
		System.out.println();

//		인덱스 4번째를 포도로 변경라고 iterator를 사용하여 출력
		
		a1.set(4, "포도");
		
		Iterator<String> its = a1.iterator();
		while(its.hasNext()) {
			System.out.print(its.next() + "\t");
		}
		System.out.println();
		
//		인덱스 첫번째 것을 삭제하고 a1을 직접 출력하는 prn(ArrayList a1) 매서드를 이용하여 출력
		
		a1.remove(0);
		prn(a1);
		
//		수박을 삭제하고 a1을 직접 출력하는 prn(ArrayList a1) 매서드를 이용하여 출력
		
		a1.remove("수박");
		prn(a1);
		
	}

	private static void prn(ArrayList<String> a1) {
		System.out.println(a1);
	}

}
