package com.biz.grade;

import java.util.Random;

public class Array_04 {

	public static void main(String[] args) {

		int[] intNum = new int[50];
		
		Random rnd = new Random();
		
		for(int i = 2 ; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(100) +1;
			
			int index;
			for(index = 2; index < i ; index++) {
				if(i % index == 0) break;
				
			}
			if(index >= i)
				System.out.println("소수 : " + i);
		}
			
		}
		
			
		
		
	}


