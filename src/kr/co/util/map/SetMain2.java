package kr.co.util.map;

import java.util.HashSet;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {
		
		HashSet<Integer> hashBrown = new HashSet<>();
		Random random = new Random();
		
		while(hashBrown.size() < 6) {
			int num = random.nextInt(1, 45);
			boolean isAdded = hashBrown.add(num);
			if(!isAdded) {
				System.out.println("중복 : " + num);
			}
		}
		
		for (Integer number : hashBrown) {
			System.out.println(number);
		}
		
	}

}
