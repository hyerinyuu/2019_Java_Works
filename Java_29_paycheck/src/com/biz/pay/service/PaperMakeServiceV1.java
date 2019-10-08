package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

/*
 * 한명의 급여액에 대한 화폐매수 계산하기
 * 계산결과를 List에 담기
 */
public class PaperMakeServiceV1 {

	// make에서 화폐매수를 계산한다음 결과를 담을 List 생성
	List<PaperVO> paperList;
	
	/*
	 * 외부에서 급여액을 매개변수로 주입받아
	 * 화폐 매수를 계산해서 List에 담기
	 */
	public List<PaperVO> getPaperList() {
		return this.paperList;
	}
	
	public void make(int pay) {
		
		// paperList를 사용하기 위해 인스턴스 생성
		paperList = new ArrayList<PaperVO>();
		int paper = 50000; // 화폐 권종
		int sw = 1;
		
		// 무한 반복문을 실행해서 화폐매수를 계산 수행
		while(true) {
			
			// pay가 0인 이후에도 나눗셈을 수행하면 오류나므로 break조건문을 걸어야함
			
			if(pay < 5) break;
			// 1. paper액면가에 대한 화폐매수를 계산
			// pay에 포함된 paper의 매수를 paperCount(화폐 매수)에 담기
			int paperCount = (int)(pay / paper);
			
			// 최초 pay에서 액면가를 계산한 후 액면가 금액 만큼을 삭제해서 
			// 이후 액면가 매수를 계산
			pay -= (paper * paperCount);
			
			// PaperVO에 일단 담기
			PaperVO pVO = new PaperVO();
			
			pVO.setPaper(String.valueOf(paper)); // 화폐 권종
			pVO.setCount(paperCount); // 화폐 매수
			
			// pVO를 paperList에 담기
			paperList.add(pVO);
			
			// 최초에 5만원, 1만원 5천원 순서로 액면가를 계산하고
			// 각 액면가에 대한 매수를 계산해야하기 때문에
			// paper변수를 5만원에서 1만원 되도록 계산 수행
			if(sw > 0) {
				paper /= 5;
			}else {
				paper /= 2;
			}
			sw *= (-1);
			
			
			
		}
		
		
		
		
	}
	
	
}
