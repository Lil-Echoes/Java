package Ch02;

public class Practice01 {

	public static void main(String[] args) {
		
		int numOfApples = 123; // 사과의 갯수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 갯수)
		int numOfBucket = (numOfApples % sizeOfBucket == 0) ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket +1;
		System.out.println("필요한 바구나의 갯수는 " + numOfBucket + "개 입니다.");
		
//		정수일 때는 소숫점 자리를 절사
//		456/100*100 -> 4*100 -> 400
		int num1 = 456;
		System.out.println(num1/100*100);
		
//		나머지 연산자를 빼기 연산자보다 먼저 계산
//		10 - 24%10 -> 10 - 4 -> 6
		int num2 = 24;
		System.out.println(10 - num2%10);

	}

}
