package com.biz.pay;

import com.biz.pay.Service.PayServiceV1;

public class Payment_011 {

	public static void main(String[] args) {

		/*
		 * [지폐 매수 계산하기]
		 * 화폐권종을 배열로 선언해서 계산하는 법
		 * 
		 * 1. 화폐 권종이 불규칙적인 경우에 사용하는 방법
		 */
		
		int pay = 3785870;
		PayServiceV1 ps = new PayServiceV1();
		
		ps.array(pay);
			
		
		
		
		}
 		
		
		
	}


