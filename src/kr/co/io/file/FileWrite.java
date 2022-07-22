package kr.co.io.file;

import java.io.File;
import java.io.FileWriter;

public class FileWrite {

	public void write() throws Exception {
		File file = new File("C:\\study\\test.txt");
		FileWriter fw = new FileWriter(file, true);	//그냥 파일만 매개변수로 넣으면 전체내용변경, boolean을 넣으면 append 옵션 활성화 여부
		
		fw.write("Today is Friday\r\n");		//쓰기할땐 \r\n은 그냥 필수로 붙는 접미사
		//fw.flush();
		
		fw.write("Tomorrow is Saturday\r\n");
		fw.flush();
		
		fw.close();
		
	}
	
}
