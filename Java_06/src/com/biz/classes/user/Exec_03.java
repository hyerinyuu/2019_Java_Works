package com.biz.classes.user;

public class Exec_03 {

	public static void main(String[] args) {

		// User_03.count() 메서드를 10번 호출하라
		for(int i = 0 ; i < 10 ; i ++) {
			User_03.count();
		}
		// User_03의 nCount 변수가 count 밖에서 실행되서
		// 최초 한번만 실행하고 계속 0의 값을 유지해
		// 0+1만 반복해서 계속 "1번째 호출"이라는 값만 실행함
		
		System.out.println("==========================");
		// User_033.count() 메서드를 10번 호출하라
		for(int i = 0; i < 10 ; i++) {
			User_033.count();
		}
		for(int i = 0; i < 10 ; i++) {
			User_033.count();
		}
		
	}

}
