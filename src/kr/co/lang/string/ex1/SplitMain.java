package kr.co.lang.string.ex1;

public class SplitMain {

	public static void main(String[] args) {
		
		WorkerService ws = new WorkerService();
		WorkerDTO[] workers =  ws.init();
		WorkerView wv = new WorkerView();
		
		wv.viewAll(workers);
		
		int num = 10;
		String number = String.valueOf(num);
		System.out.println(number);
		System.out.println(number.getClass().getTypeName());
		
		WorkerDTO[] workers2 =  ws.init2();
		wv.viewAll(workers2);
		
	}

}
