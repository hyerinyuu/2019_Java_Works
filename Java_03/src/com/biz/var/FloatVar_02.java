package com.biz.var;

public class FloatVar_02 {

	public static void main(String[] args) {
		
		float fNum = 60.0f;
		
		// [정수 100이 실수로 바뀌어 정수에 저장]
		//실수형 변수에 정수를 저장하면 
		//실수로 변환되어 저장됨.
		fNum = 100;
		System.out.println(fNum); // 100.0
		
		// 정수3이 실수 3.0으로 바뀐 후 30.0 / 3.0 을
		// !!계산한 후!! 결과를 저장
		// [실수와 정수의 연산]
		// 3이라는 값이 실수로 변환되어 저장됨
		fNum = 30.0f / 3;
		System.out.println(fNum);
		
		// 정수 55와 3이 나뉘어지고 결과가 실수로 바뀌어 저장
		// [정수끼리의 연산]
		// 연산이 먼저 이루어 지고 난 후의 결과값이
		// 실수로 변환되어 저장
		fNum = 55 / 3;
		System.out.println(fNum);
		
		// 1. 55가 실수로 변환
		// 2. 55.0 / 3.0이 계산
		// 3. 결과가 변수에 저장
		fNum = 55 / 3.0f;
		System.out.println(fNum);
		

	}

}
