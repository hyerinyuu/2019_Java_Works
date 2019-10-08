package com.biz.string;

public class String_03 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		// toUpperCase() : 대문자로 바꾸어주는 method()
		String sUpper = strNation.toUpperCase();
		// 변수를 사용한 경우
		System.out.println(sUpper);
		// 아닌경우
		System.out.println(strNation.toUpperCase());
		
		// toLowerCase() : 소문자로 바꾸어주는 method()
		String sLower = strNation.toLowerCase();
		System.out.println(sLower);
		
		// 이 method 들은 한글에는 적용 안됨
		
	}

}
