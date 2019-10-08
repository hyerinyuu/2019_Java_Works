package com.biz.blackjackfinal.exec;

import java.util.Scanner;

import com.biz.blackjackfinal.service.CardService;
import com.biz.blackjackfinal.service.RuleService;

public class BlackJackEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		CardService cs = new CardService();
		cs.makeDeck();

		while (true) {
			System.out.println("========================================");
			System.out.println("BlackJack.v1");
			System.out.println("========================================");
			System.out.println("게임을 시작하고 카드를 받으시려면 아무키나 입력하세요 ");
			System.out.print(">> ");
			String strDraw = scan.nextLine();
			if(strDraw.equalsIgnoreCase(strDraw)) {
				
				RuleService dealer = new RuleService(cs.getCardList(), "딜러");
				RuleService player = new RuleService(cs.getCardList(), "플레이어");

				for (int i = 0; i < 2; i++) {
					
					dealer.hitvoid();
					player.hitvoid();
					
					
					while (true) {
						System.out.println("----------------------------------------");
						System.out.println("1.Hit      2.Stand      0.GameEnd");
						System.out.println("----------------------------------------");
						System.out.print("선택 >> ");
						String strMenu = scan.nextLine();
						
						try {
							int intMenu = Integer.valueOf(strMenu);
							if (intMenu == 0) {
								System.out.println("Game Over");
								return;
								
							}
							if (intMenu == 1) {
								dealer.hitvoid();
								player.hitvoid();
								dealer.overValue();
								player.overValue();
								
							}
							int dSum = dealer.sumValue();
							int pSum = player.sumValue();

							if (pSum > 21) {
								System.out.println("딜러승리");
								break;
							}else if (dSum > 21) {
								System.out.println("플레이어 승리");
								break;
							}else if(dSum == pSum){
								System.out.println("비겼습니다");
								break;
							}
							
							if(intMenu == 2) {
								if(dSum > pSum) {
									System.out.println("딜러승리");
									break;
								}else if(dSum < pSum){
									System.out.println("플레이어 승리");
									break;
								}else if(dSum == pSum) {
									System.out.println("비겼습니다");
									break;
								}
							}
							
						} catch (Exception e) {
							System.out.println("*******************");
							System.out.println("Warning");
							System.out.println("1,2,0 중에 입력하세요");
							System.out.println("*******************");
				}
				
			}
			
			
			
				}

			}

		}

	}

}