package com.biz.blackjack.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.blackjack.domain.CardVO;

public class RuleService {
	
	List<CardVO> playList;
	List<CardVO> deckList;
	String playName;


	public RuleService(List<CardVO> deckList, String playName) {
		this.playList = new ArrayList<CardVO>();
		this.deckList = deckList;
		this.playName = playName;
	}
	// 카드 점수 합계
	public int sumValue() {
		int sumValue = 0;
		for (CardVO vo : playList) {
			sumValue += vo.getValue();
		}
		return sumValue;
	}

	// 딜러의 카드 점수 합이 16을 넘어가면 더이상 카드를 못 받는 룰
	public void hitvoid() {
		
		if (playName.equals("딜러") && this.sumValue() >= 16) {
			System.out.println("딜러점수 : " + this.sumValue());
			System.out.println("딜러 Hit 금지");
		} else {
			playList.add(deckList.get(0));
			deckList.remove(0);
		}
		System.out.println("====================================================");
		System.out.println(playName + " >> ");
		for (CardVO vo : playList) {
			System.out.println(vo);
		}
	}
	
	// 플레이어에 관계없이 카드의 합이 21을 초과하면 지는 룰
	public void overValue() {
		
		
		if(playName.equals("딜러")&& this.sumValue() > 22) {
			
			System.out.println("딜러의 카드 합이 21을 초과했습니다");
			
		}else if(playName.equals("플레이어") && this.sumValue() > 22) {
			System.out.println("플레이어의 카드 합이 21을 초과했습니다");
			
		}else if(playName.equals("딜러") && playName.equals("플레이어") && this.sumValue() > 22) {
			System.out.println("두 플레이어의 카드 합이 모두 21을 초과했습니다");
			return;
		}
		
	}
	
	
}
