package com.biz.var;

public class Var_05 {

	public static void main(String[] args) {

		
		// 변수선언할 때 0으로 저장
		// ==> 변수선언과 clear 라고 한다.
		int num1 = 0;
		
		// [변수값의 누적]
		// 수학적으로는 불가능하지만
		// 컴퓨터상에서는 =기호 중심으로 왼쪽부터 연산이 이루어지기 때문에 가능함.
		// 원래 자신에게 저장된 값을 지우고 새로운 값을 저장 가능함(누적)
		/*
		 * ### 1. num1에 저장된 값(0)을 CPU로 복제
		 * 2. 숫자 10을 CPU로 복제
		 * 3. 두 값(0,10)을 덧셈
		 * 4. 그 결과를 num1변수에 저장
		 * ==> num1의 값을 10 증가시켜라###
		 */
		num1 = num1 + 10; // 10
		
		/*
		 * 1. num1에 저장된 값(10)을 CPU에 복제
		 * 2. 숫자 5를 CPU로 복제
		 * 3. 두 값(10, 5)을 덧셈
		 * 4. 그 결과를 num1 변수에 저장
		 * ==> num1의 값을 5 증가시켜라
		 */
		num1 = num1 + 5;  // 15
		System.out.println(num1);
		
	}

}
