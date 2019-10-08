package com.biz.classes.grade;

/*
 * 어떤 class를 만들고
 * 멤버변수, 메서드에 
 * 한개라도 static 이라는 키워드를 붙이면
 * class가 static class가 된다.
 * 
 * [static class가 된다는 것] (정적메모리)
 * - 프로젝트를 run(컴파일 후 실행)하면
 * JVM이 자동으로 클래스를 선언, 생성, 초기화 하여
 * 사용할 수 있도록 미리 준비시켜준다는 개념
 * 
 */
public class StaticGrade {

	// class 바로 아래 선언한 변수(method가 없음) = 멤버변수
	public static String strName;
	public static String strNum;
	public static String strMain;
	public static int intKor;
	public static int intEng;
	public static int intMath;
	
	public static void sum() {
		// StaticGrade 클래스의 sum() method의 몸체부분
		
		int sum = intKor + intEng + intMath;
		System.out.println("총점 : " + sum);
		
		
	}
	
}
