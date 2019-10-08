package com.biz.grade;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {

		int[] intKor = new int[5];
		int[] intEng = new int[5];
		
		Random rnd = new Random();
		
	
		for(int i = 0 ; i < intKor.length ; i++) {
			
			// 0 ~ 99까지 숫자 1개만 생성하라
			// rnd.nextInt(100)
			
			intKor[i] = rnd.nextInt(100)+1;
			intEng[i] = rnd.nextInt(100)+1;
			
		}
		System.out.println("---------------------------------");
		System.out.println("  Kor\t  Eng");
		System.out.println("---------------------------------");
		
		int sumKor = 0;
		int sumEng = 0;
		for(int i = 0; i < intKor.length ; i++) {
			sumKor += intKor[i];
			sumEng += intEng[i];
			System.out.println();
		}
		System.out.println("----------------------------------");
	}

}
