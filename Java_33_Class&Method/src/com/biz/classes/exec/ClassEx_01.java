package com.biz.classes.exec;

public class ClassEx_01 {

	// main()가 있는 class의 멤버변수
	// 변수를 선언
	
	// static으로 설정된 method에서
	// 필드변수에 접근을 하려면
	// 필드 변수도 static으로 선언을 해야한다.
	// String strName = "홍길동";
	static String strName = "홍길동";
	
	// main()는 static method이며
	// 프로젝트가 시작하면 JVM이 제일 먼저  찾아서 실행하는 method == 진입점 method
	public static void main(String[] args) {

		strName = "이몽룡";
		getName(strName);
		
		/*
		 * main()에서 getName()를 호출하면서
		 * strName변수를 파라메터로 전달하였다.
		 * 이때 strName 변수 이름등과는 아무런 상관 없이
		 * strName 변수에 담긴 값만 getName()에 전달된다.
		 * 
		 * 전달된 파라메터값은 getName()의 매개변수에 담겨서 method내부로 복사된다.
		 * getName() 내부에서 strName 변수의 값을 변경해도
		 * main()에서 참조하는 strName변수의 값은 아무런 변동이 없다.
		 * ====> Call By Value
		 */
		System.out.println(strName);   // 이묭룡이 출력됨
	}
	// static으로 선언된 method에서
	// 다른 method를 호출하려면
	// 호출되는 method도 모두 static으로 선언되어야 한다.
	// public void getName(String strName)
	public static void getName(String strName) {
		// String strName 변수를 만들고 대기중...
		strName = "성춘향";
				
		
		
		
	}

}
