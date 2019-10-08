package com.biz.single.service;

/*
 * 현재 생성한 싱글클래스는
 * thread 환경에서 매우 불안전한 상태로 존재한다(static을 사용해서)
 * 이런 상태로 싱글톤클래스를 사용하게 되면
 * 프로젝트 전반에 많은 문제를 야기할 수 있다.
 */

public class SingleClassV1 {

	
	// [SingleTone 기본 패턴]
	/*
	 * 프로젝트가 시작될 때 
	 * 자신(SingleClassV1)을 myObject 라는 이름의 인스턴스로 생성해둬라
	 */
	// 자기 자신을 type으로 한 myobject를 생성자를 사용해서 static으로 만들어둠
	private static SingleClassV1 myObject 
			= new SingleClassV1();
	
	/*
	 * class생성자를 private로 선언하여
	 * new SingleClassV1() 생성자 코드를 사용할 수 없도록 함.
	 */
	private SingleClassV1() {
		// this.myObject 
		}
	
	public static SingleClassV1 getInstance() {
		return myObject;
	}
	
}
