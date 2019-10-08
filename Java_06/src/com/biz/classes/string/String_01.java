package com.biz.classes.string;

public class String_01 {

	public static void main(String[] args) {
		
		/*
		 * 문. strNation 문자열 중에서 u 라는 문자가
		 * 몇번째 위치에 있나?
		 */
		// [내가한거]
		//String strNation = "Republic of Korea";
		//int intLength = strNation.length();
		
		//for(int i = 0; i < intLength ; i++) {
		//	char cA = strNation.charAt(i);
		//	System.out.println((i+1) + " 번째글자 " + cA);
		
		// [정답]
		
		String strNation = "Republic of Korea";
		int intLength = strNation.length();
		
		char cA = strNation.charAt(0);
		if(cA == 'u')
			System.out.println("번째 위치에 있음");
		
		
		
	}


}