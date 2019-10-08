package com.biz.arrays;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] nums = new int[100];
		int sum = 0;
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(10)+1;
			
			if(nums[i]%2 == 0) {
				sum += nums[i];
			}
			System.out.println(sum);
		}
		
	
		
	
		}

}
