package com.biz.blackjack.domain;

/*
 * [플레잉카드 제작에 필요한 변수]
 * 
 * 52개의 카드(조커제외)가 한 벌
 * 
 * 4종류의 suit : 빨강(다이아몬드◆, 하트♥) , 검정색(스페이드♠, 클로버♣)
 * 각 suit별로 13가지 종류의 denomination(끝수) 
 * 	숫자/알파벳 : 2~10 / J(Jack) , Q(Queen), K(King), A(Ace)
 * 
 */
public class DeckVO {

	private String suit;  			// 카드 패턴
	private String denomination;  // 카드 숫자
	private int value;  		// 카드 값
	
	
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
	@Override
	public String toString() {
		return "[suit=" + suit + ", denomination=" + denomination + ", value=" + value + "]";
	}
	
	
	
}
