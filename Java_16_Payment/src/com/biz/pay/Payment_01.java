package com.biz.pay;

public class Payment_01 {

	public static void main(String[] args) {

		int pay = 3785870;
		int money = 50000;
		
		int sw = 0; 
		int count;
		
		for(int i = 0 ; i < 8 ; i++) {
			count = pay / money;
			System.out.println( money + "원권" + count + "매");
			pay = pay - (count * money);
			if(sw == 0) {
				money = money/5;
				sw = 1;
			}else{
				money = money/2;
				sw = 0;
			}
			
		}
		
		
		
	}

}
