package kr.co.thread;

public class ThreadMain {

	public static void main(String[] args) {
		
		ThreadTest1 t1 = new ThreadTest1();
		ThreadTest2 t2 = new ThreadTest2();
		Thread t = new Thread(t2);
		//t2는 Thread 클래스를 상속받은게 아니라 Runnable 인터페이스 구현체이다. 인터페이스는 추상메소드만 가진다.
		//만약 start메소드가 Runnable인터페이스에 선언되어 있다면 오버라이드해야한다는 오류가 나온다.
		//그런 오류가 나오지 않은 이유는 start메소드는 Runnable 인터페이스가 아닌 Thread클래스에 있다는 것
		//따라서 Thread 클래스를 따로 만들어 target을 주고 그 클래스를 실행하는 것
		//개발자 직접 호출이 아니라 OS에게 실행 부탁 (start메소드)
		
		//t1.getNum();
		t1.start();
		
		//t2.getAlpha();
		//t2.start();
		t.start();
	}

}
