package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;
import com.biz.pay.domain.PayVO;

public class PaperPrintServiceV1 {

	PayVO vo = new PayVO();
	int pay = vo.getPay();	
	String num = vo.getNum();
	
	public void print(List<PaperVO> paperList) {
		for(PaperVO vo : paperList) {
			System.out.println(vo.getPaper() + "\t" + vo.getMoney());
		}
	}
	
	public List<PayVO> print() {
		
		List<PayVO> payList = new ArrayList<PayVO>();
		PaperMakeServiceV2 pm = new PaperMakeServiceV2();
			
		for(PayVO pay : payList) {
			
			
			
			
		}
		return payList;
		
	}
	
	
}
