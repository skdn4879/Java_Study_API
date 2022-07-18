package kr.co.lang;

import java.util.Scanner;

public class LangMain {

	public static void main(String[] args) {
		
		String name = "yudang";
		Scanner sc = new Scanner(System.in);
		
		Object obj = new Object();
		System.out.println(obj.toString());
		
		Member member = new Member();
		MemberClient mc = new MemberClient();
		
		Object[] objs = new Object[3];
		objs[0] = obj;
		objs[1] = member;
		objs[2] = mc;
		
		System.out.println(obj.equals(member));
		System.out.println(member.equals(mc));
		System.out.println(mc.equals(mc));
		
	}

}
