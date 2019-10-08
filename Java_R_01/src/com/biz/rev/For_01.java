package com.biz.rev;

public class For_01 {

	public static void main(String[] args) {
		
		/*
		 * ==어떤 값이 0부터 시작해 10-1까지(i<10이니까)
		 * 1씩 증가하는 동안 
		 * 반복적으로 코드를 실행하겠다.
		 */
		for(int i = 0 ; i < 10 ; i++) {
			//  이위치에 있는 코드를 실행
		}
		
		/*
		 * 어떤 값이 0부터 10-1까지
		 * 1씩 증가하는 동안
		 * (== 10번 반복 실행하겠다는 소리임)
		 * 대한민국 문자열을 console에 표시해라
		 * 
		 * ==대한민국 문자열을 console에 10번 표시해라
		 */
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("대한민국");
		}
		
		/*
		 * 변수 i의 값이 0부터 (10-1)까지
		 * 1씩 증가하는 동안 코드를 실행하라
		 */
		for(int i = 0 ; i < 10 ; i++) {
			// 이 위치에 있는 코드를
		}
		/*
		 * console에 0부터 9까지 숫자를 표시하라
		 */
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
		}
		/*
		 * 변수 i가 0부터 (10-1)까지
		 * 1씩 증가하는데
		 * 그 각각의 값을
		 * 변수 num에 계속 더하라 ==> num = 0+1+2+...+9
		 */
		int num = 0;
		for(int i = 0 ; i < 10 ; i++ ) {
			num += i;
		}
		// 앞에서 선언된 변수 num에 정수 1을 저장하라
		num = 1;
		
		/*
		 * 변수 i가 1부터 (10-1)까지 증가하는데
		 * 그 값을 계속해서 num에 곱하여 저장하라
		 * 
		 * num = 1*1*2*3*...*9
		 * (곱하기 할때는 변수를 1로 선언해야함 ==> 0곱하면 다 0되니까)
		 */
		for(int i = 1 ; i < 10 ; i++) {
			num *= i;
		}
		// 앞의 for 반복문에서 계산한 결과가 담겨 있는
		// 변수 num값을 읽어서 console에 보여라
		System.out.println(num);
		
		
	}
}
