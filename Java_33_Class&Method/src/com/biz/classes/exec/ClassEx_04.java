package com.biz.classes.exec;

public class ClassEx_04 {

	public static void main(String[] args) {

		int[] nums = new int[2];
		nums[0] = 40;
		nums[1] = 50;
		
		System.out.printf("nums[0] : %d, nums[1] : %d\n", nums[0], nums[1]);
		swap(nums);
		System.out.printf("nums[0] : %d, nums[1] : %d\n", nums[0], nums[1]);
		
		
	}

	/*
	 *  [Call By Reference]
	 *  method에서 매개변수로
	 *  [배열, 객체(=vo들)(일반변수, String, Integer등은 제외), 리스트] 를 받은 후,
	 *  각 요소들의 값을 변경하면
	 *  전달한 쪽 원본 데이터의 값도 같이 변경이 된다.
	 *  == BlackJack project 코드 짜임 원리
	 *  
	 *  
	 *  [Call By Value 개념] 
	 *  단,
	 *  method에서 new 키워드로 재 생성을 하면
	 *  원본이 저장된 공간과 전혀 다른 별도의 저장공간이 새로 생성되어
	 *  원본의 변수와 변수의 이름이 같다고 해도 원본과는 다른 변수가 되어 
	 *  원본값을 변경해도 원본값에는 변동이 없다 = 영향을 미치지 않는다.
	 *  method가 사용되는 동안 원본은 잠시 감춰졌다가
	 *  method의 사용이 끝나면 변수가 삭제되고 감춰진 원본이 다시 나옴 
	 *  
	 */
	public static void swap(int[] nums) {
		// 매개변수로 전달받은 nums를 새로운 객체로 선언하고 값을 저장함
		// method에서 매개변수로 전달받은 요소를 바꾸면  
		nums = new int[2];
		nums[1] = 100;
		nums[0] = 200;
	}


}
