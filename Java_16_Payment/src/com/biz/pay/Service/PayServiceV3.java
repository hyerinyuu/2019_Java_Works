package com.biz.pay.Service;

	// V2의 whilePay가 맘에 안들어서 다시 정의해서 사용하는 법

public final class PayServiceV3 extends PayServiceV2{

		//array(int pay)
		// whilePay(int pay)
	
	@Override
	public void whilePay(int nPay) {
		
		this.headerView(nPay);
		int intSw = 1;
		
		// while(참인조건) {}
		//  ==> 조건이 참인동안 {}코드를 실행하라		
		while(true) {
		
			if(nPay < 5) break;
			
		
			int nCount = nPay / nMoney; // 매수계산
			nPay -= nCount * nMoney;  // nPay = nPay - nCount * nMoney
			
			System.out.printf("%8s원권 %4d매\n", paperForm.format(nMoney), nCount);
			
			
			if(intSw == 1) {
				nMoney /=5;  // nMoney = nMoney / 5
			}else {
				nMoney /= 2; // nMoney = nMoney / 2
			}
			intSw = intSw * (-1);
					
		} System.out.println("==================================");
		 
			
		}
	}

	
	
	
	
	
	

