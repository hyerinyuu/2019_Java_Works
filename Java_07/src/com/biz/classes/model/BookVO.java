package com.biz.classes.model;

/*
 * ~~VO class
 * [Value Object class]
 * 	정보처리를 할 때 기본적인 데이터(멤버변수)의 묶음을
 * 	처리할 때 사용하는 클래스
 */
public class BookVO {

	public String strTitle;
	public String strComp;
	public String strAuth;
	
	public int intPrice;
	
	// 데이터를 처리하는 과정에서
	// 각 멤버변수에 값을 저장하고 처리하는데
	// 어떤 문제가 발생했을 경우
	// 멤버변수에 값이 정확히 저장되었나를 확인 하는 용도
	public void view() {
		System.out.println("도서명 : " + strTitle);
		System.out.println("출판사 : " + strComp);
		System.out.println("저자 : " + strAuth);
		System.out.println("가격 : " + intPrice);
	}
	// 여러 도서정보 리스트를 확인할 때 사용할 method
	public void list() {
		System.out.printf("%s\t%s\t%s\t%d\n",
				strTitle,
				strComp,
				strAuth,
				intPrice);
	}
}
