package com.biz.blackjack.exec;

import com.biz.blackjack.service.GameService;

public class BlackjackEx_03 {

	public static void main(String[] args) {
	
		GameService gs = new GameService();
		
		while(true) {
		
			if(!gs.gameStart("플레이어")) break;
			
		}
		System.out.println("GAME OVER");
		
	}
	
	
	
}
