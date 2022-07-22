package kr.co.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain2 {

	public static void main(String[] args) {
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.print("입력 : ");
		
		try {
			String message = br.readLine();
			System.out.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {	//보통 자원의 해제나 연결의 해제를 입력한다. 그리고 연결 해제시 선언의 역순으로 끊어준다.
			try {
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
