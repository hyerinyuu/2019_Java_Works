package com.biz.classes.exec;

import com.biz.classes.service.ClassServiceV1;

public class ClassEx_02 {

	public static void main(String[] args) {
		/*
		 * 현재 클래스(ClassEx_02)가 아닌 
		 * 다른 클래스(ClassServiceV1)에 있는 method 호출하기 
		 */
		
		// cs 객체 선언하기  ===> 아직 cs객체 사용할 수 *없는* 상태
		ClassServiceV1 cs; 
		
		// cs객체 초기화 or 생성 ==> 'cs는 인스턴스가 되었다' 라고 표현
		// ==> cs객체 사용할 수 *있는* 상태 ==  ClassServiceV1에 선언된 method를 호출할 수 있다
		cs = new ClassServiceV1();
		
		String strName = "홍길동";
		cs.getName(strName);
		
		System.out.println("strName : " + strName);    // 홍길동 이 출력
		
		String[] strNames = new String[2];
		strNames[0] = "이몽룡";
		strNames[1] = "성춘향";
		
		System.out.println("strNames[0] : " + strNames[0]);  // 이몽룡 출력
		System.out.println("strNames[1] : " + strNames[1]);  // 성춘향 출력
		
		// getName(String[] strNames) method 호출하기
		cs.getName(strNames);
		System.out.println("strNames[0] : " + strNames[0]);  // 장보고 출력
		System.out.println("strNames[1] : " + strNames[1]);  // 임꺽정 출력
		
		/*
		 * [JAVA] : c언어의 포인터 개념이 없음(매개변수가 포인터와 비슷한 역할)
		 * 일반변수 : 주소x
		 * 배열/객체/리스트 : 주소△
		 * 
		 * 주소값이 있으면 원래 요소에 저장된 값을 변경하면 그 요소를 가져다 쓴 나머지 method들의 값도 변경됨
		 */
		
				
		
		
	}

}
