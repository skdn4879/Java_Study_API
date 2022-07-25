package kr.co.network;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("서버 시작");
		
		//Server1 s1 = new Server1();
		Server2 s2 = new Server2();
		
		try {
			//s1.receive();
			s2.getFood();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("서버 종료");
	}

}
