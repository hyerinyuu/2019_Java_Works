package com.biz.blackjackfinal.domain;

public class CardVO {

	private String pattern;
	private String cardNum;
	private int value;
	
	
	public CardVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getPattern() {
		return pattern;
	}


	public void setPattern(String pattern) {
		this.pattern = pattern;
	}


	public String getCardNum() {
		return cardNum;
	}


	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "[" + pattern + cardNum + ", 점수 : " + value + "]";
	}
	

	
}
