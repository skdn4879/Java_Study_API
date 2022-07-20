package kr.co.util.list;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add("First");
		ar.add(2);			//Integer auto boxing
		ar.add('c');		//Character auto boxing
		ar.add(2.123);		//Double auto boxing
		ar.add(null);
		ar.add(false);		//Boolean auto boxing
		
		for(Object obj : ar) {
			System.out.println(obj);
		}
		
		// get -> 특정 인덱스 요소를 반환
		int num = (int)ar.get(1);
		int num2 = (Integer)ar.get(1);
		String str = ar.get(0).toString();	// (String)ar.get(0);
		char ch = (Character)ar.get(2);
		double d = (Double)ar.get(3);
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(str);
		System.out.println(ch);
		System.out.println(d);
		
		System.out.println(ar.get(0) instanceof String);
		System.out.println(ar.get(1).getClass().getTypeName());
		
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<>();
		
	}

}
