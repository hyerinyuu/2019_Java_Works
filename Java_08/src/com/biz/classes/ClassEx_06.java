package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class ClassEx_06 {

	public static void main(String[] args) {

		/*
		 * 기본형 변수, String형 변수 등은
		 * 배열을 선언만 해도 자체적으로 초기화 하는 코드가
		 * 실행되도록 만들어져있다.
		 * 
		 * 하지만 
		 * 사용자가 만든 클래스는 
		 * 배열을 선언한 후에
		 * 반드시 각요소 모두를 초기화 해야만 
		 * 사용, 접근이 가능하다.
		 */
		
		/*
		 * 현재 이 코드는 배열 100 개의 값을 유지할때는 문제가 없다.
		 * 
		 * 하지만 만약 배열의 개수를 변경하려고 할 경우
		 * 배열의 개수인 100이라는 숫자가 중복으로 사용되어 있는 코드를
		 * 모두 변경해 주어야 하기 때문에 자칫 일부 변경되지 않은 코드가
		 * 있을경우 오류가 발생할 가능성이 있다.
		 * 
		 * 이를 방지하기 위해서
		 * 배열의 개수를 변수로 지정하는 방법이 있다.(nLength)
		 */
		int nLength = 100;
		StudentVO[] stVO = new StudentVO[nLength];
		
		
		// stVO 배열을 모두 초기화 시키는 코드
		// for 반복문을 사용해서 초기화 하는 코드
		for(int i = 0 ; i < nLength; i++) {
			stVO[i] = new StudentVO();
		}
		
		
	
		
	}

}
