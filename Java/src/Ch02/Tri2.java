package Ch02;

public class Tri2 {

	public static void main(String[] args) {
		
//		내가 푼 방법
		int num1 = 234;		// 게시글 갯수 : 234
		int num2 = 250;		// 게시글 갯수 : 250
		int noPerPage = 10;	// 페이지당 글 수 : 10
//		자바에서는 정수 / 정수를 결과도 정수 : 연산의 결과는 같은 데이터형이거나 더 큰 데이터형으로 변경
		int page1 = (num1 / noPerPage) + ((num1 % noPerPage == 0) ? 0 : 1);
		int page2 = (num2 / noPerPage) + ((num2 % noPerPage == 0) ? 0 : 1);
		System.out.println("게시글이 " + num1 + "개일 때, " + page1 + "페이지가 필요합니다.");
		System.out.println("게시글이 " + num2 + "개일 때, " + page2 + "페이지가 필요합니다.");
		
//		답 풀이
		page1 = (num1 % noPerPage == 0) ? num1 / noPerPage : num1 / noPerPage +1;
		page2 = (num2 % noPerPage == 0) ? num1 / noPerPage : num2 / noPerPage +1;
		System.out.println("게시글이 " + num1 + "개일 때, " + page1 + "페이지가 필요합니다.");
		System.out.println("게시글이 " + num2 + "개일 때, " + page2 + "페이지가 필요합니다.");
		
	}

}
