package com.biz.var;

public class IntVar_05 {

	public static void main(String[] args) {
		
		// 한번 선언된 변수는 마지막 값만 유지한다 
		// 코드는 위에서 아래 방향으로 한줄씩 
		// 해석되고 실행된다.
		// 따라서 가장 마지막에 num = 9999 라는
		// 명령문이 있지만
		// 중간중간에 num1 값을 확인하면 9999가 아닌
		// 값이 출력된다.
		int num1 = 0;
		System.out.println(num1); // 0
		num1 = -100;
		System.out.println(num1); // -100
		num1 = 200;
		System.out.println(num1); // 200
		num1 = 9999;
		System.out.println(num1); // 9999
		
		

	}

}
