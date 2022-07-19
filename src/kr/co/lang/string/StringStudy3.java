package kr.co.lang.string;

public class StringStudy3 {
	
	public void studySplit3() {
		// 분리 기준이 다르니 기준을 통일하는 전처리 후 분리
		String info = "서울,대전-대구,부산-제주,광주-강릉";
		String info2 = info.replace('-', ','); //전처리
		String[] cities = info2.split(",");
		
		for(String city : cities) {
			System.out.println(city);
		}
		
	}
	
	public void studySplit2() {
		String info = "1997 12 24";
		String[] infos = info.split(" ");
		
		for(String s : infos) {
			System.out.println(s);
		}
	}

	public void studySplit() {
		String str = "iu,suji,choa,hani";
		String[] names = str.split(",");
		
		for(String s : names) {
			System.out.println(s);
		}
	}
	
}
