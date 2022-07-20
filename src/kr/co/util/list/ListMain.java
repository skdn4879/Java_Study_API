package kr.co.util.list;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		
		// List -> ArrayList
		// 원시타입 불가
		// <E>의 기본은 Object타입, <> 에 Generic을 지정, 데이터타입을 고정시킴
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		
		ArrayList<String> arr2 = new ArrayList<>();	// 뒤쪽 <>에는 자동으로 앞 Generic이 지정된다.
		
		ArrayList ar = new ArrayList();
		ar.add(1);	//int 타입이 자동으로 박싱, auto-boxing되어 들어감 원시타입을 넣어도 자동으로 참조타입으로 바꿔서 들어감 wrapper
		ar.add("abc");
		ar.add(2);
		ar.add(3);
		
		for(Object obj : ar) {
			System.out.println(obj.toString());
		}
		
		ar.remove(2);
		ar.remove("abc");
		for(Object obj : ar) {
			System.out.println(obj.toString());
		}
		
		// set - 특정 인덱스 번호의 요소를 수정
		ar.set(1, "wild ones");
		
		for(Object obj : ar) {
			System.out.println(obj.toString());
		}
		
		// clear - 모든 요소 삭제
		ar.clear();
		for(Object obj : ar) {
			System.out.println(obj.toString());
		}
	}

}
