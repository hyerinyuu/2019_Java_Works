package com.biz.blackjackfinal.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.blackjackfinal.domain.CardVO;

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
	
	public CardVO drawCard() {
		
		
		
		return null;
		
	}
		
	
}
