package com.biz.grade;

import java.util.Random;

public class Array_03 {

	public static void main(String[] args) {

		int[] intNum = new int[50];
		
		Random rnd = new Random();
		
		for(int i = 1 ; i < intNum.length ; i++) {
			
			// 1. 임의 수를 생성해서 직접 intNum의 i번째 요소에 저장
			intNum[i] = rnd.nextInt(100)+1;
			
			// 2.
			// 임의 수를 생성해서 num에 저장했다가 num값을 intNum[i]에 복사
			// int num = rnd.nextInt(100)+1;
			// intNum[i] = num;
	
			}
		for(int i = 1 ; i < intNum.length ; i++) {
		if(intNum[i] % 2 == 0) {
			System.out.printf("%d번째 %d\n", i, intNum[i] );
		}
		
	}

		// 배열에 저장된 요소들 중에
		// 짝수들의 합은 얼마?
		
		int intSum = 0;
		for(int i = 0 ; i < intNum.length ; i++) {
			if(intNum[i] % 2 == 0) {
				intSum += intNum[i];
			}
		}
		System.out.println("짝수들의 합 : " + intSum);
		
		
}
	
	
}