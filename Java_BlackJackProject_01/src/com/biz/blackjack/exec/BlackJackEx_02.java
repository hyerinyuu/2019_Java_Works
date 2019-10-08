package com.biz.blackjack.exec;

import com.biz.blackjack.service.CardService;
import com.biz.blackjack.service.PlayService;

public class BlackJackEx_02 {

	public static void main(String[] args) {

		CardService cs = new CardService();
		PlayService dealer = new PlayService(cs.getCardList(), "딜러");
		PlayService player = new PlayService(cs.getCardList(), "플레이어");
		
		dealer.firstCardDraw(cs.getCardList(), "딜러");
		player.firstCardDraw(cs.getCardList(), "플레이어");
		
	
		
	}

}
