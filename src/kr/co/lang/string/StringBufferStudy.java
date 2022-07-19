package kr.co.lang.string;

public class StringBufferStudy {

	public static void main(String[] args) {
		
		String str1 = "max";
		String str2 = "age";
		
		//str1 = str1 + str2;
		//상수영역에 불필요한 객체 생성됨
		
		StringBuffer sb = new StringBuffer();	//불필요한 객체 생성되지 않음
		sb.append(str1);
		sb.append(str2);
		sb.append(10);
		sb.append(true);
		
		String result = sb.toString();
		
		System.out.println(str1);
		System.out.println(sb);
		System.out.println(result);
		
	}

}
