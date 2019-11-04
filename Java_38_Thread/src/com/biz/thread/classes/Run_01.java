package com.biz.thread.classes;

/*
 * Thread 클래스를 디자인 할 때 Thread 클래스를 상속 받아서 사용한다.
 * 하지만 이 방법은 다른 클래스(jdk, 3rd, 사용자 정의)를 상속받을 수 없게 한다.
 * 
 * 그래서 Thread클래스를 상속받지 말고
 * Runnable interface를 implement하여 Thread 클래스를 디자인 하는 것이 좋다.
 */
public class Run_01 implements Runnable{

	@Override
	public void run() {

		long start = 1;
		long end = 10000000000L;
		long sum = 0;
		for(long i = start ; i <= end; i++) {
			sum += i;
		}
		System.out.printf("\n %d ~ %d까지 덧셈 수행 결과 : %d", start, end, sum);
		
	}

	
	
	
}
