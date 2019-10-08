package com.biz.list.array;

public class Array_01 {

	public static void main(String[] args) {

		/*
		 * 리스트(List) : 데이터들의 묶음
		 * 숫자, 문자 등 다양한 종류의 리스트들이 있음.
		 */
		
		// 컴퓨터에서 숫자 리스트를 순서대로 표현하는 방법
		// == console에 숫자 리스트를 순서대로 표시하는 방법
		
		
		// [반복문을 이용하는 방법]
		// 5부터 22까지 숫자를 console에 나열하고싶을 때
		// for 반복문을 사용한다.
		// for(int i = 5; i <= 22; i++){ }
		// ==> i 값이 22까지 i<=22의 조건이 참인 동안 명령문을 반복실행하라.
		for(int i = 5 ; i <= 22;i++) {
			System.out.println(i); 
		}
		
		
		// [배열을 이용하는 방법]
		// 배열을 이용해 어떤 값들을 저장하고 저장된 값들을 표시하는 방법
		
		// 정수형 배열 nums를 선언하고 
		// 요소 100개를 생성하겠다.
		int[] nums = new int[100];
		
		// nums배열의 요소 100개에 어떤 값을 저장하는 법
		nums[0] = 5;
		nums[1] = 6;
		nums[2] = 7;
		nums[10] = 22;
		nums[77] = 1000;
		// ==> nums의 [n]번째 배열에 x값을 저장하겠다.
		
		// nums 배열의 요소에 저장된 값을 이용해서 연산 수행
		
		// 1. console에 표현해보자
		System.out.println(nums[99]);
		System.out.println(nums[77]);
		System.out.println(nums[2]);
		
		// 2. 배열 요소에 저장된 값이 정수형 값이므로
		// 이 값을 읽어서 덧셈 연산을 수행
		int sum = nums[1] + nums[10] + nums[55] + nums[88];
		
		// 3. 배열 요소에 다른 값을 저장
		nums[1] = 99;
		nums[88] = 91;
		
		
		// 4. 배열 요소의 index값을 임의로 지정하지 않고 
		// 배열 요소 전체에 대해서 연산을 수행하는법
		for(int i = 0 ; i < nums.length ; i++) {
			
			System.out.println(nums[i]);
			sum = sum + nums[i]; // == sum +=nums[i]
		}
		
		
		
	}

}
