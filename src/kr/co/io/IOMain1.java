package kr.co.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain1 {

	public static void main(String[] args) {
		
		//키보드로부터 글자를 입력받는 순서 작성(Scanner의 세부과정)
		// 키보드로 바이트를 입력받고 reader가 글자 하나를 처리해 긁어모아 문자열
		InputStream is = System.in;		//byte 처리
		InputStreamReader ir = new InputStreamReader(is);	//글자 하나 처리
		BufferedReader br = new BufferedReader(ir);		// 보조스트림, 받은 정보를 버퍼에 담아놓고 요청시 출력하는
														// 키보드 입력도 일단 버퍼에 담긴다. 바로 들어오게 되면 지울수가 없다.
														// 일단 버퍼에 담긴 것들을 보여주고 최종적으로 저장하게되면 버퍼에 있는 애들을 꺼내 저장한다.
		try {
			System.out.println("키보드에서 입력 후 엔터");
			String msg = br.readLine();
			System.out.println(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("키보드에서 입력 후 엔터");
			String msg = br.readLine();
			System.out.println(msg);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}
		
	}

}
