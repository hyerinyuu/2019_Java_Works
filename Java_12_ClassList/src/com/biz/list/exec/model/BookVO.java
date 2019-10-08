package com.biz.list.exec.model;

/*
 * 도서정보 관리 어플에서 사용할 클래스
 * 
 * 추상화 단계
 * 1. 도서명 : name, String, strName
 * 2. 저자 : writer, String, strWriter
 * 3. 출판사 : company, String strComp
 * 4. 가격 : price, int, intPrice
 * 5. 출판년도 : year, int, intYear
 * 6. ISBM(International Serial Book Number) : num, String, strNum
 */

// VO : Value Object : 데이터를 담는 최소 클래스
// 					   1권의 도서정보를 담는 바구니 역할을 하는 클래스
// VO 클래스를 만들 때 :
// 1. 추상화 단계 : 어떤 멤버변수(필드)를 만들것인가
// 2. 멤버변수를 선언한다
// 3. 정보은닉 : 멤버변수의 접근 제한자를 private로 선언
// 4. 캡슐화 : 은닉된 멤버변수를 접근할 수 있는 통로를 설정
// 		getter() setter() method를 생성, 선언
// 		만약 vo.strName = "Java" 라는 코드로 
//		vo 클래스의 strName 변수에 Java문자열을 저장하려고 할 때
//		strName 변수를 private으로 만들면
//		setter()method를 통해서 값을 저장해야 한다.
//		즉, vo.setStrName("Java")라는 코드를 사용해야 한다.
//		우리의 목적은 strName이라는 멤버변수에
//		java라는 문자열을 저장하는 것 뿐이다.

//		결국 목적은 하나인지만 변수에 직접 접근하느냐
//		setter() method를 통해서 접근하느냐의 차이이며
// 		vo클래스의 setter()메서드가
//		내부적으로 어떤 일(연산)을 수행하는지
//		몰라도 목적은 달성할 수 있다.
public class BookVO {

	String strNum;
	
	private String strName;
	private String strWriter;
	private String strComp;
	private int intPrice;
	private int intPubYear;
	
	// strNum 변수의 값을 읽기
	// String num = vo.getStrNum()
	public String getStrNum() {
		return strNum;
	}
	
	// setStrNum("9700001")
	// == 멤버변수 strNum = "9700001" 
	public void setStrNum(String strNum) {
		
		// 캡슐화
		// setStrNum() method에 아래와 같은 코드가 있더라도
		// 외부에서는 아무런 관심이 없다.
		// int sum = 30 + 40 + 50 + 60;
		// sum += 30;
		// sum -= 20;
		
		// this.strNum는 멤버변수를 가리킨다.
		//		= strNum 는 매개변수의 값을
		// 					멤버변수에 할당하라
		this.strNum = strNum;
	}
	
	
	
	
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrWriter() {
		return strWriter;
	}
	public void setStrWriter(String strWriter) {
		this.strWriter = strWriter;
	}
	public String getStrComp() {
		return strComp;
	}
	public void setStrComp(String strComp) {
		this.strComp = strComp;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public int getIntPubYear() {
		return intPubYear;
	}
	public void setIntPubYear(int intPubYear) {
		this.intPubYear = intPubYear;
	}
	
	
	
	
	
	
	
	
	
}
