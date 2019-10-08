package com.biz.arrays;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {

		// int[] : 지금부터 배열을 선언하겠다.
		// 		nums : 배열의 이름은 nums로 하겠다.
		//				new in[100] : 배열을 100개 만들겠다.
		int[] nums = new int[100];
		Random rnd = new Random();
		
		// 1번코드
		// 임의의 수 1개를 생성한 후
		// 100개의 배열에 같은 값을 채워 넣는다.
		// int num = rnd.nextInt(10)+1;
		// for(int i = 0 ; i < nums.length; i++) {
		//	nums[i] = nums;
		// }
		
		// 2번코드
		// nums 배열의 요소들을 임의의 난수로 채우기 위해
		// nums 배열을 for반복문으로 요소들을 순회하면서
		// 생성된 난수로 채워놓는다.
		for(int i = 0 ; i < nums.length; i++) {
			
			// 배열의 개수만큼 계속 반복되는 코드
			// 이때 i값은 0~99-1까지 변한다.

		}
		
		
		// 짝수와 홀수를 저장할 2개의 변수 선언, 초기화
		int evenSum = 0;
		int oddSum = 0;
		for(int i = 0 ; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				evenSum += nums[i];
		} else {
			oddSum += nums[i];
		
		}
			System.out.printf("배열 요소 짝수 : %d, 홀수 : %d\n",
					evenSum, oddSum);
			for(i = 0 ; i < nums.length; i++) {
				System.out.println(nums[i]);
				
				// 한줄에 5개 항목씩 표시하고자 할 때
				// 응용할 수 있는 코드
				// i 값이 1 이상이며 5으 ㅣ배수이면
				// enter문자를 보내서 줄바꿈을 하고
				if((i+1)%5 == 0) {
					System.out.println();
					// 그렇지 않으면 , 를 찍어라
				} else {
					System.out.print(", ");
				}
			}
	}

}
}