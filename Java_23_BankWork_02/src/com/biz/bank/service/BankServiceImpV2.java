package com.biz.bank.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankServiceImpV2 extends BankServiceImpV1 {

	
	private String bookFile;

	@Override
	public void output() throws Exception {
		// TODO (키보드에서 입력받아)출금처리
	
		if(bookVO == null) return;
		
		System.out.print("출금액 >> ");
		String strOutPut = scanner.nextLine();
		int intOutPut = Integer.valueOf(strOutPut);
		
		if(intOutPut < 0) {
			System.out.println("출금액은 0원 이상이어야합니다.");
			return;
		}
		
		int intBalance = bookVO.getBalance();
		if(intBalance < intOutPut ) {
			System.out.println("잔액이 부족해 출금이 불가능합니다.");
			return;
		}
		bookVO.setBalance(intBalance - intOutPut);
		System.out.println("출금처리완료");
		System.out.println("현재잔액 : " + intBalance);
		
		// 거래일자, 구분 설정
		// java 1.8에서 새롭게 등장한 날짜 클래스
		// Date클래스에서 발생한 여러 날짜관련 이슈가 상당부분 해소된 새 클래스
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String lastDate = localDate.format(df);
		
		bookVO.setLastDate(lastDate);
		bookVO.setRemark("출금");
		
		this.bookWrite(bookFile);
		
		
		
		
	}
	
}
