package com.biz.blackjackfinal.service;

import java.util.List;
import java.util.Scanner;

import com.biz.blackjackfinal.domain.CardVO;

public class PlayService extends RuleService{

	Scanner scan = new Scanner(System.in);
	CardService cs = new CardService();
	String playName;
	CardVO vo = new CardVO();
	
	
	
	
	
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
			
					if(intMenu == 1) {
						
						// 딜러와 플레이어가 카드 받기
						
					
					}else if(intMenu == 2) {
						
						// 딜러와 플레이어 카드 배분 멈추고 점수계산 후
						// 승패 가르기
						// 딜러 점수 : 
						// 플레이어 점수 : 
						// 누구 승리
						
					}else if(intMenu == 0) {
						
						// 게임 완전히 종료하기
						
					}
				
			}
		}
	
		
	}
	
	
}
