package com.biz.iolist.service;

public interface IolistService {

	// [설계]

	
	// 판매정보입력(1개의 데이터)
	// 거래일자, 거래시각, 상품이름, 단가, 수량
	public void input();
	
	
	// 다수의 데이터 연속 입력
	// 데이터의 개수를 지정하여 처리하는 method()
	public void input(int count);
	
	
	// 판매금액(intTotal)
	public void total();
	
	
	// 판매 정보 리스트 보기
	public void list();
	
	
	// 판매정보 1개의 리스트 보기
	public void view();
	
	
}
