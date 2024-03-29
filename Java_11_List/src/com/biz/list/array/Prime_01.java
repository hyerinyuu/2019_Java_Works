package com.biz.list.array;

import java.util.Random;

public class Prime_01 {

	/*
	 * 50의 정수형 배열을 생성하고
	 * 각 요소에 1~100까지 임의의 랜덤값을 저장 후
	 * 그 수가 소수인가를 찾아라
	 */
	public static void main(String[] args) {
		
		int[] nums = new int[50];
		
		// 임의 숫자를 생성하기 위해 사용하는 class
		// Random class를 사용할 수 있도록 rnd객체로 생성
		// rnd는 Random class의 method를 호출해서
		// 		연산을 수행하기 위한 대리자
		Random rnd = new Random();
		
		int num = rnd.nextInt(); // 정수 임의 숫자를 생성
		num = rnd.nextInt(100); // 정수 0~99까지 임의의 수 생성
		num = rnd.nextInt(100) +1; // 정수 1~100까지 임의의 수 생성
		
		for(int i = 0 ; i < nums.length ; i++) {
			
			// 1번코드
			int rndNum = rnd.nextInt(100)+1;
			nums[i] = rndNum;
			
			// 2번코드
			nums[i] = rnd.nextInt(100)+1;
			
		}
 		
		for(int i = 0 ; i < nums.length ; i++ ) {
			// System.out.println(nums[i]);
			System.out.printf("%4d", nums[i]);
			if((i+1) % 5 == 0) {
				System.out.println();
			}else {
					System.out.printf(", " );
				}
			}
		
		// 소수를 찾아서 리스트를 보이는 코드
		for(int i = 2 ; i < nums.length ; i++) {
			
			int r = nums[i];
			
			// 만약 nums 배열의 i 위치의 값이 2 미만(0,1)이면
			// 해당 값은 소수 검사를 하지 말고
			// i++를 수행하여 다음번 위치에 있는 값으로 건너 뛰어라
			
			// ex) nums[3]의 값을 1이라고 가정했을때
			// nums[3]의 값은 소수 계산을 하지 않고
			// nums[4]로 넘어가라
			if(r < 2) {
				/*
				 * for, while 등의반복문 내에서
				 * 어떤 이유로든 continue 명령문을 만나면
				 * 그 이후의 코드는 모두 무시하고 건너 뛴다.
				 */
				continue;
			}
			
			int j;
			for(j = 2 ; j < r; j++) {
				if(r % j == 0)  {//한번이라도 true라면 소수가 아님 
					break;
				}
			}
			// 소수이면 break를 만나서 j 반복이 중단
			// 소수가 아니면 break 한번도 만나지 않아서 j 반복이 모두 완료 
			
			if(j >= r) {  // 반복문이 모두 완료
			System.out.println(i + "번째 소수 : " + r);
			} else {
				
			}
			
		}
			 
			 
			 
		 }
		}

