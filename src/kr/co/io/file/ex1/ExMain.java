package kr.co.io.file.ex1;

public class ExMain {

	public static void main(String[] args) {
		
		StudentController controller = new StudentController();
		
		try {
			controller.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
