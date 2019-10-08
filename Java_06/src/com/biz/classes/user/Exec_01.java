package com.biz.classes.user;

public class Exec_01 {

	public static void main(String[] args) {
		
		/*
		 * 30과 40 두수의 덧셈을 계산하여
		 * 콘솔에 보여주는 코드를
		 * User_01 클래스에 add() 메서드를 생성하고
		 * 그곳에 작성을 한 후
		 * 
		 * main() 메서드 에서는 
		 * User_01.add() 메서드를 호출하여
		 * 실행한다.
		 * 
		 * Method()
		 * 여러개의 명령어, 명령문들을
		 * 하나의 명령어를 사용하는 것처럼
		 * 쓸 수 있도록 하는 기능
		 * 
		 */
		User_01.add(); 
		
		/*
		 * User_02.add() 메서드를 5번 호출
		 */
		for(int i = 0; i < 5; i++) {
			User_02.add();
		}
		
	}

}
