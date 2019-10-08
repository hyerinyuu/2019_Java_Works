package com.biz.var;

public class String_04 {

	public static void main(String[] args) {
		
		// String num = 0; -> 오류
		// 문자열형인 String에 int형인 0을 저장할 수 없다.
		
		/*
		 * 숫자를 문자열 변수에 저장하려면
		 * !!숫자를 문자열형으로 변환!! 시켜야한다.
		 * 숫자를 문자열형으로 변환시키려면
		 * !!숫자 + "" 형식으로!! 만들어주면 
		 * 문자열로 변환이 된다.
		 * ex) String num = 0+ ""; -> num = "0"
		 */
		
		int intNum1 = 30;
		
		// 숫자형 변수에 담긴 값을
		// 문자열형 변수에 저장하려면
		// 숫자형변수 + "" 형식으로 작성한다.
		
		String num = intNum1 + "";
		// num = intNum1; ->오류
		// num은 이미 문자열형 변수(String)로 저장되어 있기 때문에
		// int형 변수로 저장된 intNum1에 저장될 수 없음
		
		num = 3 + " " + 4;
		System.out.println(num);
		
		num = 3 + "" + 4;
		System.out.println(num);
				 
		
		

	}

}
