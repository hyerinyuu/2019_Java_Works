package com.biz.pay.exec;

import java.util.List;

import com.biz.pay.service.PayReadServiceV1;

public class PayEx_01 {

	public static void main(String[] args) {

		// pay.txt를 읽기위해 payFile선언
		String payFile  = "src/com/biz/pay/pay.txt";
		
		PayReadServiceV1 pr = new PayReadServiceV1();
		
		try {
			// 여기까지 하면 내부에서 pay.txt파일을 읽어서 payStrList를 생성해 둘것이다.
			pr.readPay(payFile);
			
			// payStrList를 getter을 통해 가져와서 payStrList에 담기
			List<String> payStrList = pr.getPayStrList();
			
			// payStrList에 제대로 담겼는지 확인
			for(String str : payStrList) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
