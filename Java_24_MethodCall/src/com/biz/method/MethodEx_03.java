package com.biz.method;

import com.biz.method.service.CalcService;

public class MethodEx_03 {

	public static void main(String[] args) {

		// main에서 할 일을을 calcService라는 클래스의 addNum method를 사용해
		// 대신 처리하고자하는것 
		CalcService cs = new CalcService();
		
		for(int i = 0 ; i < 10 ; i++) {
			// calcService에 정의된 addNum() method가 무슨 일을 하는지는 모르겠으나
			// 아무튼 10번 수행하라
			cs.addNum();
		}
		
		for(int i = 0 ; i < 5 ; i++) {
			// calcService에 정의된 addNum() method가 무슨일을 하는지는 모르겠으나
			// 23이라는 정수를 보내주고(method에 주입하고)
			// 아무튼 5번 반복 수행하라
			cs.addNum(23);
		}
		
		// addNum() method가 무슨 일을 하는지는 모르겠으나
		// 32와 55라는 정수를 method에 주입하고 1번 수행하라
		// 실행결과는 보이지 않음
		// 덧셈과 return만하고 console에 보이는 코드가 없으니까
		cs.addNum(32, 55);
		
		// addNum() method가 무슨 일을 하는지는 모르겠으나
		// 32와 55라는 정수를 method에 주입하고 연산을 수행한 후
		// 그 결과를 result라는 변수에 담아라
		int result = cs.addNum(32, 54);
		// result값이 console에 표시 ==> 변수값을 확인하면
		// addNum(int,int)가 무슨일을하는지 대충 짐작 가능함
		System.out.println(result);
		
		
		
	}

}
