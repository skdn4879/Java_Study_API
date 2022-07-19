package kr.co.lang.wrapper.ex1;

import java.util.Date;
import java.util.Scanner;

public class WrapperEx1 {
	//ex1
	//키보드로부터 주민번호를 입력받음 6-7 : 123456-1234567
	//1. 남자 여자 판별
	//2. 현재 나이 출력
	//3. 3월 - 5월 사이는 봄, 6 - 8월 여름, 9 - 11월 가을, 12 - 2월 겨울 출력
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력 : ");
		String identityNumber = sc.next();
		
		int birthYear = Integer.parseInt(identityNumber.split("-")[0].substring(0, 2));
		int nowYear = Integer.parseInt(new Date().toString().split(" ")[5].substring(2));
		int ageConst = birthYear > nowYear ? (100 - birthYear) : -birthYear;
		int age = ageConst + nowYear + 1;
		
		int birthMonth = Integer.parseInt(identityNumber.split("-")[0].substring(2, 4));
		
		String gender = Integer.parseInt(identityNumber.split("-")[1].substring(0, 1)) % 2 == 1 ? "남자" : "여자";
		
		StringBuffer outputString = new StringBuffer();
		outputString.append("성별 : ").append(gender).append(", 나이 : ").append(age).append(", 계절 : ");
		
		if(birthMonth >= 3 && birthMonth <= 5) {
			outputString.append("봄");
		} else if(birthMonth >= 6 && birthMonth <= 8) {
			outputString.append("여름");
		} else if(birthMonth >= 9 && birthMonth <= 11) {
			outputString.append("가을");
		} else {
			outputString.append("겨울");
		}
		
		System.out.println(outputString.toString());
		
	}
	
	/*String firstNumberLine = identityNumber.split("-")[0];
	String secondNumberLine = identityNumber.split("-")[1];
	
	String birthYear = firstNumberLine.substring(0, 2);
	String birthMonth = firstNumberLine.substring(2, 4);
	String gender = secondNumberLine.substring(0, 1);
	
	int birthYearInteger = Integer.parseInt(birthYear);
	int birthMonthInteger = Integer.parseInt(birthMonth);
	int genderInteger = Integer.parseInt(gender);
	
	Date nowDate = new Date();
	String nowYear = nowDate.toString().split(" ")[5].substring(2);
	int nowYearInteger = Integer.parseInt(nowYear);
	
	int age = (nowYearInteger - birthYearInteger) + 1;
	boolean isMale = genderInteger % 2 == 0 ? true : false;
	String weather = new String();
	
	if(birthMonthInteger >= 3 && birthMonthInteger <= 5) {
		weather = "봄";
	} else if(birthMonthInteger >= 6 && birthMonthInteger <= 8) {
		weather = "여름";
	} else if(birthMonthInteger >= 9 && birthMonthInteger <= 11) {
		weather = "가을";
	} else {
		weather = "겨울";
	}
	
	String genderString = new String();
	
	if(isMale) {
		genderString = "남자";
	} else {
		genderString = "여자";
	}
	
	StringBuffer outputString = new StringBuffer();
	outputString.append("성별 : ").append(genderString).append(" 나이 : ").append(age).append(" 계절 : ").append(weather);
	
	System.out.println(outputString.toString());*/
	
}
