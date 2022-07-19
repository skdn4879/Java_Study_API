package kr.co.lang.string.ex1;

public class WorkerService {

	//private String info;
	private StringBuffer sb;
	
	public WorkerService() {
		sb = new StringBuffer();
		sb.append("iu-인사과-과장-0101111");
		sb.append(", suji-IT-대리-0102222");
		sb.append(", choa-영업-부장-0103333");
		sb.append(", hani-마케팅-사원-0104444");
	}
	
	//WorkerDTO[]
	public WorkerDTO[] init() {
		//info 파싱해서 WorkerDTO에 대입하고 WorkerDTO를 모은 배열 리턴
		//System.out.println(this.info);
		String[] infos = sb.toString().split(",");
		int employeeCount = infos.length;
		WorkerDTO[] workers = new WorkerDTO[employeeCount];
		
		for(int i = 0; i < employeeCount; i++) {
			infos[i] = infos[i].trim();
			String[] worker = infos[i].split("-");
			workers[i] = new WorkerDTO(worker[0], worker[1], worker[2], worker[3]);
		}
		
		return workers;
	}
	
}
