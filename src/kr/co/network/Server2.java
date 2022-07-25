package kr.co.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Server2 {

	private ArrayList<String> lunch;
	private ArrayList<String> dinner;
	
	public Server2() {
		lunch = new ArrayList<>();
		dinner = new ArrayList<>();
		
		lunch.add("짜장면");
		lunch.add("라면");
		lunch.add("햄버거");
		lunch.add("피자");
		lunch.add("굶기");
		
		dinner.add("삼겹살");
		dinner.add("치킨");
		dinner.add("샐러드");
		dinner.add("볶음밥");
		dinner.add("굶어");
	}
	
	//getFood
	//Server에서 메시지 수신 대기
	//1. 점심메뉴 중 임의로 하나 전송, 2. 저녁메뉴 중 임의로 하나 전송, 3. 프로그램이 종료, 그 외 : 잘못 입력된 번호입니다를 전송
	public void getFood() throws Exception {
		
		ServerSocket serverSocket = new ServerSocket(8282);
		System.out.println("클라이언트 접속 대기");
		Socket socket = serverSocket.accept();
		System.out.println("클라이언트 접속 완료");
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		String receive = "";
		int select = 0;
		
		while(true) {
			
			receive = br.readLine();
			System.out.println("클라이언트로부터 받은 입력 : " + receive);
			
			try {
				select = Integer.parseInt(receive);
			} catch(Exception e) {
				bw.write("숫자만 눌러주세요\r\n");
				bw.flush();
				continue;
			}
			
			Random random = new Random(Calendar.getInstance().getTimeInMillis());
			
			if(select == 1) {
				int ranNum = random.nextInt(lunch.size());
				bw.write(lunch.get(ranNum) + "\r\n");
			} else if(select == 2) {
				int ranNum = random.nextInt(dinner.size());
				bw.write(dinner.get(ranNum) + "\r\n");
			} else if(select == 3) {
				break;
			} else {
				bw.write("잘못 입력된 번호입니다.\r\n");
			}
			
			bw.flush();
			
		}
		
		bw.close();
		ow.close();
		os.close();
		br.close();
		ir.close();
		is.close();
		socket.close();
		serverSocket.close();
		
	}
	
}
