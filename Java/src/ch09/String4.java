package ch09;

import java.util.Arrays;

public class String4 {
	public static void main(String[] args) {
		
		String str1 = "우리는 친구였어, 곁에 있으면 든든한 친구";
		
//		총 글자수
//		index 5부터 10 바로 앞까지 출력
//		" "을 기준으로 배열을 만들어서 배열 출력
//		배열에서 "는"으로 끝나는 단어
//		배열에서 "든"으로 시작하는 단어 출력
//		,가 있는 인덱스 번호
		
		System.out.println("총 글자수  : " + str1.length());
		String str2 = str1.substring(5,10);
		System.out.println(str2);
		String[] str3 = str1.split(" ");
		System.out.println(Arrays.toString(str3));
		
		for (String s : str3) {
			if (s.endsWith("는")) System.out.println("는으로 끝나는 단어 : " + s);
			if (s.startsWith("든")) System.out.println("든으로 시작하는 단어 : " + s);
		}
		
		System.out.println(",의 index번호 : " + str1.indexOf(","));
		
//		charAt 해당하는 문자 한자 가져오기
		for (int i = str1.length() - 1; i>=0; i--) {
			System.out.print(str1.charAt(i));		
		}
	}

}
