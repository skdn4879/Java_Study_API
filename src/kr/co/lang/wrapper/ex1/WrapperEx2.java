package kr.co.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {
	//ex2
	//주민번호 입력받음
	//  9  7  1  1  2  4  - 1  2  3  4  5  6  7
	//* 2  3  4  5  6  7    8  9  2  3  4  5
	//+ 18 21 4  5 12  28   8 18  6 12 20 30
	// 나온 값들을 다 더함, 192
	// 마지막 7번 숫자는 체크용
	// 총합을 11로 나누어서 나머지를 구한다, 192 / 11 = 17, 5
	// 나머지를 11에서 뺀 결과, 11 - 5 = 6 이 결과를 체크용 번호와 비교해서 같으면 정상번호
	// 만약에 위의 연산결과가 두자리면 연산 결과를 다시 10으로 나눈 나머지와 체크용 번호를 비교
	
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력 : ");
		String identityNumber = sc.next().replace("-", "");
		char[] numbers = identityNumber.toCharArray();
		int[] nums = new int[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			nums[i] = Integer.parseInt(Character.toString(numbers[i]));
		}
		
		int result = 0;
		int checkNum = nums[nums.length - 1];
		
		for(int i = 0; i < nums.length - 1; i++) {
			result += nums[i] * ((i % 8) + 2);
		}
		
		result = 11 - (result % 11);
		result = result >= 10 ? result % 10 : result;
		
		if(result == checkNum) {
			System.out.println("정상번호");
		} else {
			System.out.println("비정상번호");
		}
		
		//System.out.println("i : " + i + ", mulNum : " + mulNum + ", mul : " + nums[i] * mulNum + ", result : " + result);
		//System.out.println("i : " + i + ", mulNum : " + ((i % 8) + 2) + ", mul : " + nums[i] * ((i % 8) + 2) + ", result : " + result);
	}
	
}
