package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class ClassEX_04 {

	/*
	 * 클래스를 객체배열로 선언했을 경오
	 * 몇몇 클래스(String 등)을 제외하고는
	 * 객체배열의 요소를 모두 초기화 작업을 해야
	 * 멤버변수 접근(읽기,쓰기), method접근(=호출)이 가능하다.
	 */
	
	public static void main(String[] args) {

		// 1. 객체선언
		StudentVO[] stVO = new StudentVO[10];
		
		// 2. 객체 배열 요소의 초기화를 반드시 수행
		stVO[0] = new StudentVO();
		stVO[1] = new StudentVO();
		stVO[2] = new StudentVO();
		
		// 3. 객체요소의 멤버변수(또는 method)에 접근하기
		stVO[0].strNum = "001";
		stVO[0].strName = "홍길동";
		
		System.out.println(stVO[0].strName);
		
		// 아직 index 6의 요소는 초기화 하지 않았기 때문에
		// 멤버변수에 접근하면 Null Pointer Exception이 발생
		stVO[6].strNum = "002";
				

	}

}
