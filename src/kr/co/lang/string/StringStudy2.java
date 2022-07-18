package kr.co.lang.string;

import java.util.ArrayList;
import java.util.Scanner;

public class StringStudy2 {
	
	public void ex2() {
		//키보드로부터 파일명을 입력받음, 파일명과 확장자로 분리
		//파일이 이미지인지아닌지 구별, 맞냐아니냐 출력
		// jpg, png, gif, jpeg
		Scanner sc = new Scanner(System.in);
		String[] imageFiles = {"jpg", "png", "gif", "jpeg"};
		
		System.out.print("파일명 : ");
		String fileName = sc.next();
		int dotIndex = fileName.indexOf('.');
		String fileExpander = fileName.substring(dotIndex + 1);
		boolean isImageFile = false;
		
		for(String imageFile : imageFiles) {
			if(fileExpander.equalsIgnoreCase(imageFile)) {
				isImageFile = !isImageFile;
				break;
			}
		}
		
		if(isImageFile) {
			System.out.println("이미지 파일입니다.");
		} else {
			System.out.println("이미지 파일이 아닙니다.");
		}
		
	}
	
	public void studySubString() {
		String member = "iu/1234";
		int slashIndex = member.indexOf('/');
		String id = member.substring(0, slashIndex);
		String pw = member.substring(slashIndex + 1);
		System.out.println("아이디 : " + id + " 비번 : " + pw);
	}
	
	public void studyIndexOfEx1() {
		String names = "iu,yudang,lily,bmmi, ,,wow,nice,kingsejong 3th";
		//쉼표가 몇개나 있는가?
		//총 몇명?
		int offset = 0;
		int commaCount = 0;
		int index = 0;
		int lastOffset = 0;
		int humanCount = 0;
		ArrayList<String> results = new ArrayList<String>();
		
		while(index != -1) {
			//System.out.println("인덱스 : " + index + " 오프셋 : " + offset + " 카운트 : " + count);
			lastOffset = offset;
			index = names.indexOf(',', offset);
			offset = index + 1;
			
			if(index != - 1) {
				commaCount++;
				String result = names.substring(lastOffset, index);
				results.add(result);
			} else {
				String result = names.substring(lastOffset);
				results.add(result);
			}
			
		}
		
		humanCount = results.size();
		
		for(String s : results) {
			//System.out.println(s);
			if(s.equalsIgnoreCase("") || s.equalsIgnoreCase(" ") || s.equalsIgnoreCase(",")) {
				//isBlank()로 바꾸거나 trim()으로 공백제거 후 isEmpty()를 써도 된다.
				humanCount--;
			}
		}
		
		System.out.println("쉼표 개수 : " + commaCount);
		System.out.println("총 몇명 : " + humanCount);
		
	}

	public void studyIndexOf() {
		String str = "Hello Java";
		
		System.out.println(str.indexOf('J'));
		System.out.println(str.indexOf(" J"));
		System.out.println(str.indexOf('a', 8));
		System.out.println(str.indexOf('w'));
		
	}
	
}
