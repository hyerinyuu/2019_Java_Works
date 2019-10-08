package com.biz.grade;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {

		int[] intNum = new int[50];
		Random rnd = new Random();
		int sum = 0;
		// int avg = 0;
		for(int i = 0; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(100)+1;
			// intNum의 i번째 값을 읽어서
			// intSum에 (계속) 더하라 
			 sum += intNum[i]; 
		}
		
		// avg = sum / intNum.length;
		System.out.println("임의의 값 100개의 총 합계 : "+ sum);
		System.out.println("임의의 값 100개의 합계의 평균 : " + sum / intNum.length);
		
	}

}
