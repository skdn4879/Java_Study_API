package kr.co.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileRead {

	public void read() throws Exception {
		// 파일의 내용 읽어오기
		//1. 어느 폴더의 어느 파일
		File file = new File("C:\\study", "test.txt");
		
		//2. 파일과 연결
		FileReader fr = new FileReader(file);
		
		//3. 파일의 내용 읽기
		//fr.read() : 한글자씩 읽어서 효용성이 떨어짐, 그리고 한바이트씩 읽으면 한글은 두바이트이므로 깨진다.
		
		//3. 파일의 내용을 읽기 위한 보조 스트림 연결
		BufferedReader br = new BufferedReader(fr);
		
		//4. 내용 읽기
		boolean check = true;
		
		while(check) {
			String name = br.readLine();	//readLine()은 엔터키(\n)를 만날때까지 읽어옴, 파일에 내용이 얼마인지 모르니
			
			if(name == null) {
				break;
			}
			
			System.out.println(name);
			//check = name == null ? false : true;
		}
		
	}
	
}
