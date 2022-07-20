package kr.co.util.list.ex1;

public class CityDTO {

	// 도시의 날씨 정보
	private String Name;	//도시명
	private Double temperature; //기온
	private int hum;	//습도
	private String status;	//맑음, 비, 눈 등 현재 상태
	
	public CityDTO() {
		super();
	}
	public CityDTO(String name, Double temperature, int hum, String status) {
		super();
		Name = name;
		this.temperature = temperature;
		this.hum = hum;
		this.status = status;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getTemperature() {
		return temperature;
	}
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}
	public int getHum() {
		return hum;
	}
	public void setHum(int hum) {
		this.hum = hum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "CityDTO [ Name = " + Name + ", temperature = " + temperature + ", hum = " + hum + ", status = " + status + " ]";
	}
	
	
}
