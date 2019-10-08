package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_05 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i = 0 ; i < 67 ; i++) {
			nums.add(rnd.nextInt());
			
		}
		// 전체 리스트를 보고자 할 때 
		int nSize = nums.size();
		for(int i = 0 ; i < nSize ; i++) {
			System.out.println(nums.get(i));
		}
		
		// [확장for, 향상된 for, for Each]
		// nums의 개수만큼 반복문을 실행 하면서
		// nums의 요소를 getter 하여  n변수에 담아라
		// (int n = nums.get(i)가 생략된 형태)
		
		// 이 코드는 nums가 collections 일 때 사용 가능함.
		// 값을 추가할때는 사용 불가능(읽기만 가능하다)
		// ==> 전체 리스트를 읽어서 연산을 수행할 때 사용 가능(부분부분은 불가능)
		for(int n : nums) {
			System.out.println(n);
		}
		
		int sum = 0;
		for(int n : nums) {
			sum += n;
		}
		System.out.println("합계 : " + sum);
		
		// 소수찾기
		for(int n : nums) {
			
			int index;
			for(index = 2 ; index < n ; index++) {
				if(n % index == 0)break;
			}
			// 여기서는 n값이 list가 아니므로 확장 for 사용 불가능
				if(index >= n ) {
					System.out.println(n + "은 소수이다.");
				}
		}
	}

}
