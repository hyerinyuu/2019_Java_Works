package com.biz.loop;

public class Boolen_01 {

	public static void main(String[] args) {

		boolean bYes = 3 == 3;
		System.out.println(bYes);
		
		bYes = 4 == 4; // 같냐? true
		bYes = 4 > 4; // 보다 크냐 ? false
		bYes = 4 >= 4; // 같거나 크냐? true
		
		// 5가 5와 같거나(OR) 4가 4와 같냐?
		// || = OR
		bYes = 5 == 5 || 4 == 4; // true
		bYes = 5 > 5 || 4 == 4; // true or false = true
		bYes = 5 >= 5 || 4 > 4; // true or false = true
		
		// 5가 5와 같으며 4와 4가 같냐
		// && = AND
		bYes = 5 == 5 && 4 == 4; // true
		bYes = 5 > 5 && 4 == 4; // False
		bYes = 5 >= 5 && 4 > 4; // False

		// 5가 4보다 작거나 같냐?
		bYes = 5 <= 4; // False
		bYes = 3 < 4;  // True

		// 3과 4가 같지 않냐 = 다르냐?
		bYes = 3 != 4; // True <>
		System.out.println(bYes);
		
		int n = 1; 
		n = n * -1; // -1
		n = n * -1; // 1
		n = n * -1; // -1
		n = n * -1; // 1
		
		// [NOT 연산]
		// 원래 값을 반전 시키는 역할을 함
		bYes = !bYes; // 현재 bYes의 값이 ture인 상태에 NOT 연산으로 원래 값을 반전함
		// 계속해서 연산하게 되면 true 와 false가 반복되게 됨
		bYes = !bYes; // False
		bYes = !bYes; // True
		bYes = !bYes; // False
		bYes = !bYes; // True
		bYes = !bYes; // False
		
	
	
	}

}
