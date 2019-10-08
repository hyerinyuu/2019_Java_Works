package com.biz.forr;

public class For_02 {

	public static void main(String[] args) {

		int num = 100;
		// 변수 i 값이 0부터 num-1까지 1씩 증가하고있다.
		// 변화되는 i값을 console에 보여라
		for(int i = 0 ; i < num ; i++) {
			System.out.println(i);
		}
		
		// 변수 n의 값이 0부터 10-1까지 1씩 증가하고 있다.
		// 변화되는 n값을 변수 num에 계속 더하라
		// num == 100+1+2+3+...9
		for(int n = 0 ; n < 10; n++) {
			num += n;
			System.out.println();
		}
	}

}
