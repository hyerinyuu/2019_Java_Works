package com.biz.forr;

public class For_03 {

	public static void main(String[] args) {

		// 변수 i의 값이 5부터 12-1까지 1씩 증가하는 동안
		// for() {} 코드를 반복 실행하라
		for(int i = 5 ; i <12 ; i++) {
			
		}
		// 변수 i의 값이 10부터 5-1까지 1씩 증가하는 동안
		// for() {} 코드를 반복 실행하라 ====> 불가능(=10 !< 5)
		// 따라서 이 코드는 한번도 실행되지 않음
		for(int i = 10; i < 5 ; i++) {
			
		}
		// 반복실행하고 싶은 문장은 꼭 for문의 {}안에 넣어줘야한다
		// for scope 밖의 문장은 for문의 영향을 받지 않아서
		// 반복실행되지 않는다.
		for(int i = 0 ; i < 10000 ; i++); 
		{
			System.out.println("대한민국");
		}
		
		// if문도 마찬가지임
		if(3 != 3);
		{
			System.out.println("3은 3이 아니다");
		}
	}

}
