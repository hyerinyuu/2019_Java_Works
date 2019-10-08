package com.biz.iolist.service;

import com.biz.iolist.model.IolistVO;

/*
 * IolistServiceImpV2가 
 * IolistServiceImpV1을 상속받음
 */
public class IolistServiceImpV2 extends IolistServiceImpV1 {

	/*
	 * ImpV1에 이미 작성된 list() method를 Override(재정의) 하였다.
	 *  ==>  
	 */
	@Override
	public void list() {
		
		/* 
		 * VAT 별도금액 : 공급가액
		 * VAT : 세액(VAT)
		 * 공급가액+세액 : 공급대가
		 */
		
		System.out.println("=====================================================");
		System.out.println("판매리스트");
		System.out.println("=====================================================");
		System.out.println("상품이름\t 단가\t   수량\t공급가액   부가세\t공급대가");
		System.out.println("-----------------------------------------------------");
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrPname() + "\t");
			System.out.printf("%5d\t", vo.getIntPrice());
			System.out.printf("%5d\t", vo.getIntQty());
			
			// amt(부가세별도 금액) : 일반 가격을 1.1로 나눈 값
			// 부가세 : 일반금액 - 부가세별도금액
			
			int amt = (int)(vo.getIntTotal() / 1.1);
			int vat = vo.getIntTotal() - amt;
			
			System.out.printf("%5d\t", amt);
			System.out.printf("%8d\t", vat);
			System.out.printf("%5d\n", vo.getIntTotal());
		}
		
		
	
	
	}

	
	
	
}
