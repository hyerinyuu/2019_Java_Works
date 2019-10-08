package com.biz.classes.string;

public class String_03 {

	public static void main(String[] args) {

		//[Java_05_;String_01 정답 최종]
		// char = cA 와 index ++; 합치기
		// 
		String strNation = "Republic of Korea";
		
		// 문자열의 길이(개수)를 확인해서
		// 변수 intLength에 저장
		int intLength = strNation.length();
		
		char cSearch = 'u';
		int index = 0;
		
		// i = 0; int < ~~~~는
		// 0번째 부터 'intLength-1'번째 까지 라는 조건이
		// 만족하는 동안 반복실행하겠다.
		for(int i = 0; i < intLength; i++ ) {
		
		char cA = strNation.charAt(i);
		
		// if(cA == ~~~ => x가 
		if(cA == cSearch)  // = if(cA == 'u')와 같지만 cSearch라는 변수를 활용함으로써
						// 변수값을 간편하게 바꿔서 실행시킬 수 있음
			System.out.println(i + " 번째 위치에 있음");
		}
		
	}

}
