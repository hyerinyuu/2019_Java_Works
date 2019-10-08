package com.biz.pay.domain;

	/*
	 * [급여 지급을 위한 화폐 권종 나누기]
	 */
	
public class PaperVO {

	private String money; // 화폐 권종
	private int paper;	// 매수
	
	/*
	 * 기본생성자 : 아무것도 없는 생성자   
	 * 필드생성자 : 필드변수를 주입받아서 값을 설정하는 생성자
	 */
	
	public PaperVO(String money, int paper) {
		// TODO 필드 생성자
		super();
		this.money = money;
		this.paper = paper;
	}

	public PaperVO() {
		super();
		// TODO 기본 생성자
	}
	
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public int getPaper() {
		return paper;
	}
	public void setPaper(int paper) {
		this.paper = paper;
	}
	
	
}
