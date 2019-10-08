package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperMakeServiceV2 {

	private List<PaperVO> paperList;
	
	// 외부에서  paperList를 가져가도록 열어주는 통로
	public List<PaperVO> getPaperList(){
	
		paperList = new ArrayList<PaperVO>();
		return paperList;
		
	} 
	
	public void make(int pay) {
		
		paperList = new ArrayList<PaperVO>();
		
		int money = 50000;	// 화폐 권종
		int paper = 0; // 화폐 매수
		int sw = 1;
		
		while(true) {
			
			if(pay < 5) break;
			paper = (int)(pay / money);
			
			// 생성자 method에 필드 세팅값을 주입하면서
			// 객체 인스턴스를 생성
			// money는 int형으로 선언 됐으므로 ""를 더해줘서 String형으로 변경 == money + "";
			PaperVO pVO = new PaperVO(money + "", paper);
			//	pVO.setMoney(String.valueOf(money));
			// pVO.setPaper(paper);
			paperList.add(pVO);
			
			System.out.printf("%d원권 : %02d\n", money, paper);
			
			pay -= paper * money;
			if(sw > 0) {
				money /= 5;
			}else{
				money /= 2;
			}
			sw *= (-1);
			
		}
		
	
	}
}	
	