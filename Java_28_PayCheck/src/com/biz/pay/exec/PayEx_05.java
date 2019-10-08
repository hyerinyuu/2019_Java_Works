package com.biz.pay.exec;

import java.util.List;

import com.biz.pay.domain.PayVO;
import com.biz.pay.service.PaperPrintServiceV1;
import com.biz.pay.service.PaperReadServiceV1;

public class PayEx_05 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/pay/domain/pay.txt";
		
		PaperReadServiceV1 pr = new PaperReadServiceV1();
		PaperPrintServiceV1 pp = new PaperPrintServiceV1();
		
		try {
			pr.read(fileName);
			List<String> payList = pr.getPayList();
			pp.print();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
