package com.biz.string;

public class String_05 {

	public static void main(String[] args) {

		int num = 30;
		
		// num 변수에 30이 담겨 있냐?
		// 그 결과를 bYes에 담아라
		boolean bYes = num == 30;
		
		if(bYes) 
			System.out.println("num에는 30이 담겨있다.");
		else
			System.out.println("num에는 30이 담겨있지 않다.");
			
		num = 50;
		int num1 = 30;
		
		bYes = num == num1;
		
		String strNation = "Korea";
		String strKorea = "Korea";
		
		bYes = strNation == strKorea;
		if(bYes)
			System.out.println("두 문자열 일치");
		else
			System.out.println("두 문자열 불일치");
		
		if(strNation == strKorea)
			System.out.println("두 문자열 일치");
		else
			System.out.println("두 문자열 불일치");
		
		/*
		 * 문자열 변수는
		 * 일반(primitive)와 달리 클래스형 변수이다.
		 * 클래스형 변수는 내부 시스템적으로
		 * 작동되는 방식이 약간 다르기 때문에
		 * 같음을 비교할 때 EQ(==)를 사용해서는 안된다.
		 * EQ를 사용해서 비교를 하면
		 * 값이 같음에도 불구하고 같지 않음을 나타나는
		 * 오류가 발생할 수 있다.
		 * 
		 * "문자열" 비교는 EQ(==)를 사용하지 않고
		 * 별도의 method를 사용해서 비교한다.(equals/equalsIgnoreCase)                                                                                                                   
		 */
		
		// 두 문자열 변수에 담긴 값이 일치하는가?
		bYes = strNation.contentEquals(strKorea);
		bYes = strKorea.contentEquals(strNation);
		
		// 대소문자에 관계없이 단어 나열이 일치하는가?
		bYes = strNation.equalsIgnoreCase(strKorea);
		bYes = strKorea.equalsIgnoreCase(strNation);
		
	}

}
