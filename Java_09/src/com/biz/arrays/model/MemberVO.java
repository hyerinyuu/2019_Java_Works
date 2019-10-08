package com.biz.arrays.model;

public class MemberVO {

	public String strName;
	public String strTel;
	
	/*
	 * MemberVO의 멤버변수중 intAge는
	 * 나이를 보관하는 정수형 변수이다.
	 * 데이터를 저장(보관)할때
	 * 만약 실수로 실제 나이범위를 벗어나게 저장하면
	 * 나중에 연산을 수행할 때
	 * 문제를 일으킬수도있다.
	 * 
	 * 이럴때 멤버변수를 private으로 선언하고
	 * method()를 통해서 값을 저장하는 방법을 쓰면 
	 * 문제를 줄일 수 있다.
	 */
	private int intAge;
	
	// 외부에서 intAge 값을 읽을 때 사용할 method(보통 접두사를 get으로 씀)
	public int getIntAge() {
		return intAge;
	}
	// 이 method는 외부에서 intAge 값을 저장(할당)할 때 사용한다.
	// 외부에서 setIntAge()를 호출할 때
	// ()안에 int형 값을 포함해서 호출을 하면
	// 아래 int intAge로 선언된 변수가 그 값을 수신한다.
	
	// (somthing.파란글씨 = 멤버변수)
	// 수신하여 intAge 변수에 저장된 값은
	// this.intAge 멤버변수에 다시 저장된다.
	public void setIntAge(int intAge) {
		
		// 보통 void문에 return을 사용할 필요가 없지만
		// 이 경우 return문이 유효성검사를 위해 쓰였다.
		// if문이 true일때 값을 저장하지 않고 연산을 끝내버린다.
		// break문과 같이 쓰인다.(조건에 맞지 않으면 값을 저장하지 마라)
		// (=나이값이 1~120세 범위에서 벗어나면 저장되지 않게 미연에 막아줌)
		// ########################
		// 이 methods는 사용자에 의해
		// 나이 멤버변수에 값을 저장하려고 할 때
		// 유효한 범위의 값인지 미리 검사하고
		// 그렇지 않으면 저장을 거붛나다.
		// 나중에 값을 조회했을때 해당 값이 0으로 나타나면
		// 다른 값일때보다 구분이 쉬워서
		// 오류 확률을 줄일 수 있다.
		// 이러한 코드를 "유효성검사코드" 라고 한다.
		// 주 목적은 intAge에 잘못된 데이터가 저장되는것을 미리 막는데 있다.
		// #########################
		if(intAge < 0) {
			System.out.println("나이는 0세 이상이어야 합니다.");
			return ;
		}
		if(intAge > 120) {
			System.out.println("나이는 120세 이하여야 합니다.");
			return ;	
		}
		
		this.intAge = intAge;
	}

}
