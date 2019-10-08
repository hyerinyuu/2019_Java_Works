package com.biz.loop;

public class Loop_10 {

	public static void main(String[] args) {

		/*
		 * 두개의 변수(num1, num2)를 선언하여
		 * num1 부터 num2 까지의 덧셈을 계산
		 */
		
		int num1 = 1;
		int num2 = 100;
		
		int sum = 0;
		for(int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.printf("%d 부터 %d 까지의 덧셈 : %d\n",
				num1, num2, sum);
		
	}

}
