package kr.co.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	
	//메뉴 출력
	//1. 모든학생정보출력, 2. 학생한명정보검색, 3.학생정보추가, 4.학생정보삭제, 5.백업 - 현재 리스트에 있는 정보를 파일에 추가, 6.종료
	public void start() throws Exception {
		StudentService service = new StudentService();
		StudentView view = new StudentView();
		
		Scanner sc = new Scanner(System.in);
		ArrayList<StudentDTO> students = service.getList();
		boolean isContinue = true;
		boolean isArrayNotEmpty = false;
		
		while (isContinue) {
			isArrayNotEmpty = !students.isEmpty();
			System.out.print("1.모든학생정보출력  2.학생한명정보검색  3.학생정보추가  4.학생정보삭제  5.백업  6.종료  : ");
			int select = sc.nextInt();
			
			if(select == 1 && isArrayNotEmpty) {
				view.view(students);
			} else if(select == 2 && isArrayNotEmpty) {
				StudentDTO student = service.getStudent(students);
				
				if(student != null) {
					view.view(student);
				} else {
					view.view("해당 학생은 없습니다.");
				}
				
			} else if(select == 3) {
				service.setStudentAdd(students);
			} else if(select == 4 && isArrayNotEmpty) {
				int deleteResult = service.setStudentDelete(students);
				
				if (deleteResult == 1) {
					view.view("삭제 성공");
				} else {
					view.view("해당 학생은 없습니다.");
				}
				
			} else if(select == 5) {
				int backupResult = service.setList(students);
				
				if(backupResult == 1) {
					view.view("백업 성공");
				} else {
					view.view("백업 실패");
				}
			} else if(select == 6) {
				isContinue = !isContinue;
			} else {
				view.view("잘못된 입력이거나 학생들이 없습니다.");
			}
			
			System.out.println("=============================================================================================================");
		}
		
		sc.close();
		view.view("프로그램 종료");
	}
	
}
