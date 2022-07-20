package kr.co.util.list.ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {

	private StringBuffer sb;
	private HashMap<String, Integer> cityMap;
	
	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul,30.2,70,맑음,");
		sb.append("Daegu-38.9-90-흐림-");
		sb.append("Jeju,12.1,10,눈,");
		sb.append("Busan-0.5-85-태풍-");
	}
	
	//sb에 있는 데이터들을 파싱해서 CityDTO에 담아서 리턴(ArrayList)
	public void init(ArrayList<CityDTO> cities) {
		
		String initData = sb.toString().replace('-', ',').substring(0, sb.length() - 1);
		StringTokenizer st = new StringTokenizer(initData, ",");
		HashMap<String, Integer> map = new HashMap<>();
		
		while(st.hasMoreTokens()) {
			String cityName = st.nextToken();
			CityDTO city = new CityDTO(cityName, Double.parseDouble(st.nextToken()), Integer.parseInt(st.nextToken()), st.nextToken());
			cities.add(city);
			map.put(cityName, cities.indexOf(city));
		}
		
		this.cityMap = map;
		
	}
	
	//add메소드 city 정보를 입력받아서 기존의 리스트에 추가
	public void add(ArrayList<CityDTO> cities) {
		Scanner sc = new Scanner(System.in);
		System.out.print("도시명 : ");
		String cityName = sc.next();
		System.out.print("기온 : ");
		double cityTemperature = sc.nextDouble();
		System.out.print("습도 : ");
		int cityHum = sc.nextInt();
		System.out.print("상태 : ");
		String cityStatus = sc.next();
		
		CityDTO city = new CityDTO(cityName, cityTemperature, cityHum, cityStatus);
		
		cities.add(city);
		this.cityMap.put(cityName, cities.indexOf(city));
	}
	
	//remove메소드 도시명을 입력받아서 리스트에서 삭제
	public void remove(ArrayList<CityDTO> cities) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 도시명 : ");
		String cityName = sc.next();
		
		/*for(CityDTO city : cities) {
			if(city.getName().equalsIgnoreCase(cityName)) {
				cities.remove(city);
				break;
			}
		}
		
		for(int i = 0; i < cities.size(); i++) {
			if(cityName.equalsIgnoreCase(cities.get(i).getName())) {
				cities.remove(i);
				break;
			}
		}*/
		
		if(cityMap.get(cityName) != null) {
			cities.remove((int)cityMap.get(cityName));
			refleshMap(cities);
		} else {
			System.out.println("존재하지 않는 도시입니다.");
		}
	}
	
	//find메소드 도시명을 입력받아서 리스트에서 검색
	public CityDTO find(ArrayList<CityDTO> cities) {
		Scanner sc = new Scanner(System.in);
		
		StringBuffer cityArr = new StringBuffer().append("도시 목록 : ");
		
		for(CityDTO city : cities) {
			cityArr.append(" " + city.getName());
		}
		System.out.println(cityArr.toString());
		
		System.out.print("검색할 도시명 : ");
		String cityName = sc.next();
		CityDTO result = null;
		
		/*for(CityDTO city : cities) {
			if(city.getName().equalsIgnoreCase(cityName)) {
				result = city;
				break;
			}
		}*/
		
		if(cityMap.get(cityName) != null) {
			result = cities.get(cityMap.get(cityName));
		}
		
		return result;
	}
	
	private void refleshMap(ArrayList<CityDTO> cities) {
		this.cityMap.clear();
		
		for(CityDTO city : cities) {
			String cityName = city.getName();
			int index = cities.indexOf(city);
			this.cityMap.put(cityName, index);
		}
	}
}
