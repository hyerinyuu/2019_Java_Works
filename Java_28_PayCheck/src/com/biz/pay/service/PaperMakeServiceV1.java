package com.biz.pay.service;

public class PaperMakeServiceV1 {

	public void make(int pay) {
		
		pay = 3758750; 		 // 월급
		int paper;		    // 매수
		int money = 50000; // 권종
		int sw = 1;	   	  // 권종 바꿔주는 용
		
		while(true) {
			
			if(pay < 5) break; 
			paper = (int)(pay / money);
			System.out.printf("%d원권 : %d매\n", money, paper);
			pay -= paper * money;
			
			if(sw > 0) {
				money /= 5;
			}else {
				money /= 2;
			}
			sw *= (-1);
			
			}
	
		}
}
