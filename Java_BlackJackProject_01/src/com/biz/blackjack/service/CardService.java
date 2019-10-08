package com.biz.blackjack.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.blackjack.domain.CardVO;

public class CardService {

	List<CardVO> cardList;
	String pattern = "◆:♥:♠:♣";
	String cardNum = "A:2:3:4:5:6:7:8:9:10:K:Q:J";
	
	public CardService() {
		// TODO 생성자
		cardList = new ArrayList<CardVO>();
	}

	public List<CardVO> getCardList() {
		
		for(int i = 0 ; i < 51 ; i++) {
			Collections.shuffle(cardList);
		}
		return cardList;
	}
	

	public void makeDeck() {
		
		
		
		String[] getPattern = pattern.split(":");
		String[] getCardNum = cardNum.split(":");
		
		for(String p : getPattern) {
			for(String n : getCardNum) {
				
				CardVO vo = new CardVO();
				vo.setPattern(p);
				vo.setCardNum(n);
				
				int intValue = 0;
				try {
					 intValue = Integer.valueOf(n);
					 if(intValue == 0) intValue = 10;
				} catch (Exception e) {
					if(n.equals("A")) {
						intValue = 1;
					}else { 
						intValue = 10; }
					
				}
				
				vo.setValue(intValue);
				cardList.add(vo);
				
			
			}
			
		}
		
	}
	
	public void viewCardList() {
		
			for(CardVO vo : cardList) {
				System.out.println(vo);
			}
			System.out.println("====================");
			System.out.println("카드매수 : " + cardList.size());
		}
		
		
	
}
