package kr.co.lang;

public class Member {	// extends Object 생략됨, 모든 클래스의 부모클래스는 Object, 모든 클래스는 Object타입이다.
						//이래서 Object로 담으면 모든 객체를 담을 수 있다.
	// 따라서 모든 클래스는 Object 배열에 담을 수 있고 모든 메소드에 Object 타입의 매개변수는 모든 클래스를 매개변수로 받을 수 있다.

	private String name;
	private String email;
	
	@Override
		public boolean equals(Object obj) {
			System.out.println("call equals method");
			return super.equals(obj);
		}
}
