package kr.co.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		//File : 파일이나 폴더의 정보를 담는 클래스
		//실제 파일이나 폴더가 없을 수도 있음, 없으면 없다는 정보를 가짐
		File file = new File("C:\\study\\test.txt"); 		//폴더명 + 파일명을 한번에 (역슬러시 표현을 위해 두번하거나 그냥 / 한번)
		
		//parent : 폴더, child : 파일명 또는 최종 폴더명
		file = new File("C:\\study", "test.txt");
		
		//1. 폴더명 경로가 있는 File 객체를 만들고 이용
		File path = new File("C:\\study");
		file = new File(path, "test.txt");
		
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.length());
		
		System.out.println("=============================");
		
		System.out.println(path.exists());
		System.out.println(path.isFile());
		System.out.println(path.isDirectory());
		
		file = new File("C:\\study\\sub");
		if(!file.exists()) {
			file.mkdir();
		}
		
		File file2 = new File("C:\\study\\sub2\\t1");
		//file.mkdir();	//이건 실행안된다. 최종적으로 생성되는 폴더는 t1인데 중간에 sub2라는 폴더가 없으므로 생성 안됨
		//file.mkdirs();	//이건 실행된다. 중복으로 만들어지는건 아무런 변화가 없다.
		
		//file2.delete();	// 파일이나 폴더 지우기 (하위 폴더나 파일이 있는 경우 안지워진다.) 지우고 싶으면 내부가 비어있어야한다.
		
	}

}
