package com.biz.list.exec.model;

/*
 * 이몽룡이 최근에 마트를 오픈하기로함
 * 마트에서 판매되는 상품의 거래내용을 관리할 APP을 만들려고 함
 * 거래내용을 관리할 class를 IoListVO로 작성하려고함.
 * 
 * [추상화]
 * 거래일자 : date	String
 * 거래시각 : time  String	
 * 상품이름 : pname	String
 * 상품단가 : price int	
 * 수량 : qty		int
 * 상품금액 : 상품단가 * 수량, total  int
 * 
 */
public class IolistVO {

	private String strDate;
	private String strTime;
	private String strPname;
	private int intPrice;
	private int intQty;
	private int intTotal;
	
	
	// setter()를 이용하지 않고 생성자를 만들어서 값을 주입함
	public IolistVO(String strDate, 
			String strTime, 
			String strPname, 
			int intPrice) {
		
		
		this.strDate = strDate;
		this.strTime = strTime;
		this.strPname = strPname;
		this.intPrice = intPrice;		
	}
	
	// 날짜, 시간, 상품명, 단가, 수량을 매개변수로 받는 생성자
	public IolistVO(String strDate, 
			String strTime, 
			String strPname, 
			int intPrice, int intQty) {
		
		
		this.strDate = strDate;
		this.strTime = strTime;
		this.strPname = strPname;
		this.intPrice = intPrice;	
		this.intQty = intQty;
	}
	
	
	public String getStrDate() {
		return strDate;
	}
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public String getStrTime() {
		return strTime;
	}
	public void setStrTime(String strTime) {
		this.strTime = strTime;
	}
	public String getStrPname() {
		return strPname;
	}
	public void setStrPname(String strPname) {
		this.strPname = strPname;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public int getIntQty() {
		return intQty;
	}
	public void setIntQty(int intQty) {
		this.intQty = intQty;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	
	
	
}
