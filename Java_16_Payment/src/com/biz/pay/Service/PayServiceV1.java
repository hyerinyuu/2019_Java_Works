package com.biz.pay.Service;

import java.text.DecimalFormat;

public class PayServiceV1 {

	private int[] money = new int[] {
			50000, 10000, 5000, 1000, 100, 50, 10};
	
	/*
	 * 화폐 권종에 관계 없이 권종을 배열로 선언하고
	 * 화폐 매수를 계산하는 방법
	 *
	 */
	public void array(int nPay) {
		
		DecimalFormat payform = new DecimalFormat("###,###,###,###");
		String strPay = payform.format(nPay);
		
		DecimalFormat paperForm = new DecimalFormat("###,###");
		
		
		 System.out.println("==================================");
		System.out.printf("급여수령액 : %s\n" , strPay);
		 System.out.println("==================================");
		for(int i = 0 ; i < money.length ; i++) {
			int nCount = nPay / money[i];  // 매수계산
			nPay = nPay - money[i] * nCount;  // 총금액 - (권종*매수)
			//8s ==> 숫자자리수를 8자리로
			System.out.printf("%8s원권 %4d매\n", paperForm.format(money[i]), nCount);
		}
		 System.out.println("==================================");
		
	}
	
	
}
