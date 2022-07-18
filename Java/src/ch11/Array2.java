package ch11;

import java.util.ArrayList;

public class Array2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<>();
			a1.add("구렁이");
			a1.add("팔렁이");
			a1.add("칠렁이");
			a1.add("구렁삼");
			a1.add("구렁이");
			print(a1);
			
//			팔렁이 앞에 구렁사를 추가하고 싶다
			a1.add(1,"구렁사");
			print(a1);
			
//			구렁삼을 도룡용으로 변경
			a1.set(4, "도룡용");
			print(a1);
			
//			인덱스 0번째인 구렁이를 지우고 출력
			a1.remove(2);
			print(a1);
			
//			구렁이를 삭제	// 같은 것이 두개 이상일 경우에는 첫 번째 데이터만 삭제
			a1.remove("구렁이");
			print(a1);
		
	}

	private static void print(ArrayList<String> a1) {
		System.out.println(a1);
	}

}
