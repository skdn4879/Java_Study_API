package kr.co.util.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("n1", 10);
		map.put("n2", 20);
		map.put("third", 270);
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map);
		System.out.println(map.toString());
		System.out.println(map.get("n1"));
		
		int num = map.get("third");
		System.out.println(num);
		
		// 1. 키들을 알아내기
		boolean check = map.containsKey("n3");
		System.out.println(check);
		check = map.containsKey("n2");
		System.out.println(check);
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		Iterator<String> iterator = keys.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
	}

}
