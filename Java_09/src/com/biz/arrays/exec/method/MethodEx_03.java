package com.biz.arrays.exec.method;

import com.biz.arrays.service.MethodPrototype;

public class MethodEx_03 {

	public static void main(String[] args) {

		MethodPrototype mt = new MethodPrototype();
		
		/*
		 * MethodPrototype(mt)클래스에는 view()라는 method가 있을텐데
		 * 아마도 public void view() { } 형식 일 것이다.
		 */
		mt.view();
		
		/*
		 * public int ret() { return 0; } 형식이다.
		 */
		int n = mt.ret();
		
		/*
		 * public void (int num1, int num2) { } 형식일것이다.
		 */
		mt.mret(30,40);
		
		/*
		 * 같은 mret() method를 또다시 호출했는데
		 * 이 호출 명령문에 의해서 mret() method는
		 * public int mret(int num1, int num2) {  return 0; }
		 * method 임이 확인된다.
		 */
		int m = mt.mret(50,30);
		
	}

}
