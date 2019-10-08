package com.biz.classes.string;

public class String_New_12 {

	public static void main(String[] args) {

		
		String s1 = "Korea";
		String s2 = "Korea";
		
		String n1 = new String("Korea");
		String n2 = new String("Korea");
		
		boolean bYes = s1 == s2;
		System.out.println("s1 == s2 : " + bYes);
		
		bYes = n1 == n2;
		System.out.println("n1 == n2 : " + bYes); //true 같지만 false
		// => 왜냐하면 new String이 붙어 객체화 됐기 때문에
		// 저장값이 같냐는 질문이 아닌 저장된 장소가 같냐는 질문이기 때문임 = false
		// 따라서 문자열의 비교는 절대 == 쓰지 말고
		// ***************equals를 사용하도록 한다.******************
		
		bYes = n1.equals(n2);
		bYes = n1.equalsIgnoreCase(n2);
		System.out.println("n1 == n2 " + bYes);
		
		
		
	}

}
