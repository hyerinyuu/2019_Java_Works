package com.biz.blackjack.service;

import java.util.List;
import java.util.Scanner;

import com.biz.blackjack.domain.CardVO;

public class PlayService extends RuleService{

	Scanner scan = new Scanner(System.in);
	CardService cs = new CardService();
	String playName;
	
	
	public void firstCardDraw(List<CardVO> deckList, String playName) {
		
		for(int i = 0 ; i < 1 ; i++) {
			
			RuleService dealer = new RuleService(cs.getCardList(), "딜러");
			RuleService player = new RuleService(cs.getCardList(), "플레이어");
			
			System.out.println("------------------------------------------------");
			System.out.println("딜러가 카드를 배분했습니다.");
			playList.add(deckList.get(0));
			deckList.remove(deckList.get(0));
			if(playName.equals("딜러")) {
				System.out.println("딜러 카드의 첫 장은 플레이어에게 오픈됩니다.");
				System.out.println("딜러 >> ");
				for(CardVO vo : playList) {
				System.out.println(vo);
			}
			}else {
				System.out.println("플레이어 >> ");
				for(CardVO vo : playList) {
					System.out.println(vo);
				}
				
			}
		}
		
	}
	
	
	public PlayService(List<CardVO> deckList, String playName) {
		super(deckList, playName);
		
		System.out.println("================================================");
		System.out.println("BlackJack");
		System.out.println("================================================");
		
		while(true) {
			System.out.print("게임을 시작하고 카드를 받으시려면 아무키나 입력하세요 >> ");
			String gameStart = scan.nextLine();
			if(gameStart.equalsIgnoreCase(gameStart)) {
				
				System.out.println("----------------------------------------");
				System.out.println("1.Hit      2.Stand      0.GameEnd");
				System.out.println("----------------------------------------");
				System.out.print("선택 >> ");
				String strMenu = scan.nextLine();
				int intMenu = Integer.valueOf(strMenu);
				
				for(int i = 0 ; i < 1 ; i ++) {
					
					if(intMenu == 1) {
				
					System.out.println("딜러가 카드를 배분했습니다");
					firstCardDraw(deckList, "딜러");
					System.out.println(playName + " >> ");
					System.out.println("------------------------------------------------");
					firstCardDraw(deckList, "플레이어");
					System.out.println(playName + " >> ");
					
					}
				}	
				
			}
		}
	
		
	}
	
	
}
