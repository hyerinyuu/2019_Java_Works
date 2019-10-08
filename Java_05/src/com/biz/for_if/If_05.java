package com.biz.for_if;

public class If_05 {

	public static void main(String[] args) {

		int num = 33;
		
		/*
		 * if 와 else를 같이 사용하는 명령문
		 * if(조건이 true) true 조건 명령실행
		 * else true 가 아닌 조건 명령실행
		 * 
		 * if 키워드에 수없이 많은 조건 중
		 * 		true 인 경우가 단 1번만 있는 조건
		 * else는 나머지 모든 조건
		 */
		
		//if=num 값이 3의 배수냐?
		if(num % 3 == 0) 
			System.out.println(num + "은 3의 배수");
		
		// if 조건이 아니면(true가 아니면 != false) 
		else
		 System.out.println(num + "는 3의 배수가 아니다");
		
		if(num % 2 == 0)
			System.out.println((num + "는 짝수"));
		
		else
			System.out.println(num + "은 홀수"); 
		//num = 홀수 라고는 표현하면x
		// num % 2가 0이 아닌경우 당연히 홀수겠지만
		// 반드시 홀수일것이다 라고 한정하지 말기
		 	System.out.println(num + "은 짝수가 아니다");
		// if 조건문에 맞춰서 "if조건문이 아니다" 라는 식으로 표현
		
		 	
		// 만약 이경우에서 홀수다라는 말을 꼭 하고싶으면 이런식으로 표현하기
		 if(num % 2 ==1)
			 System.out.println(num + "은 홀수이다");
		 else
			 System.out.println(num + "은 홀수가 아니다");
		
		
	}

}
