package com.biz.for_if;

public class If_01 {

	public static void main(String[] args) {

		// for( 처음한번 ; 조건 ; 증가) {명령문들...}
		
		// 조건연산문이 ture 일 경우만,
		// ()괄호안에 따라오는 명령문을 실행할 수 있다.
		if(3 == 3) System.out.println("3은 3이다!!"); // 참이므로 실행
		if(3 > 3) System.out.println("3이 3보다 크다!!"); // 결과가 거짓이므로 실행x
		if(3 != 3) System.out.println("3은 3이 아니다!!"); // 결과가 거짓이므로 실행x
		
		if (3==3) {
			System.out.println(("3은 3이다!!"));
			System.out.println("물은 물이다!!");
			System.out.println("산은 산이다!!");
			System.out.println("하늘은 하늘이다!!");
			
		}
		
		
	}

}
