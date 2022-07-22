package kr.co.io.file.ex1;

import java.util.ArrayList;

public interface Service {
	
	// StudentDAO에서 getList를 호출하고 총점과 평균을 각각 계산하여 대입, 그 리스트를 리턴
	public ArrayList<StudentDTO> getList() throws Exception;
	
	//StudentDAO의 setList를 호출하고 그 결과를 리턴
	public int setList(ArrayList<StudentDTO> ar) throws Exception;
	
	//찾을려고하는 학생의 학번을 입력받아서 찾은 학생을 리턴
	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception;
	
	//삭제하려는 학생의 학번을 입력받아서 찾은 학생을 삭제, 삭제가 성공하면 1을 리턴, 실패하는 경우 0을 리턴
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception;
	
	//학생의 이름 번호 점수들을 입력받아 학생 한명을 추가
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception;

}
