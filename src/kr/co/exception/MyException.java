package kr.co.exception;

public class MyException extends Exception {
	
	public MyException() {
		super();
	}
	// 자식 클래스를 만드려면 먼저 부모클래스를 생성해야한다. 생성자에는 부모클래스의 생성자를 의미하는 super()가 생략되어있다.(명시해도 된다.)
	// 부모 클래스의 생성자에 매개변수가 있으면 자식이 받아서 해당 생성자를 바로 호출할 수 있다.
	public MyException(String message) {
		super(message);
	}

}
