package com.biz.classes.user;

public class User_033 {

	// nCount 변수를 class 아래(public~~)에 선언함
	/*
	 * class 변수 영역(scope) = class 멤버변수 영역
	 * (클래스 아래 모든 영역)
	 * 
	 * class 멤버변수 영역에 선언된 변수는
	 * 최초에 한번 count가 호출될 대 
	 * 선언, 생성, 초기화 된 후
	 * 코드가 더이상 실행되지 않는다.
	 * 
	 * 이 코드에서 count() 메서드가 호출되면
	 * nCount 는 1씩 증가되도록 되어있다.
	 * 
	 * 따라서 프로젝트가 실행되는 동안
	 * count() 메서드를 호출하면 
	 * nCount가 계속 1씩 증가하고
	 * 그 결과가 console에 표시된다.
	 */
	public static int nCount = 0; // => 최초 한번만 선언되고 초기화 => 계속 1이라는 값을 유지함
	public static void count() {
		
		// nCount() 메서드가 호출될때마다
		// nCount는 새로 생성이 되고 0으로 clear
		//int nCount = 0;
		
		nCount ++;
		System.out.println(nCount + "번째 호출");
		
	}
}
