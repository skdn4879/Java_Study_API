package kr.co.lang.wrapper;

public class WrapperMain1 {

	public static void main(String[] args) {
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.TYPE);
		
		int num = 50;
		Integer integer = new Integer(num);
		
		//원래 주소값을 담는 참조변수에 그냥 인트값을 담을 수 있게 해놓음
		integer = num;	//auto-boxing
		num = integer;	//auto-unboxing
		
		long l =10L;
		Long long1 = l;	//같은 형식끼리만 오토박싱, 언박싱 수행가능
		
		integer = (int)l;	//캐스팅은 같은 원시 타입만 형변환 가능
		integer = long1.intValue();
		
		String num1 = "50";
		String num2 = "3.14";
		String num3 = "60";
		
		int n1 = Integer.parseInt(num1);
		double n2 = Double.parseDouble(num2);	// 객체를 생성하지 않고 바로 메소드를 쓸 수 있으니 static
		long n3 = Long.parseLong(num3);
		
		System.out.println(n1 + n2 + n3);
		
	}

}
