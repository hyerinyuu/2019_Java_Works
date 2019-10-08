package com.biz.pay.Service;

/*
 * whiled의 if조건을 제거하고 while문만을 이용한 방법
 */
public class PayServiceV4 extends PayServiceV2 {

	@Override
	public void whilePay(int nPay) {
		
		this.headerView(nPay);
		int intSw = 1;
		
		// while(참인조건) {}
		//  ==> 조건이 참인동안 {}코드를 실행하라		
		
		/*
		 * 조건문(if while for)을 코딩할 때
		 * 부등호(<,>)와 EQ(=)를 같이 사용해야할 조건문을
		 * 부등호만 사용해서 만들 수 있다면
		 * 부등호만 사용해서 코딩 권장(논리상 오류를 줄여줌)
		 */
		// while(nPay >= 5) == while(nPay > 1) 
		while(nPay > 1) {  // ==>  nPay가 5원일경우 수행됨
		
			// if(nPay < 5) break;  ==> nPay가 5원일경우 수행됨
		
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
