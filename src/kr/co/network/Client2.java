package kr.co.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

	//getFood
	//Server 접속 후
	//1. 점심메뉴, 2. 저녁메뉴, 3.종료, 번호를 입력받아 Server로 전송 받아서 출력
	public void getFood() throws Exception {
		Scanner sc = new Scanner(System.in);
		
		Socket socket = new Socket("localhost", 8282);
		System.out.println("서버 접속 완료");
		
		OutputStream os = socket.getOutputStream();	//0, 1처리
		OutputStreamWriter ow = new OutputStreamWriter(os);	//문자 처리
		BufferedWriter bw = new BufferedWriter(ow);
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		String select = "";
		
		while(true) {
			System.out.print("1. 점심메뉴   2. 저녁메뉴   3. 종료 : ");
			select = sc.next();
			
			bw.write(select + "\r\n");
			bw.flush();
			
			if(select.equals("3")) {
				break;
			}
			
			String message = br.readLine();
			System.out.println("서버로부터 받은 메시지 : " + message);
			System.out.println();
		}
		
		br.close();
		ir.close();
		is.close();
		bw.close();
		ow.close();
		os.close();
		socket.close();
		sc.close();
		
	}
	
}
