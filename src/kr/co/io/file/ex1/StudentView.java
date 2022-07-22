package kr.co.io.file.ex1;

import java.util.ArrayList;

public class StudentView {

	//view 메소드 3개
	//1. String 출력
	//2. StudentDTO 출력
	//3. ArrayList<StudentDTO> 출력
	
	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(StudentDTO student) {
		System.out.println(student.toString());
	}
	
	public void view(ArrayList<StudentDTO> students) {
		for(StudentDTO student : students) {
			System.out.println(student.toString());
		}
	}
}
