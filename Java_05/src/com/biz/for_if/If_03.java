package com.biz.for_if;

public class If_03 {

	public static void main(String[] args) {

		int num = 33;
		
		// % : x를 n으로 나누고 남은 수가  0이면 짝수, 1이면 홀수
		if(num % 2 == 0 ) 
			System.out.println(num + "는 짝수");
		
		// 보통 한줄인 경우 중괄호를 치지 않으나 헷갈리면 쳐도 됨.
		if(num % 2 != 0) {
			System.out.println((num + "는 홀수"));
		}
			
		/*
		 * 변수 i에 0부터 100까지 숫자를 1개씩 담아서...
		 * 내부로 전달
		 */
		for(int i = 0; i <= 100 ; i++) {
			/*
			 * 변수 i에 담긴 숫자가 짝수이면
			 * i에 담긴 숫자가 짝수라고표시
			 */
			if(i % 2 == 0)
				System.out.println(i + "는 짝수!");
		}
		
		
		
	}

}
