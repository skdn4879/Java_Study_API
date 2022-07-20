package kr.co.util.list.ex1;

import java.util.ArrayList;

public class WeatherView {

	//view메소드 리스트를 받아서 모든 정보를 출력
	public void view(ArrayList<CityDTO> cities) {
		for(CityDTO city : cities) {
			System.out.println(city.toString());
		}
	}
	
	//view메소드 city하나를 받아서 모든 정보를 출력
	public void view(CityDTO city) {
		System.out.println(city.toString());
	}
	
	//view메소드 메시지 하나를 받아서 해당 메시지 출력
	public void view(String message) {
		System.out.println(message);
	}
	
}
