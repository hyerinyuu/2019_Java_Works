package com.biz.string;

public class String_02 {

	public static void main(String[] args) {

		String strNation = "United States of America";
		// 문자열의 개수를 intLength에 담기
		int intLength = strNation.length();
		/*
		 * 1. USA가 strNation에 담김
		 * 2. strNation의 length가 intLength에 담김
		 */

		// (i < intLength) : i = intLength -1
		/*
		 * ### 문자열의 개수를 intLength에 담기
		 * strNation 변수에 어떤 문자열(한글 or 영어 or 갯수 상관없이)이
		 * 담기든 관계없이 아래 코드를 실행할 때,
		 * 코드의 변화 없이 실행을 보장하기 위해서(사람이 직접 세면 실수할수도 있으므로)
		 * 코드를 사용하여 문자열의 개수를 센다.
		 */
				
		// for 문의 반복 회수 : intLength 만큼
		// 변수 i 의 변화는 0 ~ (intLength -1) 이 된다.
		for(int i = 0; i < intLength ; i++) {
			
			
			// charAt : 문자 위치값
			// i값이 문자의 최대갯수를 넘어가면
			// 값이 표시가 안되므로(out of bound)
			// i 값은 항상 문자 최대갯수보다 작아야함( i < intLength=length-1)
			// ex) for(int i = 1; i <= intLength ; i++) => 오류
			char cA = strNation.charAt ( i );
			System.out.println(i + " 번째 : " + cA);
	}
		System.out.println("=====================================");
		for(int i = 0; i < intLength ; i++) {
		char cA = strNation.charAt ( i );
		System.out.print(cA);
}
}
}