package kr.co.util.list.ex1;

public class WeatherMain {

	public static void main(String[] args) {
		//1. 클래스의 역할과 메소드의 역할, 변수의 역할
		//WeatherMain			: 프로그램실행, TEST
		//WeatherService		: Data 가공
		//WeatherController		: 관리
		//WeatherView			: 출력전용
		//CityDTO				: Data
		
		WeatherController wc = new WeatherController();
		wc.start();
		
	}

}
