package kr.co.lang.string.ex1;

public class WorkerDTO {
	
	private String name;
	private String department;
	private String job;
	private String phone;
	
	public WorkerDTO() {
		super();
	}
	
	public WorkerDTO(String name, String department, String job, String phone) {
		super();
		this.name = name;
		this.department = department;
		this.job = job;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "WorkerDTO [name=" + name + ", department=" + department + ", job=" + job + ", phone=" + phone + "]";
	}
	
}
