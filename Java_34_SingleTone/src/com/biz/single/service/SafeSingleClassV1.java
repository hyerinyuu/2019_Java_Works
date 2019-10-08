package com.biz.single.service;

public class SafeSingleClassV1 {

	private static SafeSingleClassV1 myObject;
	
	// 변수생성
	private String name;
	private String nation;
	
	
	// 이생성자는 딱히 하는일은 없고 못쓰게만 만듦
	private SafeSingleClassV1() {
		
	}
	// getInstance()에 synchronized 키워드를 추가함으로써
	// 이 싱글톤 클래스는 Thread Safe상태가 된다.
	// 이러한 코드를 보고 게으른 초기화코드라고 하는데,
	// 코드 실행 속도가 상당히 느리기 때문이다.
	// (동시사용자가 많을 경우 전체 서버 실행시간이 상당히 느려짐)
	public static synchronized SafeSingleClassV1 getInstanse() {
		// myObject가 만들어져있는데 또 만들경우를 대비
		if(myObject == null)
			myObject = new SafeSingleClassV1();
		
		return myObject;
	}

	// 변수 세팅하는 setter 
	public void setName(String name) {
		this.name = name;
		
	}
	// getter만들고 값 return
	public String getName() {
		return this.name;
	}
	
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	public String getNation() {
		return this.nation;
	}
	
}

