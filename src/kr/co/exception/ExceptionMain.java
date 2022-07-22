package kr.co.exception;

public class ExceptionMain {

	public static void main(String[] args) {
		System.out.println("메인 시작");
		
		Test test = new Test();
		
		try {
			//test.t1();
			test.t4();
		} catch (Exception e) {	//모든 Exception 하위 클래스의 부모클래스이므로 모든 예외를 잡을 수 있다. 일종의 Object타입
			e.printStackTrace();
			System.out.println("Alert");
			//test.t2();
			//test.t3();
		}
		
		System.out.println("메인종료");
		
	}

}
