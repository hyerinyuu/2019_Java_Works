package com.biz.classes.string;

public class String_07 {

	public static void main(String[] args) {

		//[substring을 사용해서 문자(열) 찾기]
		
		String strNation = "Republic of Korea";
		String strSearch = "k";
		
		int intLength = strNation.length();
		int index = 0;
		
		for(int i = 0; i < intLength; i++ ) {
		
		String strAt = strNation.substring(i, i+1);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println(i + "번째 위치에서 찾음");

		}
	
		
		
		
	}

}
