package kr.co.lang.string.ex1;

public class WorkerView {
	//workerdto를 받아서 정보를 출력
	
	public void viewAll(WorkerDTO[] workers) {
		
		for(WorkerDTO worker : workers) {
			System.out.println(worker.toString());
		}
		
	}
	
}
