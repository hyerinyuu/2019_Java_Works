package com.biz.pay;

/*
 * 화폐 매수 계산
 */
public class Payment {

	public static void main(String[] args) {

		int pay = 3785870;
		int mo = 50000;
		
		// pay를 지급하기 위해 필요한 5만원권 매수
		int count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 5만원권 매수를 제외한 금액
		
		
		//pay의 5만원권 매수를 제외한 나머지 금액을 지급하기 위해 필요한 만원권 매수
		mo = mo / 5; // 10000
		count = (int)(pay/mo); // 필요한 1만원권 매수
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; //만원권 매수 제외한 금액
		
		// 5천원권 매수
		mo = mo / 2; // 5000
		count = (int)(pay/mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 5천원권 제외 금액
		
		mo = mo / 5;
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 1천원권 제외 금액
		
		mo = mo / 2; // 500
		count = (int)(pay/mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 5백원권 제외 금액
		
		mo = mo / 5;
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 1백권 제외 금액
		
		mo = mo / 2; // 500
		count = (int)(pay/mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 5십원권 제외 금액
		
		mo = mo / 5;
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 1십원권 제외 금액
		
		mo = mo / 2; // 500
		count = (int)(pay/mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 5십원권 제외 금액
		
		mo = mo / 5;
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 
		
		mo = mo / 2; // 500
		count = (int)(pay/mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // devide by zero exception
		
	}

}
