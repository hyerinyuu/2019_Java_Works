package com.biz.pay.Service;

import java.text.DecimalFormat;

/*
 * PayServiceV1을 상속받아서
 * PayServiceV1에서 작성된 array(int pay) method를 사용 가능
 */
public class PayServiceV2 extends PayServiceV1 {
	
	/*
	 * protected로 선언한 멤버변수는 
	 * 이 클래스(PayServiceV2)를 상속받은 클래스들에서 접근하여 사용가능
	 */
	protected int nMoney = 50000;
	protected DecimalFormat payform = new DecimalFormat("###,###,###,###");
	protected DecimalFormat paperForm = new DecimalFormat("###,###");
	
	
	/*
	 * [화폐 매수 구하기]
	 * while 반복문을 사용해서 구현하는 법
	 */
	 public void whilePay(int nPay) {
		  
		int intSw = 0;
		int nCount = 0;
		
		
		
		this.headerView(nPay);
		
		
		while(true) {
			
			// 화폐매수 계산을 수행하는 과정에서 nPay 값을 검사해 
			// 5원 미만으로 남으면 더이상 연산을 수행하지 마라
			
			if(nPay < 5) break;
		
			nCount = nPay / nMoney; // 매수계산
			nPay -= nCount * nMoney;  // nPay = nPay - nCount * nMoney
			
			System.out.printf("%8s원권 %4d매\n", paperForm.format(nMoney), nCount);
			
			
			/*
			 * intSw = 0; intSw = 1; 이런 코드는 알고리즘에서 불편한 코드
			 * V3 line31 참조
			 */
			
			if(intSw == 0) {
				nMoney /=5;  // nMoney = nMoney / 5
				intSw = 1;
			}else {
				nMoney /= 2; // nMoney = nMoney / 2
				intSw = 0;
			}
					
		} System.out.println("==================================");
		 
		 
	 }// end WhilePay()
	 
	 protected void headerView(int nPay) {
		 
		
		 String strPay = payform.format(nPay);
		
		 
		 System.out.println("==================================");
			System.out.printf("급여수령액 : %s\n" , strPay);
			 System.out.println("==================================");
			
		 
	 }
	
	
	
}
