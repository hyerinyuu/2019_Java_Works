package com.biz.var;

public class Var_02 {

	public static void main(String[] args) {

		int num = 30;
		
		// 실수형 변수 f를 선언하고
		// 변수 num에 저장된 값을 변수 f에 복사하라
		// float형 변수는 int형 변수에 비해
		//		더 큰값을 저장할 수 있는 변수이다
		// 그래서 int형 변수에 저장된 값을 float형 변수에
		// 저장을 하면 아무런 문제가 없이 저장이 된다. ==>자동형변환
		// 단 소수점 이하의 .0의 값이 추가되어 저장된다.
		float f = num; // 30.0
		
		
		
		// 앞에서 선언된 정수형 num변수에
		// 앞에서 선언된 실수형 f 변수에 저장된 값을
		// 복사하라  ===> num = f;
		
		// int 변수는 float형 변수와 달리
		// 소수점 이하의 값이 잘리는 형태로 저장이된다.
		// 따라서 만약 float형 변수에 저장된 어떤 값에 소수점 이하의 값이 
		// 존재할 경우 그 값을 잃게된다.
		// 자바는 이런경우를 개발자의 실수라고 생각하고
		// type missmatch exception을 발생한다

		// 만약 소수점이하 값이 필요 없고
		// int형 변수에 float을 저장할 이유가 타당할 경우
		// 강제로 float형 값을 int형 변수에 저장하도록
		// 코드를 작성해주어야한다.
		// 이 코드르 cascading, ====> 강제형변환 이라고 한다.
		
		num = (int)f;
	}

}
