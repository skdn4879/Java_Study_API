package kr.co.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {

	public void receive() throws Exception {
		Scanner sc = new Scanner(System.in);
		
		ServerSocket serverSocket = new ServerSocket(8282);
		//서버 오픈 Client 접속을 기다림
		System.out.println("클라이언트 접속 대기");
		//Socket : 상대방과 1대1 통신
		
		Socket socket = serverSocket.accept();
		System.out.println("클라이언트 접속 완료");
		
		InputStream is = socket.getInputStream();	//0, 1처리
		InputStreamReader ir = new InputStreamReader(is); //문자 단위 처리
		BufferedReader br = new BufferedReader(ir);	//문자열 처리
		// is -> ir -> br,		 0,1로 받고 문자 단위로 처리후 문자열로 버퍼에 담김
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		String message = "";
		String sendingMessage = "";
		
		while(true) {
			message = br.readLine();
			System.out.println("클라이언트로부터 받은 메시지 : " + message);
			
			if (message.toLowerCase().equals("q")) {
				break;
			}
			
			System.out.print("클라이언트로 보낼 메시지 : ");
			sendingMessage = sc.next();
			
			bw.write(sendingMessage + "\r\n");
			bw.flush();
			
			if(sendingMessage.toLowerCase().equals("q")) {
				break;
			}
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
