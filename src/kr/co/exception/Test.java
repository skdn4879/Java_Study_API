package kr.co.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public void t1() {
		System.out.println("t1 메소드 시작");
		
		String str = null;
		
		System.out.println(str.toString());	//new NullPointerException 객체 생성되고 바로 종료
		
		System.out.println("t1메소드 종료");
	}
	
	public void t2() {
		int num = 10;
		
		try {
			num /= 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("의도적 예외");
		}
	}
	
	public void t3() {
		
		String[] str = {"10", "five", "3.14"};
		Scanner sc = new Scanner(System.in);
		
		for(String s : str) {
			try {
				System.out.println("숫자 입력 : ");
				int n = sc.nextInt();
				
				int num = Integer.parseInt(s);
				System.out.println(num);
				num /= 0;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("파싱오류");
			} catch (ArithmeticException e) {
				e.printStackTrace();
				System.out.println("수학오류해결바람");
			} catch (InputMismatchException e) {
				System.out.println("입력예외");
			}	
		}	
	}
	
	public void t4() throws NullPointerException, ArithmeticException {	//그냥 Exception으로 던져도 된다.
		String str = null;
		System.out.println(str.toString());
	}
	
	public void t5() throws MyException {
		//유치원생 프로그램(의도적 예외 클래스 생성)
		// 0 ~ 99
		int num = 48;
		int num2 = 82;
		int num3 = num + num2;
		int num4 = num - num2;
		
		if(num3 >= 100) {
			throw new MyException();	//굳이 사용자 예외를 안던지고 기존의 다른 Exception객체를 그냥 생성해서 던져도 무방하다.
		}
		
		if(num4 < 0) {
			throw new MyException("음수몰라");
		}
	}
	
}
