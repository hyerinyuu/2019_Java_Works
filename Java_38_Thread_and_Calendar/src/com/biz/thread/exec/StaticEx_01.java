package com.biz.thread.exec;

import com.biz.thread.classes.StaticClassV1;

public class StaticEx_01 {

	public static void main(String[] args) {

		StaticClassThread_01 sc = new StaticClassThread_01();
		sc.start();
		
		// 공유변수를 사용해 1~100까지 덧셈연산 수행
		StaticClassV1.sum = 0;
		
		for(int i = 0 ; i <= 100 ; i++ ) {
			StaticClassV1.sum += i;
			
		}
		System.out.println("main에서 계산한 합계");
		System.out.println(StaticClassV1.sum);
		
		
	}

}
