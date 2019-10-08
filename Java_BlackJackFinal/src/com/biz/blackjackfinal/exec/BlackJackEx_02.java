package com.biz.blackjackfinal.exec;

import com.biz.blackjackfinal.service.CardService;
import com.biz.blackjackfinal.service.PlayService;

public class BlackJackEx_02 {

	public static void main(String[] args) {

		CardService cs = new CardService();
		PlayService dealer = new PlayService(cs.getCardList(), "딜러");
		PlayService player = new PlayService(cs.getCardList(), "플레이어");
		
		
		
	
		
	}

}
