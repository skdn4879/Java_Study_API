package kr.co.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	
	//결합도가 강하다(높다) : 클래스 내부에서 객체 생성, 선언과 동시에 초기화
	//결압도가 약하다(낮다) : 매개변수를 통해서 만들어진 객체를 주입, 생성자의 매개변수로 받는다

	//start메소드, 1번누르면 날씨정보 초기화 - init() 2.전국날씨출력 3.지역날씨검색 4.지역정보추가 5.지역정보삭제 6.종료
	public void start() {
		Scanner sc = new Scanner(System.in);
		ArrayList<CityDTO> cities = new ArrayList<>();
		WeatherService ws = new WeatherService();	//생성자에서 만들어지게 해도된다.
		WeatherView wv = new WeatherView();
		
		boolean isContinue = true;
		boolean isInited = false;
		
		while(isContinue) {
			
			isInited = !cities.isEmpty();
			System.out.print("1.날씨정보초기화 2.전국날씨출력 3.지역날씨검색 4.지역정보추가 5.지역정보삭제 6.종료 : ");
			int selection = sc.nextInt();
			
			if(selection == 1) {
				ws.init(cities);
			} else if(selection == 2 && isInited) {
				wv.view(cities);
			} else if(selection == 3 && isInited) {
				
				CityDTO targetCity = ws.find(cities);
				
				if(targetCity != null) {
					wv.view(targetCity);
				} else {
					System.out.println("존재하지 않는 도시입니다.");
				}
				
			} else if(selection == 4 && isInited) {
				ws.add(cities);
			} else if(selection == 5 && isInited) {
				ws.remove(cities);
			} else if(selection == 6) {
				isContinue = !isContinue;
				System.out.println("프로그램 종료");
			} else {
				System.out.println("잘못된 입력이거나 초기화 미수행");
			}
			
			System.out.println("=====================================================================\n");
			
		}
		
	}
	
}
