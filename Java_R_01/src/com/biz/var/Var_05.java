package com.biz.var;

public class Var_05 {

	public static void main(String[] args) {

		// String ---> int
		// 30이라는 문자열형 변수를 정수형 변수로 변환시켜줌
		int num = Integer.valueOf("30");
		
				
		// 변환 불가
		// ?AAA라는 문자열을 숫자로 바꿀 수 없기 때문에
		num = Integer.valueOf("30AAA");
		
		
		// 변환 불가
		// ? 숫자 앞에 문자가 붙어서
		num =Integer.valueOf("A33");
		
		//변환 불가 ==> blank
		num = Integer.valueOf("33 ");
		num = Integer.valueOf(" 33");
		num = Integer.valueOf("");
		num = Integer.valueOf("3  3");
		num = Integer.valueOf("30 + 40");
		
		
	}

}
