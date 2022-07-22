package kr.co.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {

	// file data access
	
	//2. setList : 
	public int setList(ArrayList<StudentDTO> ar){
		//예외처리는 내부에서 처리
		//List로 받은 데이터들을 StudentData에 작성
		//기존의 내용은 삭제
		//작성 형식은 기존 내용의 형식과 동일하게
		//1을 리턴 : 정상적인 성공, 0을리턴 : 예외가 발생했을 경우
		File studentData = new File("C:\\study", "StudentData.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(studentData);
		} catch (IOException e) {
			return 0;
		}
		
		for(StudentDTO student : ar) {
			StringBuffer sb = new StringBuffer();
			sb.append(student.getName()).append(",");
			sb.append(student.getNum()).append(",");
			sb.append(student.getKor()).append(",");
			sb.append(student.getEng()).append(",");
			sb.append(student.getMath()).append("\r\n");
			
			try {
				fw.write(sb.toString());
			} catch (IOException e) {
				return 0;
			}
		}
		
		try {
			fw.flush();
		} catch (IOException e) {
			return 0;
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				return 0;
			}
		}
		
		return 1;
	}
	
	//1. getList : StudentData 파일의 내용을 읽어서 적절한 StudentDTO 객체들 생성, 리스트로 리턴
	public ArrayList<StudentDTO> getList() throws IOException{
		
		ArrayList<StudentDTO> results = new ArrayList<>();
		File studentData = new File("C:\\study", "StudentData.txt");
		FileReader fr = new FileReader(studentData);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			
			String studentInfo = br.readLine();
			
			if(studentInfo == null) {
				break;
			}
			
			if(studentInfo.isEmpty()) {
				continue;
			}
			
			studentInfo = studentInfo.trim();
			StringTokenizer st = new StringTokenizer(studentInfo, ",");
			
			StudentDTO student = new StudentDTO(st.nextToken().trim(), Integer.parseInt(st.nextToken().trim()), 
					Integer.parseInt(st.nextToken().trim()), Integer.parseInt(st.nextToken().trim()), 
					Integer.parseInt(st.nextToken().trim()));
			
			results.add(student);
		}
		
		br.close();
		fr.close();
		
		return results;
	}
	
}
