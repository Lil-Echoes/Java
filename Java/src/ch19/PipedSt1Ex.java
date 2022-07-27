package ch19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PipedSt1Ex {
	public static void main(String[] args) {
		
		List<Member> list = new ArrayList<>();
		list.add(new Member("세정", 23, Member.FEMALE));
		list.add(new Member("원빈", 41, Member.MALE));
		list.add(new Member("제니", 27, Member.FEMALE));
		list.add(new Member("보검", 32, Member.MALE));
		list.add(new Member("IU", 29, Member.FEMALE));
		
		
		Stream<Member> mStream = list.stream();
		mStream.forEach(m->System.out.print(m.getName()+"\t"));
		System.out.println();
		
		double avg = list.stream().mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("평균 나이 : "+avg);
		
		avg = list.stream().filter(m->m.getGender()==Member.MALE)
				.mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("남자 평균 나이 : "+avg);
		
		avg = list.stream().filter(m->m.getGender()==Member.FEMALE)
				.mapToInt(Member::getAge).average().getAsDouble();
		System.out.printf("여자 평균 나이 : %.1f",avg);

	}

}
