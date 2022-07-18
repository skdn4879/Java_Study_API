package kr.co.lang.string;

public class StringStudy {
	
	public void studyCharAt() {
		//문자열 = 문자배열
		char[] chs = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
		String str = "Hello World";
		
		System.out.println(chs[0]);
		System.out.println(str.charAt(0));
		System.out.println(str.length());
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		for(char c : str.toCharArray()) {
			System.out.println(c);
		}
		
	}

}
