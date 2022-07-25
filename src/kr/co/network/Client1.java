package kr.co.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {

	public void send() throws Exception {
		Scanner sc = new Scanner(System.in);
		
		Socket socket = new Socket("192.168.7.39", 8282);
		System.out.println("서버 접속 완료");
		
		OutputStream os = socket.getOutputStream();	//0, 1처리
		OutputStreamWriter ow = new OutputStreamWriter(os);	//문자 처리
		BufferedWriter bw = new BufferedWriter(ow);
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		String message = "";
		String recievedMessage = "";
		
		while(true) {
			System.out.print("서버에 보낼 메시지 : ");
			message = sc.next();
			
			//전송
			bw.write(message + "\r\n");	// bw -> ow -> os로 전송됨, 문자열 -> 문자 단위 처리 -> 0, 1로 전송
			bw.flush();
			
			if(message.toLowerCase().equals("q")) {
				break;
			}
			
			recievedMessage = br.readLine();
			System.out.println("서버로부터 받은 메시지 : " + recievedMessage);
			
			if (recievedMessage.toLowerCase().equals("q")) {
				break;
			}
		}
		
		//자원 해체 (자원 할당의 역순)
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
