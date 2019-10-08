package com.biz.classes.arrays;

public class Array_01 {

	public static void main(String[] args) {

		// 문자열을 저장할 메모리 10개를 준비하라
		String[] str = new String[10];
		
		// [배열의 요소를 지정하는 방법]
		// 1.배열[index] 형식으로 지정
		// (("배열첨자" 라고부른다.(Array Index))
		
		
		// 배열의 요소(0번, 1번, 2번)에 값을 저장(할당, 대입) 하기
		str[0] = "대한민국";
		str[1] = "우리나라";
		str[2] = "Republic of Korea";
		
		// 배열의 요소 1번째 위치의 값을 읽어서
		// console에 보이기
		System.out.println(str[1]);
		
		
		/*
		 *  ################################
		 *  str 배열을 10개 선언하였으므로
		 *  index는 0~9까지만 사용 할 수 있다.
		 *  따라서 10번index의 배열요소를
		 *  console에 보이라는 명령을 내리면
		 *  Array Index out of Bounds exception이 발생한다.
		 */
		// System.out.println(str[10]); // 오류 => 배열은 항상 0부터 시작하기 때문에
									// str[10]은 0~9까지만 저장 가능함
									// str[n]은 n-1 까지 저장 가능
		                            //out of bounds
		
		// 정수값을 저장할 메모리 10개를 준비하라
		int[] intNum = new int[10];
		intNum[0] = 10;
		intNum[1] = 30;
		intNum[3] = 40;
		intNum[9] = 100;
		
		System.out.println(intNum[1]); //30

		
		// 실수값을 저장할 메모리 10개를 준비하라
		// float[] floatNum = new float[10];
		
	

		
		
	}

}
