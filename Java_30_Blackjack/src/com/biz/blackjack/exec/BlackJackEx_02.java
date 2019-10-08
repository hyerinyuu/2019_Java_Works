package com.biz.blackjack.exec;

import java.util.List;

import com.biz.blackjack.domain.DeckVO;
import com.biz.blackjack.service.DeckServiceV1;
import com.biz.blackjack.service.PlayerServiceV1;

public class BlackJackEx_02 {

	public static void main(String[] args) {

		DeckServiceV1 ds = new DeckServiceV1();
		
		// 카드를 만들어서 만든 카드 추출해오기
		ds.makeDeck();
		List<DeckVO> deckList = ds.getDeck();
		
		PlayerServiceV1 딜러 = new PlayerServiceV1(deckList);
		PlayerServiceV1 플레이어 = new PlayerServiceV1(deckList, "플레이어");
		
		딜러.hit();
		플레이어.hit();
		
		딜러.hit();
		플레이어.hit();
		
		if(딜러.sumValue() < 17) 딜러.hit();
		플레이어.hit();
		
		if(딜러.sumValue() < 17) 딜러.hit();
		플레이어.hit();
		
		if(딜러.sumValue() < 17) 딜러.hit();
		플레이어.hit();
		
		
	}

}
