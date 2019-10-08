package com.biz.blackjack.service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.biz.blackjack.domain.DeckVO;

/*
 * 실제 게임에서 사용할 1벌의 게임 카드 생성하는 class
 */
public class DeckServiceV1 {
	
	// 생성된 1벌의 카드를 List 에 저장
	List<DeckVO> deckList;
	
	String suit = "다이아몬드(◆):하트(♥):스페이드(♠):클로버(♣)";
	/*
	String [] arrSuit = new String[] 
			{
			"다이아몬드(◆)",
			"하트(♥)",
			"스페이드(♠)",
			"클로버(♣)"
			};
			*/
	String denomination = "A:2:3:4:5:6:7:8:9:10:K:Q:J";

	
	public DeckServiceV1() {
		this.deckList = new LinkedList<DeckVO>();
	}
	
	public List<DeckVO> getDeck() {
		
		
		// 셔플 첫번째 방법
		int nSize = this.deckList.size();
		for(int i = 0 ; i < nSize; i++ ) {
			Collections.shuffle(this.deckList);
		}
		
		// 셔플 두번째 방법
		for(DeckVO vo : deckList) {

			Collections.shuffle(this.deckList);
		}
		return this.deckList;
	}
	
	public void makeDeck() {
		
		String[] suits = suit.split(":");
		String[] denoms = denomination.split(":");
		for(String s : suits) {
			for(String d : denoms) {
				
				// 각 카드가 가지게 될 Value값 생성(denoms기준)
				// 2~9 : 숫자가 가지는 값 그대로가 점수
				// A : 1
				// J,Q,K : 10
				
				int intValue = 0;
				
				try {
					// 숫자 2~9, 0까지는 각 각 값들이 정수로 정상 변환이 됨.
					// 하지만 A,JKQ는 EXCEPTION이 발생함
					intValue = Integer.valueOf(d);
					
				} catch (Exception e) {
					if(d.equals("A")) {
						intValue = 1;
					}else{
						intValue = 10;
					}
					
					DeckVO dVO = new DeckVO();
					dVO.setSuit(s);
					dVO.setDenomination(d);
					dVO.setValue(intValue);
					
					deckList.add(dVO);
				}
				
				
			}
		}
		
	}
	

	
	
}
