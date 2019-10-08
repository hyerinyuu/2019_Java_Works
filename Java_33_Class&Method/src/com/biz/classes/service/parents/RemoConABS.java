package com.biz.classes.service.parents;

/*
 * 				[abstract Class] = 추상클래스
 * 
 * 클래스는 클래스인데 미완성된, 모양만 클래스이다.
 * 
 * 주요용도 : 
 * 1. 부모 클래스로서 역할을 수행하는 클래스
 * 	==> (부모클래스 : 주요기능(method)를 미리 만들어 두고
 * 				상속받은 곳에서 method의 기능을 사용하도록 하는 것
 * 				변수들도 선언해 두고 상속받은 곳에서 사용 가능하도록 하는 것)
 * 
 * 2. 인터페이스의 역할도 수행하는 클래스
 *  ==> 아직 주요기능을 구현하지는 않았지만 꼭 필요하니 구현하라는 설계도 역할
 *  
 *  인터페이스에 비해 자유로움 ==> 일반클래스의 역할과 인터페이스의 역할 동시에 가능
 */
public abstract class RemoConABS {

	// 변수선언
	protected String name;

	// 생성자
	public RemoConABS() {
	
		this.name = "나는 리모컨입니다";
	
	}
	
	// method
	public void power() {
		
		System.out.println(name);
	}
	
	public void volUp() {
		System.out.println("볼륨업");
	}
	
	
	// abstract method
	// 인터페이스처럼 구현하지 않은, 미완성된 method == 추상method
	public abstract void volDown();
	
	public abstract void chUp();
	public abstract void chDown();
	
	
}
