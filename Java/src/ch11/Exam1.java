package ch11;

import java.util.ArrayList;
import java.util.Vector;

class IJ {}
class KL {}

public class Exam1 {
	
	public static void main(String[] args) {
		
		IJ a = new IJ();
		KL b = new KL();
		String c = new String("C");
		Vector vc = new Vector();
		ArrayList a1 = new ArrayList();
		
		vc.add(a);
		vc.add(b);
		vc.add(c);
		
		a1.add(a);
		a1.add(b);
		a1.add(c);
		
		for(int i = 0; i < vc.size(); i++) {
			Object obj = vc.elementAt(i);
			System.out.println(i + "-->" + obj);
		}
		System.out.println();
		
		for(int i = 0; i < a1.size(); i++) {
			Object obj = a1.get(i);
			System.out.println(i + "-->" + obj);
		}
		
	}

}
