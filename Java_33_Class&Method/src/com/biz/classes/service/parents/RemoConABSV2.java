package com.biz.classes.service.parents;

/*
 * 부모클래스에서 기능을 만들어 자식 클래스에 물려줄 때는
 * method코드를 모두 구현을 하고
 * 기능 구현을 자식 클래스에 일임을 하고자 할때는
 * abstract method 를 선언하여
 * method코드 없이 만들어만둔다.
 * 
 * 자식클래스에서는
 * 부모클래스에 선언된 abstract method는 반드시
 * method 원형(prototype)이라도 생성을 해 두어야만 한다.
 * 즉, 부모클래스에서는 아직 구현되지 않았지만
 * 	   상속받은 자식클래스에서 꼭@@@ 만들어주기를 바라는 method를 미리 정의해두는 것이다.
 * == 추상method
 * 
 */
public abstract class RemoConABSV2 {

	protected String name;

	public RemoConABSV2() {
	
		this.name = "나는 리모컨입니다";
	}
	
	public void power() {
		
		System.out.println(name);
	}

	// 추상 method 들
	public abstract void volUp();

	public abstract void volDown();

	public abstract void chUp();

	public abstract void chDown();

	public abstract void setName(String string);
	
}
