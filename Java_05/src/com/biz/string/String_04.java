package com.biz.string;

public class String_04 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		// [substring의 이용 -문자'열'을 자르는 method
		// 1. substring(n) : n번째 위치에서부터 잘라서 strKorea에 저장해라
		String strKorea = strNation.substring(12);
	    System.out.println(strKorea);
	    
	    // 2. substring(n,n1) : n번째 위치부터 (n1을 제외한) n1 "앞글자"까지 
	    //                      잘라서 strPub에 저장해라
	    String strPub = strNation.substring(2, 8);
	    System.out.println(strPub);
		
		
	}

}
