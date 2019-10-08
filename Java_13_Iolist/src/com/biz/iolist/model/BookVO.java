package com.biz.iolist.model;

/*
 * class를 작성할 때 다른 클래스를 extends(상속)받지 않으면
 * 모든 class는 Object(조물주급) class를 자동으로 상속받는다
 * 
 * 따라서 아무 상속도 받지 않은 class들은 
 * 이미 자동으로 설정되어있는 Object의 method를 사용해 (class를 객체로 생성하거나하는)
 * Object를 상속받아 그 method들을 자동으로 상속받아서 사용하는 개념
 */

 /*
  * 생성자 메서드
  * 클래스를 선언하면 매개변수가 없는 생성자가 보이지는 않지만 자동으로 만들어져서
  * 자신이 가지고있는 멤버변수들을 초기화하도록 구성되어있다.
  * 
  * [생성자 method가 하는 기본 일(연산)]
  * 1. class에 선언된 멤버변수(필드)들을 초기화
  *  EX) strName = "";  //  int Price = 0; 
  *  ==> 와같이 생성자 method에 감춰진 채 자동으로 실행된다.
  *  (단, 멤버변수들이 primitive, String 인 경우에만 ==> list나 Array는 xx)
  *  
  */
public class BookVO {

	private String strName;
	private String strWriter;
	private String strComp;
	private int intPrice;
	private int intYear;
	
	/*
	 *  BookVO 클래스를 객체로 생성하면서
	 *  외부에서 전달해준 "이름"을 strName의 매개변수에 받아서 멤버변수를 초기화할때
	 *  strName = ""; 으로 하지 않고
	 *  strName 매개변수에 받은 값으로 초기화를 하고 싶다라는 의미
	 *  new BookVO("Java")형식으로 생성자를 호출하면
	 *  this.strName = "Java" 코드가 실행되도록 하겠다라는 의미
	 *  
	 *  
	 *  **만약 매개변수가 포함된 생성자를 만들게 되면
	 *  최초에 자동으로 만들어지던 생성자 public BookVO() {} 코드가 만들어지지 않는다.
	 */
	public BookVO(String strName) {
		this.strName = strName;
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
	public int getIntYear() {
		return intYear;
	}
	public void setIntYear(int intYear) {
		this.intYear = intYear;
	}
	
	
	
}
