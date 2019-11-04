package com.biz.thread.classes;

/*
 * 일반적인 SingleTone Class
 * single Thread환경에서는 메모리 절약을 수행하는 목적에 맞지만,
 * 
 * multi thread환경에서는 동기화 문제를 일으키고, 
 * 때로는 singleTone이 아닌 다수의 객체 인스턴스가 생성될 수도 있다.(동기화를 억지로 수행할 경우)
 */
public class SingleClassV1 {

	private static SingleClassV1 singleClassV1 = new SingleClassV1();
	public static int sum;
	
	static {

		// 강제로 동기화를 수행할 경우 다수의 인스턴스가 생성되는 것을 방지하는 코드
		if(singleClassV1 == null) {
			singleClassV1  = new SingleClassV1();
		}
	}
	
	public static SingleClassV1 getInstance() {

		return singleClassV1;
	}
	
}
