package com.biz.pay;

import com.biz.pay.Service.PayServiceV5;

public class PaymentEx_05 {

	public static void main(String[] args) {

		PayServiceV5 ps = new PayServiceV5();
		
		int nPay = 3929390;
		
		 ps.array(nPay);
		// ps.whilePay(nPay);
		
		ps.forPay(nPay);
	}

}
