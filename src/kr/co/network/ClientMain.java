package kr.co.network;

public class ClientMain {

	public static void main(String[] args) {
		System.out.println("클라이언트 시작");
		
		//Client1 c1 = new Client1();
		Client2 c2 = new Client2();
		
		try {
			//c1.send();
			c2.getFood();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("클라이언트 종료");
	}

}
