package com.biz.var;

public class Var_10 {

	public static void main(String[] args) {

		int num = 10;
		
		num = num + 20;
		
		/*
		 * 보기에도 싫지 않고
		 * 메모리를 낭비를 줄일 수 있는 연산 표시방법
		 */
		num += 20; // = num = num + 20; ==> 복합 대입 연산자 교재 80p
		num -= 20; // = num = num - 20;
		num *= 20; // = num = num * 20;
		num %= 20; // = num = num % 20;
		num /= 20; // = num = num / 20;
		
		
	}

}
