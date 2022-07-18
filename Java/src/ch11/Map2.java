package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map2 {
	
	public static void main(String[] args) {
		
//		"딸기", "달콤하다"
//		"수박", "시원하다"
//		"키위", "시큼하다"
//		map에 담아서 저장하고 HashSet과 Iterator를 사용하여 key와 값을 출력하라
		
		HashMap<String, String> hm1 = new HashMap<>();
		
		hm1.put("딸기", "달콤하다");
		hm1.put("수박", "시원하다");
		hm1.put("키위", "시큼하다");
		
		Set<String> fruits = hm1.keySet();
		for (String fruit : fruits) {
			System.out.println(fruit + " : " + hm1.get(fruit));
		}
		
		System.out.println("================");
		
		Iterator<String> it = hm1.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + hm1.get(key));
		}
		
	}

}
