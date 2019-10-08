package com.biz.blackjack.exec;

import java.util.List;

import com.biz.blackjack.domain.DeckVO;
import com.biz.blackjack.service.DeckServiceV1;

public class BlackjackEx_01 {

	public static void main(String[] args) {

		DeckServiceV1 deck = new DeckServiceV1();
		deck.makeDeck();
		List<DeckVO> deckList = deck.getDeck();
		for(DeckVO vo : deckList) {
			System.out.println(vo);
		}
		
		
	}

}
