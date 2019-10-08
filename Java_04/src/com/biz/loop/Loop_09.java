package com.biz.loop;

public class Loop_09 {

	public static void main(String[] args) {

		/*
		 * 표준 for 반복문의 실행구조
		 * 1. int i = 0; : 카운트 변수 초기화(최초 1번만 실행)
		 * 2. i < 10 : i 값을 범위 조건과 비교해 
		 *             참이면 system.out.println(i) 명령문 실행
		 * 3. i++ : 카운트 변수 1 증가
		 * 
		 * 1~3 까지 i < 10 이 true인 동안 반복실행
		 */
		for(int i = 0; i < 10 ; i ++) {
			System.out.println(i);
		}
		
		
		System.out.println("=============================");
		int sum = 0;
		for(int i = 1; i <= 10 ; i ++) {
			System.out.println(i);
			sum += i; //sum = sum + i
		}
		System.out.println("1부터 10까지 덧셈 : " + sum);
		
		sum = 0 ;
		int i = 1 ;
		
		sum = sum  + i++; 
		sum = sum  + i++; 
		sum = sum  + i++; 
		sum = sum  + i++; 
		sum = sum  + i++; 
		sum = sum  + i++; 
		sum = sum  + i++; 
		sum = sum  + i++; 
		sum = sum  + i++; 
		sum = sum  + i++; 
		
		System.out.println(sum);
				 
		
		
	}

}
