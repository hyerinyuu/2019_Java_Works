package com.biz.pay.exec;

public class PayEx_01 {

	public static void main(String[] args) {

		int pay = 3758750; // 월급
		int sw = -1;	// 권종 바꾸는 용
		int money = 50000; // 화폐 권종
		int paper;		// 화폐 매수
		
		while(true) {
			
			if(pay < 5) break;
			
			paper = (int)(pay / money);
			System.out.printf("%d원권 : %d매\n", money, paper);
			
			pay -= money * paper;
			
			if(sw < 0) {
				money /= 5;
			}else{
				money /= 2;
			}
			sw *= (-1);
			
		}
		
	}

}
