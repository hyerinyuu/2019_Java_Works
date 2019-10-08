package com.biz.iolist.service;

/*
 * 매일매출정보.txt로부터 매입매출정보 읽어오기
 * '구분'에 따라 매입인지 매출인지 구분해 매입금액, 매출금액 계산하기
 * 리스트보이기
 */
public interface IolistService {

	public void read(String fileName) throws Exception;
	public void list();
	
	public void summery();
	
	
}
