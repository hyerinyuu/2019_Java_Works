package com.biz.var;

public class Print_04 {

	public static void main(String[] args) {
		
		System.out.printf("%d\n",3);
		System.out.printf("%d\n",3*3);
		
		// %d와 맞는 변수, 값, 계산식의 수가 같지 않으면
		// 오류남 결과 도출 안됨
		// %d와 %d를 붙여서 이어 쓰거나 띄어서 쓰면
		// 문자열을 붙이는것과 같은 결과가 도출됨
		// ex) %d%d, 3, 3*3 -> 39
		//  	%d   %d, 3, 3*3 -> 3   9 
		System.out.printf("%d %d\n",3, 3*3);
		
	}

}
