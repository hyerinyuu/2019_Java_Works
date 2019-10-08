package com.biz.var;

public class Var_01 {

	/*
	 * class에 main() method가 있으면
	 * main() method에 작성된 코드가 직접 실행된다.
	 */
	public static void main(String[] args) {

		// 숫자변수에 0을 저장하는 것 == clear
		// ==> 처음에 변수에 어떤 값을 저장해야할지 결정되지 않았을때
		//		혹시 모를 변수를 읽을때 발생할 오류를 방지하는 목적.
		int num = 0;
		float f = 0;
		long l = 0;
		double d = 0;
		
		// 문자열 변수에 ""을 저장하는 것
		// == clear
		String str = " ";
		Boolean b = true;
	}

}
