package com.biz.method;

public class MethodEx_02 {

	/*
	 * 1. console에 대한민국만세라는 문자열을 10번 출력
	 * 2. 가. consolee에 대한민국만세라는 문자열을 5번 출력,
	 * 	  나. 줄을 하나 표시하고
	 * 	  다. 다시 콘솔에 만세라는 문자열을 3번 출력
	 * 3. 대한민국 문자 대신에 Republic of Korea를 같은 방법으로 console에 출력
	 * 
	 */
	
	public static void main(String[] args) {
		
		// 3번까지 코드를 수행하고 봤더니
		// 또 문자열을 변경할 일이 있을 것 같다.
		
		String strNation = "Republic of Korea";
		
		// 1
		for(int i = 0 ; i < 10 ; i ++) {
			// System.out.println("대한민국만세");
			System.out.println(strNation);
		}
		
		// 2
		for(int i = 0 ; i < 5 ; i ++) {
			// System.out.println("대한민국만세");
			System.out.println(strNation);
		}
		System.out.println("=====================");
		for(int i = 0 ; i < 3 ; i ++) {
			// System.out.println("대한민국만세");
			System.out.println(strNation);
				
		}
	}

}
