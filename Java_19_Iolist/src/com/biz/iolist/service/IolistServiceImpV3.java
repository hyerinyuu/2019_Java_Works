package com.biz.iolist.service;

import com.biz.iolist.domain.IolistVO;

public class IolistServiceImpV3 extends IolistServiceImpV2 {

	public void list() {
		this.list_header();
		
		int intInTotal = 0; // 매입금액 합계
		int intOutTotal = 0; //매출금액 합계
		
		for(IolistVO vo : ioList) {
			System.out.print(vo.getStrDate() + "\t");
			System.out.print(vo.getStrPname() + "\t");
			
			/*
			 * 만약 vo 설계단계에서 io 구분자 저장 변수를 int형으로 만들었다면
			 * 파일에서 데이터를 읽어 들이는 부분에서
			 * Integer.valueof() method로 한번만 변환을 시키면
			 * 이후 다른 부분에서는 부담없이 사용할 수 있었을 것이다.
			 * 
			 * 하지만, 지금은 io구분자를 쉽게 쓰기 위해
			 * int 형으로 변환시키는 코드가 곳곳에 산재하게 되었다.
			 * 이런 경우를 설계미스로 인한 비용증가라고 한다.
			 */
			int intIO = Integer.valueOf(vo.getStrIO());
			// if(vo.getStrIO().equals("1"));
		
			int intIPrice = 0;
			int intOPrice = 0;
			
			
			
			String strIoTitle = "매출";
			
			if(intIO == 1) {
				intIPrice = vo.getIntPrice();
				strIoTitle = "매입";
			}else {
				intOPrice = vo.getIntPrice();
			}
			System.out.print(strIoTitle + "\t");
			System.out.print(vo.getIntPrice() + "\t");
			System.out.print(vo.getIntQty() + "\t");
			
			int intITotal = intIPrice * vo.getIntPrice();
			int intOTotal = intOPrice * vo.getIntPrice();
			
			System.out.printf("%8d\t", intIPrice * vo.getIntQty());
			System.out.printf("%8d\n", intOPrice* vo.getIntQty());
			
			System.out.printf("%8d\t", intITotal);
			System.out.printf("%8d\t", intOTotal);
			
			intInTotal += intITotal;
			intOutTotal += intOTotal;
		}
		System.out.println("=====================================================================================");
		System.out.printf("합계\t\t\t\t\t%15d\t%15d\n",  intInTotal, intOutTotal);
		System.out.println("=====================================================================================");
		
		
	}
	
	protected void list_header() {

		System.out.println("=====================================================================================");
		System.out.println("거래일자\t상품명\t\t구분\t단가\t수량\t매입금액\t매출금액");
		System.out.println("-------------------------------------------------------------------------------------");
	}
	
	public void total() {
		
		int intInTotal = 0; // 매입금액 합계
		int intOutTotal = 0; //매출금액 합계
		
		
	
		
	}
	
}
