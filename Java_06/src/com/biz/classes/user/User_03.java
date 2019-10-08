package com.biz.classes.user;

public class User_03 {

	// nCount 변수를 class 아래(public~~)에 선언함
	/*
	 * class 변수 영역(scope) = class 멤버변수 영역
	 */
	// public static int nCount = 0;
	public static void count() {
		
		// nCount() 메서드가 호출될때마다
		// nCount는 새로 생성이 되고 0으로 clear
		int nCount = 0;
		
		nCount ++;
		System.out.println(nCount + "번째 호출");
		
	}
}
