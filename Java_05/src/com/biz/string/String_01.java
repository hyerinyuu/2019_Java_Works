package com.biz.string;

public class String_01 {

	public static void main(String[] args) {
		
		// 문자열 변수 선언과 값 할당
		/* String 클래스 키워드를 사용해서
		 * strNation 문자열 변수를 선언하면
		 * String 클래스에 포함되어 있는 메서드 들중에
		 * 일부를 strNation 문자열 변수가 물려받는다.
		 * 
		 * strNation.method() 형식으로 해당하는 메서드들을
		 * 사용해서 여러 기능을 구현할 수 있다.
		 */
		String strNation = "Republic of Korea";
		String s = "Korea";
				
				
	    int num = 3;
	    
	    // [String.length()]
	    // strNation 문자열 변수가 보관하고 있는
	    // 문자열 Republic of Korea 의 알파벳 개수를
	    // 카운트 해 주는 기능(빈칸도 카운트함)
		int intLength = strNation.length();
		System.out.println("strNation 문자열 개수 : " + intLength);
		
		// 변수를 사용하지 않고 다른 method()에 전달하는 형태로도 사용가능
		System.out.println(strNation.length());
		
		
		strNation = "대한민국";
		System.out.println(strNation.length());
		
		String s1 = "Korea";
		String s2 = "대한민국";
		
		// 두개의 문자열 변수에 저장된(보관된) 문자열의
		// 전체 개수가 얼마인가
		int sum = s1.length() + s2.length();
		System.out.println("문자열 개수의 합 : " + sum);
	}

}
