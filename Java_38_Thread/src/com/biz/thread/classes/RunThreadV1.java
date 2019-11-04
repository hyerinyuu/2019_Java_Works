package com.biz.thread.classes;

/*
 * main() method의 흐름과 별도로 
 * background에서 작동하도록 구성할 Class
 * 
 * 1. Background에서 별도의 Thread도 작동하기 위해서는
 * 		Thread 클래스를 상속받아서 클래스를 작성한다.
 */
public class RunThreadV1 extends Thread{

	@Override
	public void run() {

		long sum = 0;
		for(long i = 1 ; i <= 10000000000L; i++) {
			sum += i;
		}
		System.out.println("\n덧셈 수행 결과 : " + sum);
		
		
	}
	
	

}
