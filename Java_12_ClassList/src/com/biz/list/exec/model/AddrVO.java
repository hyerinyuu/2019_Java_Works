package com.biz.list.exec.model;


/*
 * 고객관리 APP을 만드는데
 * 고객의 주소록을 관리하는 class를 디자인 해보자
 * 
 * 이름, name String,	strName
 * 주소, addr String,	strAddr
 * 전화번호. tel String,	strTel
 * 핸드폰번호, hp String,	strHP
 * 
 * 포인트, point int,	intPoint
 * 
 */
public class AddrVO {

	private String strName;
	private String strAddr;
	private String strTel;
	private String strHP;
	
	private int intPoint;

	
	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	
	public String getStrAddr() {
		return strAddr;
	}

	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	

	public String getStrTel() {
		return strTel;
	}

	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}

	public String getStrHP() {
		return strHP;
	}

	public void setStrHP(String strHP) {
		this.strHP = strHP;
	}

	public int getIntPoint() {
		return intPoint;
	}

	public void setIntPoint(int intPoint) {
		this.intPoint = intPoint;
	}
	

}
