package com.biz.var;

public class String_01 {

	public static void main(String[] args) {
		
		/*
		 * 문자열을 저장하는 변수를 선언할때는
		 * String 키워드를 사용하는데
		 * String은 태생이 class 이다.
		 * 하지만 일반 변수처럼 사용이 가능하다.
		 */

		
		String strName = "홍길동";
		String strNation = "대한민국";

		
		//문자와 문자열을 구분하는 이유는
		// 문자는 8bit면 되지만
		// 문자열은 더 많은 용량을 차지하기 때문이다.

		/* 문자열은 DQ(")마크로 묶고
		 * 문자는 SQ(')마크로 묶는다
		 */
		char cA = 'A'; //문자
		String sA = "A"; //문자열

	
	}

}
