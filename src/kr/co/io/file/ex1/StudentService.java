package kr.co.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements Service {
	
	StudentDAO studentDAO = new StudentDAO();
	Scanner sc = new Scanner(System.in);

	@Override
	public ArrayList<StudentDTO> getList() throws Exception {
		ArrayList<StudentDTO> students = studentDAO.getList();
		
		for(StudentDTO student : students) {
			student.setTotal(student.getKor() + student.getEng() + student.getMath());
			student.setAvg(student.getTotal() / 3);
		}
		
		return students;
	}

	@Override
	public int setList(ArrayList<StudentDTO> ar) throws Exception {
		return studentDAO.setList(ar);
	}

	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception {
		StudentDTO seekStudent = null;
		
		StringBuffer list = new StringBuffer().append("학생 목록 : ");
		for(StudentDTO student : ar) {
			list.append(student.getNum()).append(". ").append(student.getName()).append("  ");
		}
		System.out.println(list.toString());
		
		System.out.print("찾을 학생의 학번 입력 : ");
		int seekNum = sc.nextInt();
		
		for(StudentDTO student : ar) {
			if(student.getNum() == seekNum) {
				seekStudent = student;
				break;
			}
		}
		
		return seekStudent;
	}

	@Override
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception {
		
		StringBuffer list = new StringBuffer().append("학생 목록 : ");
		for(StudentDTO student : ar) {
			list.append(student.getNum()).append(". ").append(student.getName()).append("  ");
		}
		System.out.println(list.toString());
		
		System.out.print("삭제할 학생의 학번 입력 : ");
		int seekNum = sc.nextInt();
		
		for(StudentDTO student : ar) {
			if(student.getNum() == seekNum) {
				ar.remove(student);
				return 1;
			}
		}
		
		return 0;
	}

	@Override
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception {
		
		System.out.print("학생 이름 입력 : ");
		String name = sc.next();
		System.out.print("학생 번호 입력 : ");
		int num = sc.nextInt();
		System.out.print("학생 국어점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("학생 영어점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("학생 수학점수 입력 : ");
		int math = sc.nextInt();
		
		StudentDTO freshman = new StudentDTO(name, num, kor, eng, math);
		
		ar.add(freshman);
		
		//getList();
		
	}

}
