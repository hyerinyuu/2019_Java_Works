package com.biz.blackjack.service;

import java.util.List;
import java.util.Scanner;

import com.biz.blackjack.domain.DeckVO;
import com.biz.blackjack.utils.BlackjackUtils;

public class GameService {

	
	DeckServiceV1 ds;
	List<DeckVO> deckList;
	Scanner scanner;
	
	public GameService() {

		ds = new DeckServiceV1();
		ds.makeDeck();
		
		deckList = ds.getDeck();
		scanner = new Scanner(System.in);
		
	}
	
	public boolean gameStart(String playName) {
		
		System.out.println(BlackjackUtils.getStringLong("=", 50));
		System.out.println("Game Start");
		System.out.println(BlackjackUtils.getStringLong("=", 50));
		
		PlayerServiceV1 딜러 = new PlayerServiceV1(deckList);
		PlayerServiceV1 플레이어 = new PlayerServiceV1(deckList, playName);
		
		for(int i = 0 ; i < 2 ; i++) {
			딜러.hit();
			플레이어.hit();
		
		}
		
		// 만약 딜러의 점수가 16점 이하이면 의무적으로 딜러 한번 더 히트
		딜러.hit();
		
		while(true) {

			// if(플레이어.sumValue() > 21) break;
			if(플레이어.sumValue() > 21) {
				System.out.println("딜러 승리");
			}
			if(딜러.sumValue() > 21) {
				System.out.println("플레이어 승리");
				System.out.println("아무키나 누르세요...");
				scanner.nextLine();
			}
			

			
			
			System.out.println("====================================");
			System.out.println("1.hit	2.stand		3.close game");
			System.out.println("====================================");
			System.out.print("선택 >> ");
			String strM = scanner.nextLine();
			int intM = Integer.valueOf(strM);
			
			if(intM == 1) {
				플레이어.hit();
				딜러.hit();
			}else {
		
				// 점수계산
				if(플레이어.sumValue() == 딜러.sumValue()) {
					System.out.println("동점으로 딜러 승리!!!");
					} else if (플레이어.sumValue() > 딜러.sumValue()) {
						System.out.println(playName + "승리");
					} else {
						System.out.println("딜러 승리");
						
					}
					System.out.println(BlackjackUtils.getStringLong("*", 50));
					System.out.println("딜러점수 : " + 딜러.sumValue());
					System.out.println("플레이어 점수 : " + 플레이어.sumValue());
					System.out.println(BlackjackUtils.getStringLong("*", 50));
					if(intM == 2) return true;
					else if(intM == 3) return false;
					
				}
						}
	
			}
	
}
