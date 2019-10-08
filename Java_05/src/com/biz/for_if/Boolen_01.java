package com.biz.for_if;

public class Boolen_01 {

	public static void main(String[] args) {

		// 자바에서 기본적으로 제공하는 변수 형
		// primitive 변수형
		
		// 변수의 형(type)의 종류
		int intNum = 0;  // 4byte 크기의 값을 저장하는 정수
		long longNum = 0L; // 8byte 크기의 값을 저장하는 정수 
		
		float floatNum = 0.0f; // 정밀도가 일반형인 실수
		double doubleNum = 0.0; // float의 배 정밀도를 갖는 실수
		
		boolean bYes = true; // true, false 만을 갖는 변수
		boolean bNo = false; // 다른 변수형에 비해 변수 자체로써 자주 쓰이지는 않고
							// 다른 연산자들과 묶여서 자주 사용
		bYes = 3 == 3; // 우측에 있는 3 == 3 연산식이 참이냐?(true => ture가 bYes에 저장)
		bNo = 3 > 3; // 우측에 있는 3 > 3 연산식이 참이냐?(false => false가 bNo에 저장)
		bYes = 3 != 3; // 3과 3이 다르냐?, false가 bYes에 저장
		bYes = !bYes; // bYes값을 역전(Inverter, Not 연산)
		
		
		
		char cA = 'A'; // 한개의 문자를 저장, 1byte, 2byte
		
		
		
		// 변수의 기본형이 아니고 class 라는 형태의 특별한 타입
		// 일반 변수와 같은 방법으로 사용하면 됨.
		String strName = "대한민국"; // 문자열을 저장하는 변수
		
		
		int n = 1;
		n *= -1; // n의 값을 -1로 변환
		n *= -1; // n의 값을 다시 1로 변환
		n = -n; // n의 값을 양수와 음수를 역전
		n = -n; // n의 값을 양수와 음수를 역전 
		
		
		


		
		
		
		
		
	}

}
