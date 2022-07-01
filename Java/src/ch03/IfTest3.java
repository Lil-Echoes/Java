package ch03;

public class IfTest3 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if(a>=95)
		System.out.println("당신의 점수는 "+a+" 이고 학점은 A++입니다.");
		else if(a>=90)
		System.out.println("당신의 점수는 "+a+" 이고 학점은 A입니다.");
		else if(a>=85)
		System.out.println("당신의 점수는 "+a+" 이고 학점은 B++입니다.");
		else if(a>=80)
		System.out.println("당신의 점수는 "+a+" 이고 학점은 B입니다.");
		else if(a>=75)
		System.out.println("당신의 점수는 "+a+" 이고 학점은 C++입니다.");
		else if(a>=70)
		System.out.println("당신의 점수는 "+a+" 이고 학점은 C입니다.");
		else if(a>=65)
		System.out.println("당신의 점수는 "+a+" 이고 학점은 D++입니다.");
		else if(a>=60)
		System.out.println("당신의 점수는 "+a+" 이고 학점은 D입니다.");
		else
		System.out.println("당신의 점수는 "+a+" 이고 학점은 F입니다.");

	}

}
