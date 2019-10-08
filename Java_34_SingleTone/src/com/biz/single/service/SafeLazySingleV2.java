package com.biz.single.service;

// Thread Safe를 보장하면서 초기화 과정을 좀 더 빠르게 개선한 싱글톤코드
//(SafeSingleClassV1을 개선한 코드 비교해서 보기)

public class SafeLazySingleV2 {

	// volatile : 휘발성이 있는
	// 잘 관리하지 않으면 날아간다 라는 의미
	// Java에서는 이 변수를 JVM 영역에 저장하지 않고
	// 컴퓨터 하드웨어적인 Main memory 영역에 저장해서 운영체제가 관리하도록 함
	// == Java에서 관리 못하겠으니 윈도우가 관리하라는 소리임
	// multi thread에서 성능 향상을 위해서 운영체제 단계에서 메모리를 관리 하겠다라는 의미
	private volatile static SafeLazySingleV2 instance;
	
	private SafeLazySingleV2() {
	}
	
	public static SafeLazySingleV2 getInstance() {
		
		if(instance == null) {
			
			synchronized (SafeLazySingleV2.class) {
				instance = new SafeLazySingleV2();
			}
		}
		return instance;
		
	}
	
}
