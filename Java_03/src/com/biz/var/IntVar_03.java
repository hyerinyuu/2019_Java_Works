package com.biz.var;

public class IntVar_03 {
 
	public static void main(String[] args) {

		int num1 = 0;
		
		num1 = 30 + 40;
		System.out.println(num1); //70
		
		// %연산을 보통 modula 연산이라고 하는데
		// 이는 나머지 연산이라는 뜻이다.
		num1 = 30 % 4;
		System.out.println(num1);
	
		num1 = 57;
		System.out.println("57을 3으로 나눈 몫  : ");
		System.out.println(57 / 3);
		
		System.out.println("57을 3으로 나눈 나머지 : ");
		System.out.println(57 % 3);
		
		
	}
}