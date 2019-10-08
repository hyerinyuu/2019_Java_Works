package com.biz.for_if;

public class If_04 {

	public static void main(String[] args) {

		/* 1부터 100까지의 숫자 중에서
		 * 짝수의 합을 구하시오
		 */
		
		// int = 합을 저장할 변수를 선언 및 초기화
		int sum = 0;
		
		// for = 숫자를 1부터 100까지 나열
		for(int i = 1; i <= 100; i++) {
			
			// if = 나열된 숫자가 짝수인가?
			if(i % 2 == 0) // (짝수라면) i 값을 어딘가에 계속 덧셈(누적)
			
				// if가 ture라면 sum 변수에 덧셈(누적)
				sum += i;
			
		}
		System.out.println("1부터 100까지 숫자중 짝수의 합 : " + sum);
		
		// int sum = 0;
		// for(int i = 1; i <= 100; i++) {
		//	if(i % 2 == 0)
		//	sum += i;
		// System.out.println("1부터 100까지 숫자중 짝수의 합 : " + sum);
		// }
		// 이 경우에는 sysout이 if가 실행되는 scope안에 위치하고
		// 실행 과정이 쭉 보이고
		// sum이 if scope 바깥에 위치하고
		// sysout이 if scope 바깥에 위치했기 때문에
		// if문이 끝나서 if가 실행되지 않고 결과값만 출력됨
	}
		
		
		
	}


