package com.biz.pay.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;
import com.biz.pay.service.PaperWriterServiceV1;

public class PayEx_04 {

	public static void main(String[] args) throws Exception {
		
		String fileName = "src/com/biz/pay/domain/화폐매수.txt";
		PaperWriterServiceV1 pw = new PaperWriterServiceV1();
		List<PaperVO> paperList = new ArrayList<PaperVO>();
		pw.print(paperList, fileName);
		
		
	}

}
